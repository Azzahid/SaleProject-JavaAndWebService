<%-- 
    Document   : register
    Created on : Nov 7, 2016, 20:32:00 PM
    Author     : shirayuki97
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <link rel="stylesheet" type ="text/css" href="css/style.css">
    </head>
    <body class="body-center helvetica">
        <div class = "text-align-center arial">
            <h1><span class="color-red">Sale</span><span class="color-blue">Project</span></h1>
        </div>
        <div class = "border-bottom ">
            <h2>Please register</h2>
        </div>
        <form method="POST" action="" id="register" name="register">
            <div>
                <label for="full_name">Full Name</label><br />
                <input type="text" name="full_name" class="input-text">
            </div>
            <div>
                <label for="username">Username</label><br />
                <input type="text" name="username" class="input-text">
            </div>
            <div>
                <label for="email">Email</label><br />
                <input type="text" name="email" class="input-text">
            </div>
            <div>
                <label for="pass">Password</label><br />
                <input type="password" name="pass" class="input-text">
            </div>
            <div>
                <label for="confirm_pass">Confirm Password</label><br />
                <input type="password" name="confirm_pass" class="input-text">
            </div>
            <div>
                <label for="full_adress">Full Address</label><br />
                <textarea name="full_adress" rows="5" cols="50" class="input-textarea"></textarea>
            </div>
            <div>
                <label for="postal_code">Postal Code</label><br />
                <input type="text" name="postal_code" class="input-text">
            </div>
            <div>
                <label for="phone_number">Phone Number</label><br />
                <input type="text" name="phone_number" class="input-text">
            </div>
            <div>
                <input type="button" value="REGISTER" name="registerr" onclick="validateform();" class="button float-right">
            </div>
        </form>
        <br>
        <div>
            <p class="font-small"><strong>Already registered? Login <a href="login.jsp" class="link">here</a></strong></p>
        </div>
        <script src="js/register.js"></script>
    </body>
</html>