<%-- 
    Document   : your_products
    Created on : Nov 7, 2016, 9:14:36 PM
    Author     : user-BL
--%>

<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <title>Your Products</title>
        <link rel="stylesheet" type="text/css" href="css/products.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/header.css">
    </head>
    <body class="body-center helvetica">
        <jsp:include page="header.jsp" />
        <span id="id_active" value=""></span>
        <div class = "border-bottom ">
            <h2>What are you going to sell today?</h2>
        </div>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.marketplace.Marketplace_Service service = new com.marketplace.Marketplace_Service();
	com.marketplace.Marketplace port = service.getMarketplacePort();
	 // TODO initialize WS operation arguments here
	int buyerId = Integer.parseInt(request.getParameter("id_active"));
	int productId = Integer.parseInt(request.getParameter("id_product"));
	java.lang.String consignee = request.getParameter("consignee");
	java.lang.String fulladdress = request.getParameter("full_address");
	int quantity = Integer.parseInt(request.getParameter("quantity"));
	java.lang.String creditcardnumber = request.getParameter("credit_card");
	java.lang.String postalcode = request.getParameter("postal_code");
	java.lang.String phonenumber = request.getParameter("phone_number");
	java.lang.String cardVerification = request.getParameter("card_verification");
	// TODO process result here
	java.lang.Boolean result = port.confirmPurchase(buyerId, productId, consignee, fulladdress, quantity, creditcardnumber, postalcode, phonenumber, cardVerification);
	out.println("Result = "+result);
    } catch (Exception ex) {
	out.println("ex = "+ex);
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
    <script type="text/javascript" src="js/your_products.js"></script>
</html>
