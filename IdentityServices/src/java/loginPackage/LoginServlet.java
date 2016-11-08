/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author user-BL
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
        if(validate(user,pass)){
            // user exist
            out.println("ada");
        } else {
            // user doesn't exist
            out.println("tidak ada");
        }
    }
    
    public boolean validate(String uname, String pass){
        boolean st = true;
        try {
           //loading drivers for mysql
           Class.forName("com.mysql.jdbc.Driver");

           //creating connection with the database 
           Connection con=DriverManager.getConnection
                          ("jdbc:mysql://localhost:3306/t2_akun","root","");
           PreparedStatement ps =con.prepareStatement
                          ("SELECT username,password FROM user WHERE username = ? AND password = ?;");
           ps.setString(1, uname);
           ps.setString(2, pass);
           ResultSet rs = ps.executeQuery();
           st = rs.next();
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return st; 
    }
}
