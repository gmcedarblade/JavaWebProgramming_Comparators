<!DOCTYPE html>
<html>
<head>
	<title>Java Web Programming: Populate Database</title>
	<meta name="description" content="This is a JSP example that demonstrates how to populate a database.">
	<%@ include file="includes/styles.jsp" %>
</head>
<body>
	<div class="hero-unit">
		<h1>Person Search</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>
	<div class="container">
		<%
	 	// TODO use a DAO to populate the database. Then present a 'success' message if the database 
	 	// is populated correctly, and an 'error' message if not.
		%>
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>