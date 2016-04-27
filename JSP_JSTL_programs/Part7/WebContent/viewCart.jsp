<%@page import="com.neu.beans.InitShoppingCart"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.*,java.util.Iterator" %>
<%@page import="com.neu.beans.ShoppingItem" %>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>ABC Shopping</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/simple-sidebar.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
    <jsp:declaration>ArrayList listofItems = new ArrayList();</jsp:declaration>
	<div id="wrapper">

		<!-- Sidebar -->
		<div id="sidebar-wrapper">
			<ul class="sidebar-nav">
				<li class="sidebar-brand"><a href="#"> ABC Shopping </a></li>
				<li><a href="index.jsp?type=book">Books</a></li>
				<li><a href="index.jsp?type=music">Music</a></li>
				<li><a href="index.jsp?type=computer">Computer</a></li>
				<li><a href="index.jsp?type=computer">View Cart</a></li>
			</ul>
		</div>
		<!-- /#sidebar-wrapper -->

		<!-- Page Content -->
		<div id="page-content-wrapper">
			<div class="container-fluid">
				<div class="page-header">

					<h1>
						My Shopping Cart <small><em>...Where you shop happiness</em></small>
					</h1>

				</div>
				<div class="row">
					<div class="col-lg-12">
					<form action="removefromcart.shop?action=remove" method="get">
						<table class="table" >
							<jsp:scriptlet>
							Set myCart ;
							float totalCost=0.0f;
							if(session.getAttribute("myCart") != null){
								myCart = (HashSet)session.getAttribute("myCart");
							}else{
								myCart = new HashSet();
							}
							for (Object o : myCart) {
								ShoppingItem item = (ShoppingItem)o;
							</jsp:scriptlet>
							<tr>
								<td><input type="checkbox" name="prodId" required value=<jsp:expression>item.getProductId()</jsp:expression> ></td>
								<td><jsp:expression>item.getProductId()</jsp:expression></td>
								<td><jsp:expression>item.getName()</jsp:expression></td>
								<td>$<jsp:expression>item.getPrice()</jsp:expression></td>
								<td><jsp:expression>item.getType()</jsp:expression></td>
								
							</tr>
							<jsp:scriptlet>
								totalCost += Float.parseFloat(item.getPrice());
							}
							</jsp:scriptlet>
							
							 <tr>
								<td colspan=2>Total Cost::</td><td >$<jsp:expression>totalCost</jsp:expression></td>
							</tr>
							<jsp:scriptlet>
							if(myCart.size() == 0){
							</jsp:scriptlet>
							<tr><td><H1>Sorry You have not selected any cart</H1></td></tr>
							<jsp:scriptlet>}else{</jsp:scriptlet>
							<input type="submit" class="btn btn-success"  value ="Remove From Cart" />
							<jsp:scriptlet>}</jsp:scriptlet>
							
							
						</table>
						</form>
						
					</div>
				</div>
			</div>
		</div>
		<!-- /#page-content-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

	<!-- Menu Toggle Script -->
	<script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>

</body>

</html>
