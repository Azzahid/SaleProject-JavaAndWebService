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

        </div>
        <script type="text/javascript" src="js/catalog.js"></script>
    </body>
</html>
