<%-- 
    Document   : purchase
    Created on : Nov 7, 2016, 9:11:48 PM
    Author     : user-BL
--%>

<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.marketplace.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%
        if("POST".equalsIgnoreCase(request.getMethod())) {
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
        }
    
    %>
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
                   <%-- start web service invocation --%><hr/>
    <%
    try {
	com.marketplace.Marketplace_Service service = new com.marketplace.Marketplace_Service();
	com.marketplace.Marketplace port = service.getMarketplacePort();
	 // TODO initialize WS operation arguments here
	int userid = 7;
	// TODO process result here
	java.util.List<com.marketplace.Purchase> result = port.getProductPurchase(userid);
        SimpleDateFormat ft = new SimpleDateFormat("E, dd M yyyy");
        SimpleDateFormat tt = new SimpleDateFormat("'at 'HH.mm");
	if(result != null && result.size()>0){
            for(int i =0; i<result.size();i++){
                Purchase temp = result.get(i);
                Date datetemp = temp.getCreatedAt().toGregorianCalendar().getTime();
                out.println("<div class = 'product'>");
                    out.println("<span class='product-date'>"+ft.format(datetemp)+"</span><br />");
                    out.println("<span class = 'product-time'>"+tt.format(datetemp)+"</span>");
                    out.println("<hr />");
                    out.println("<img src='/StackExchangeClient/PhotoGenerator?id="+temp.getPurchaseId()+"&pilihan=1' alt='product-image' width='100px' height='100px'>");
                    out.println("<div class='product-center-description'>");
                        out.println("<span class='product-name'>"+temp.getProductName()+"</span><br />");
                        out.println("<span class= 'product-price'>IDR "+NumberFormat.getNumberInstance(Locale.US).format(Integer.parseInt(temp.getProductPrice())*temp.getQuantity())+"</span><br />");
                        out.println("<span class='product-price'>"+temp.getQuantity()+" pcs</span><br />");
                        out.println( "<span class='product-price'>@IDR "+NumberFormat.getNumberInstance(Locale.US).format(Integer.parseInt(temp.getProductPrice()))+"</span><br />");
                    out.println("</div>");
                    out.println("<div class='product-right-description'>");
                        out.println("<div class='margin-top'>");
                            out.println("<span class='product-desc'>Delivery to </span>");
                            out.println("<span class='product-desc'><b>"+temp.getConsignee()+"</b></span><br />");
                            out.println("<span class='product-desc'>"+temp.getFulladdress()+"</span><br />");
                            out.println("<span class='product-desc'>"+temp.getPostalcode()+"</span><br />");
                            out.println("<span class='product-desc'>"+temp.getPhonenumber()+"</span><br />");
                        out.println("</div>");
                    out.println("</div>");
                    out.println("<div class='product-center-description margin-top'>");
                        out.println("<span class='product-bottom-desc '>bought from ");
                        out.println("<b>"+temp.getSellerId()+"</b><span>");
                    out.println("</div>");
                out.println("</div>");
            }
        }else{
            out.println("You haven't purchased anything");
        }

    } catch (Exception ex) {
	out.println("Error:"+ex);
    }
    %>
    <%-- end web service invocation --%><hr/> 
        </div>
        <script type="text/javascript" src="js/catalog.js"></script>
    
    </body>
</html>
