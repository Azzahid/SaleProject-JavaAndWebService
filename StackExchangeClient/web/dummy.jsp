<%-- 
    Document   : dummy
    Created on : Nov 12, 2016, 8:45:34 PM
    Author     : user-BL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    session.setAttribute("token", request.getParameter("token"));
    session.setAttribute("username", request.getParameter("username"));
    session.setAttribute("userid", request.getParameter("userid"));
    //response.sendRedirect("http://localhost:8080/StackExchangeClient/catalog.jsp");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        Hello <b><%= request.getParameter("uname") %></b>!
        Hello <b><%= request.getParameter("token") %></b>!
        Hello <b><%= request.getParameter("userid") %></b>!
    </body>
</html>
