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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.Random;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
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
        if(user != null && pass != null){
            if(validate(user,pass)){
                // user exist
                out.println("ada");
            } else {
                // user doesn't exist
                out.println("tidak ada");
            }
        }
    }
    
    public boolean validate(String uname, String pass){
        boolean st = true;
        try {
            //creating connection with the database 
           Connection con = DB.connect();
           if(con == null)
               return false;
           
           PreparedStatement ps =con.prepareStatement
                          ("SELECT username,password FROM user WHERE username = ? AND password = ?;");
           ps.setString(1, uname);
           ps.setString(2, pass);
           ResultSet rs = ps.executeQuery();
           st = rs.next();
        } catch( SQLException e) {
            System.out.println(e);
        }
        return st; 
    }
    
    public String getToken(){
        Random random = new SecureRandom();
        String token = new BigInteger(130, random).toString(32);
        
        return token;
    }
}
