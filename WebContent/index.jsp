<!DOCTYPE html>
<html>
<head>
	<title>Java Web Programming: Index</title>
	<meta name="description" content="This is a JSP example that demonstrates how to build a Java Web Application.">
	<%@ include file="includes/styles.jsp" %>
</head>
<body>
	<div class="hero-unit">
		<h1>Welcome to Java Web Programming</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>
	<div class="container">
		<p>In this course we learn what it is like to be a Java Web Programmer.
		We will work with our Person spreadsheet again; this time to populate a database.</p>
		<p>If we need to populate (or re-populate) the database, <a href="populate-database.jsp">click here</a></p>
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>