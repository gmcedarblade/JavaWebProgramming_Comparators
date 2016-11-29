<!DOCTYPE html>
<html>
<head>
	<title>Java Web Programming: Success Page</title>
	<meta name="description" content="This is a JSP example that demonstrates a success page we can send users to via the RequestDispatcher when the application encounters a success scenario.">
	<%@ include file="includes/styles.jsp" %>
</head>
<body>
	<div class="hero-unit">
		<h1>Success</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>
	<div class="container">
		<p>${success}</p>
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>