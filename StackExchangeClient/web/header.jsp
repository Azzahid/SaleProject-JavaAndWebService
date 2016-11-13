<%@ page session="true" %>
<div class = "text-align-center arial">
    <h1><span class="color-red">Sale</span><span class="color-blue">Project</span></h1>
</div>
<p class="text-align-right">Hi, <%=session.getAttribute("username")%><br />
<a href="login.jsp" class="link color-red">logout</a></p>
<div>
    <ul>
        <li><a href="catalog.jsp"><span>Catalog</span></a></li>
        <li><a href="your_products.jsp"><span>Your Products</span></a></li>
        <li><a href="addProduct.jsp"><span>Add Product</span></a></li>
        <li><a href="sales.jsp"><span>Sales</span></a></li>
        <li><a href="purchases.jsp"><span>Purchases</span></a></li>
    </ul>
</div>