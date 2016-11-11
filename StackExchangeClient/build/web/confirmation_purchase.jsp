<%-- 
    Document   : confirmation_purchase
    Created on : Nov 7, 2016, 8:59:31 PM
    Author     : user-BL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmation Purchase</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/header.css">
    </head>
    <body class="body-center helvetica">
        <div>
            <jsp:include page="header.jsp" />  
            <div class = "border-bottom ">
                <h2>Please confirm your purchase</h2>
            </div>

            <form method="post" id="purchase_form">
                <span id="product_price" value=""></span>
                <input type="hidden" name="id_product" value="">
                <input type="hidden" name="id_active" value="">
                <input type="hidden" name="product_name" value="">
                <input type="hidden" name="product_description" value="">
                <input type="hidden" name="product_price" value="">
                <input type="hidden" name="seller_id" value="">
                <p>Product : </p>
                <p>Price : IDR </p>
                <p>Quantity :
                    <input type="text" name="quantity" value="1" onkeyup="updateTotalPrice()" id="quantity">
                    pcs
                </p>
                <p>Total Price : IDR <span id="total_price"></span></p>
                <p>Delivery to :</p>
                <div>
                    <label for="consignee">Consignee</label><br />
                    <input type="text" name="consignee" id="consignee" value="" class="input-text">
                </div>
                <div>
                    <label for="full_address">Full Address</label><br />
                    <textarea name="full_address" rows="5" cols="50" id="full_address" class="input-textarea	"></textarea>
                </div>
                <div>
                    <label for="postal_code">Postal Code</label><br />
                    <input type="text" name="postal_code" id="postal_code" value="" class="input-text">
                </div>
                <div>
                    <label for="phone_number">Phone Number</label><br />
                    <input type="text" name="phone_number" id="phone_number" value="" class="input-text">
                </div>
                <div>
                    <label for="credit_card">12 Digits Credit Card Number</label><br />
                    <input type="text" name="credit_card" id="credit_card" class="input-text">
                </div>
                <div>
                    <label for="card_verification">3 Digits Card Verification Value</label><br />
                    <input type="text" name="card_verification" id="card_verification" class="input-text">
                </div>
                <div>
                    <a href="catalog.jsp" class="cancel-button float-right">CANCEL</a>

                    <input type="button" value="CONFIRM" onclick="getConfirmation();" class="button float-right">
                </div>
            </form>
        </div>
    </body>

    <script type="text/javascript" src="js/confirmation_purchase.js"></script>
</html>
