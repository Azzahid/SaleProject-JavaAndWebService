<%-- 
    Document   : addProduct
    Created on : Nov 7, 2016, 8:53:17 PM
    Author     : user-BL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product</title>
        <link rel="stylesheet" type ="text/css" href="css/style.css">
        <link rel="stylesheet" type ="text/css" href="css/header.css">
        <script src="catalog.js"></script>
    </head>
    <body class="body-center helvetica">
        <jsp:include page="header.jsp" />    
        <div class = "border-bottom ">
            <h2>Please add your product here</h2>
        </div>
        <form method="POST" name="addForm" id="addForm" onsubmit="return validateform()" action= "" enctype="multipart/form-data">	
            <span class="font-small">Name</span><br><input type="text" id="productName" name="productName" class="input-text" /><br>
            <span class="font-small">Description (max 200 chars)</span><br><textarea id="productDescription" name="productDescription" rows="4" cols="50" class="input-textarea"></textarea><br>
            <span class="font-small">Price (IDR)</span><br><input type="text" id="productPrice" name="productPrice" class="input-text" /><br>
            <span class="font-small">Photo</span><br><input type="file" id="fileToUpload" name="fileToUpload" /><br><br>
            <a href="catalog.jsp" class="cancel-button float-right">CANCEL</a>

            <input type="submit" value="ADD" name="addsubmit" class="button float-right" >
        </form>
        <script src = "js/addProduct.js"></script>
    </body>
</html>

