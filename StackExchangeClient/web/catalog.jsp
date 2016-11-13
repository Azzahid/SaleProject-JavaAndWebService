<%@page import="java.util.Locale"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.marketplace.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Catalog</title>
        <link rel="stylesheet" type ="text/css" href="css/catalog.css">
        <link rel="stylesheet" type ="text/css" href="css/style.css">
        <link rel="stylesheet" type ="text/css" href="css/header.css">
        <link rel="stylesheet" type ="text/css" href="css/products.css">
    </head>
    <body class="body-center helvetica">
        <jsp:include page="header.jsp" />
        <!-- bar question -->
        <div class = "border-bottom ">
                <h2>What are you going to buy today ?</h2>
        </div>
        <!-- search form -->
        <form action="" method="get">
            <input type="hidden" name="id_active"  />
            <div class="overflow margin10">
                <input type ="text" id="searchbar" name="search" 
                placeholder="Search catalog ...">
                <button type = "submit" id="gobutton" class="bluebox">GO</button>
            </div>
            <div class="overflow">
                <div class="floatl">by :</div>
                <div class="floatl">
                    <input type ="radio" name = "option" value=0 checked>
                    <label for="option"><span><span></span></span>product</label>
                    <br>
                    <input type ="radio" name = "option" value=1>
                    <label for="option"><span><span></span></span>store</label>
                </div>
            </div>
        </form>
        <!--BagianProduk rencananya pake PHP di echo satu-satu-->
        <div id = "search">
                <%-- start web service invocation --%><hr/>
    <%
        try {
            com.marketplace.Marketplace_Service service = new com.marketplace.Marketplace_Service();
            com.marketplace.Marketplace port = service.getMarketplacePort();
            // TODO process result here
            java.util.List<com.marketplace.Product> result = null;
            
            if(request.getParameter("search")!=null){
                result = port.searchProduct(request.getParameter("search"), Integer.parseInt(request.getParameter("option")));
            }else{
                result = port.getAllProduct();
            }
            if(result != null && result.size()>0){
                SimpleDateFormat ft = new SimpleDateFormat("E, dd M yyyy");
                SimpleDateFormat tt = new SimpleDateFormat("HH.mm");
                for(int i =0; i<result.size();i++){
                    Product temp = result.get(i);
                    Date datetemp = temp.getCreatedAt().toGregorianCalendar().getTime();
                    int totallike = port.getLike(temp.getPId());
                    int status = port.getLikeStatus(temp.getPId(), 7);
                    int totalpurchase = port.getTotalPurchase(temp.getPId());
                    out.print("<div class = 'product'>");
                            out.print("<div>"
                                    +   "<div class='product-date'>"+ft.format(datetemp)+"</div>");
                                    out.print("<div class='product-time'>added this on "+tt.format(datetemp)+"</div>"
                                    + "</div>");
                            out.print("<img src='/StackExchangeClient/PhotoGenerator?id="+temp.getPId()+"&pilihan=2'"+"' alt='product-image' width='100px' height='100px'>");
                            out.print("<div class = 'product-center-description'>"
                                        + "<span class='product-name'>"+temp.getNamaProduk()+"</span><br />"
                                        + "<span class='product-price'>IDR "+NumberFormat.getNumberInstance(Locale.US).format(Integer.parseInt(temp.getPrice()))+"</span><br />"
                                        + "<span class='product-desc'>"+temp.getDescription()+"</span><br />"
                                    + "</div>");
                            out.print("<div class='product-right-description'>"
                                    + "<div class = 'margin-top'>"
                                    +   "<span class='product-desc' id = '"+temp.getPId()+"-num'>"+"</span>"
                                    +   "<span class='product-desc'>"+totallike+" Likes</span>"
                                    +   "<div class='product-desc'>"+totalpurchase+" purchases</div>"
                                    + "</div>"
                                    + "<div class = 'margin-top'>"
                                    + "<button class = '");
                            if(status == 0){
                                    out.print("color-blue");
                            }else{
                                    out.print("red");
                            }  
                            out.print(" like font-bold' id ='"+temp.getPId().toString()+"' >");//onclick = 'like(this.id,"+")'>");
                            if(status == 0){
                                    out.print("LIKE");
                            }else{
                                    out.print("LIKED");
                            }  
                            out.print("</button>"
                                    + "<a class='link color-green font-bold' href ='confirmation_purchase.php?id_active="+"1"+"&id_product="+"5'>"
                                    + "<span >BUY</span></a>"
                                + "</div>"
                            + "</div>"
                            + "<hr class='full' />"
                        + "</div>");
                }
            }else{
                out.print("Product Not Found");
            }
        } catch (Exception ex) {
            out.println("Result = "+ex);
        }
    %>
    <%-- end web service invocation --%><hr/>

        </div>
        <script type="text/javascript" src="js/catalog.js"></script>
    </body>
</html>
