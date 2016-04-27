<%@page import="com.neu.beans.InitShoppingCart"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList,java.util.Iterator" %>
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
				<li><a href="viewCart.jsp">View Cart</a></li>
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
					<form action="addtocart.shop" method="get">
						<table class="table" >
							<jsp:scriptlet>
							listofItems = (ArrayList)InitShoppingCart.getAvailableItems();
							ArrayList selectedItemType = new ArrayList();
							String type= request.getParameter("type");
							for (Object o : listofItems) {
								ShoppingItem item = (ShoppingItem)o;
								if(item.getType().equalsIgnoreCase(type)){
									selectedItemType.add(item);
							</jsp:scriptlet>
							<tr>
								<td><input required type="checkbox" name="prodId" value=<jsp:expression>item.getProductId()</jsp:expression> ></td>
								<td><jsp:expression>item.getProductId()</jsp:expression></td>
								<td><jsp:expression>item.getName()</jsp:expression></td>
								<td>$<jsp:expression>item.getPrice()</jsp:expression></td>
								<td><jsp:expression>item.getType()</jsp:expression></td>
							</tr>
							
							<jsp:scriptlet>}
								}
							</jsp:scriptlet>
							<input type="submit" class="btn btn-success"  value ="Add to cart" />
							<jsp:scriptlet>
							if(selectedItemType.size() == 0){
							</jsp:scriptlet>
							<tr><td><H1>Sorry No Results Found!!! Please Select!!!</H1></td></tr>
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
