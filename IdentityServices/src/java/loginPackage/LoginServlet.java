/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.SecureRandom;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.Random;
import javax.servlet.http.Cookie;
import java.sql.Timestamp;
import java.util.Date;
/**
 *
 * @author user-BL
 */

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        if(user != null && pass != null && !user.equals("") && !pass.equals("")){
            try {
                //creating connection with the database 
                Connection con = DB.connect();
                PreparedStatement ps =con.prepareStatement
                              ("SELECT * FROM user WHERE username = ? AND password = ?;");
                ps.setString(1, user);
                ps.setString(2, pass);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){ 
                    // user exist, generate token
                    String token = getToken();
                    String username = rs.getString("username");
                    int uid = rs.getInt("id");
                    response.sendRedirect("http://localhost:8080/StackExchangeClient/dummy.jsp?"+
                            "token="+token+"&"+"uname="+username+"&"+"userid="+uid);
                } else {
                    // user doesn't exist
                    out.println("tidak ada");
                }
            } catch( SQLException e) {
                System.out.println(e);
            }
        }
    }
    
    public String getToken(){
        Random random = new SecureRandom();
        String token = new BigInteger(130, random).toString(32);
        
        return token;
    }
    
    public void insertTokenDB(String token, String username) throws SQLException{
        try {
            Connection con = DB.connect();
            Timestamp now = new Timestamp(new Date().getTime());
            Statement newPS = con.createStatement();
            newPS.executeUpdate("UPDATE user SET Token='"+token+"' ,createAt='"+now+"' WHERE username ='"+username+"'");
            con.close();
        } catch(Exception e) {
            System.err.println("Got an login exception!");
            System.err.println(e.getMessage());
        }
    }
}
