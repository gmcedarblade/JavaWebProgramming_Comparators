<!DOCTYPE html>
<html>
<head>
	<title>Java Web Programming: Error Page</title>
	<meta name="description" content="This is a JSP example that demonstrates an error page we can send users to via the RequestDispatcher when the application encounters an error.">
	<%@ include file="includes/styles.jsp" %>
</head>
<body>
	<div class="hero-unit">
		<h1>Error</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>
	<div class="container">
		<p>${error}</p>
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>