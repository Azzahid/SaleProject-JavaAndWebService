<%-- 
    Document   : purchase
    Created on : Nov 7, 2016, 9:11:48 PM
    Author     : user-BL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Sales</title>
        <link rel="stylesheet" type ="text/css" href="css/catalog.css">
        <link rel="stylesheet" type ="text/css" href="css/style.css">
        <link rel="stylesheet" type ="text/css" href="css/header.css">
        <link rel="stylesheet" type ="text/css" href="css/products.css">
    </head>
    <body class="body-center helvetica">
        <jsp:include page="header.jsp" />
        <!-- bar question -->
        <div class = "border-bottom ">
            <h2>Here are your purchases</h2>
        </div>
        <!-- search form -->
        <!--BagianProduk rencananya pake PHP di echo satu-satu-->
        <div id = "sales">
                
        </div>
        <script type="text/javascript" src="js/catalog.js"></script>
    </body>
</html>
