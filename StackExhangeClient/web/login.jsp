<%-- 
    Document   : login
    Created on : Nov 7, 2016, 12:32:00 PM
    Author     : user-BL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
	<link rel="stylesheet" type ="text/css" href="css/style.css">
    </head>
    <body class="body-center helvetica">
	<div class = "text-align-center arial">
            <h1><span class="color-red">Sale</span><span class="color-blue">Project</span></h1>
	</div>
	
	<div class = "border-bottom ">
            <h2>Please login</h2>
	</div>
	
	<div>
            <form method="POST" action="">
                <span class="font-small">Email or Username</span><br><input type="text" name="username" class="input-text">
                <span class="font-small">Password</span><br><input type="password" name="password"  class="input-text"><br><br><br>
                <input type="submit" value="LOGIN" name="login" class="float-right button">
            </form>
	</div>	
	<br><br><br>
	<p class="font-small"><strong>Don't have an account yet? Register <a href = "register.jsp" class="link"> here </a></strong></p>
</body>
</html>
