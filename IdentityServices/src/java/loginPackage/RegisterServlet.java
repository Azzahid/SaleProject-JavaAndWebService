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

/**
 *
 * @author user
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        String full_name = request.getParameter("full_name");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String full_address = request.getParameter("full_address");
        String postal_code = request.getParameter("postal_code");
        String phone_number = request.getParameter("phone_number");
        response.setContentType("text/html;charset=UTF-8");
        
        // register new user
        String message = "";
        if(register(full_name, username, email, pass, full_address, postal_code, phone_number)) {
            message = "Registration success";
        }
        else {  // registration failed
            message = "Registration failed";
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
            out.println("<p>Message: " + message + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    public boolean register(String full_name, String username, String email, String pass, String full_address, String postal_code, String phone_number) {
        boolean success = false;
        try {
            //creating connection with the database 
           Connection con = DB.connect();
           if(con == null)
               return false;
           
           PreparedStatement ps =con.prepareStatement
                          ("INSERT INTO user (fullname, username, email, password, address, postalcode, phonenumber) "
                                  + "VALUES(?, ?, ?, ?, ?, ?, ?)");
           ps.setString(1, full_name);
           ps.setString(2, username);
           ps.setString(3, email);
           ps.setString(4, pass);
           ps.setString(5, full_address);
           ps.setString(6, postal_code);
           ps.setString(7, phone_number);
           ResultSet rs = ps.executeQuery();
           success = rs.next();
        } catch( SQLException e) {
            System.out.println(e);
        }
        return success;
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
