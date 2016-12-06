<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Java Web Programming: View All</title>
	<meta name="description" content="This is a JSP example that demonstrates how to build a dynamic website using JSPs.">
	<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
	
	<div class="hero-unit">
		<h1>Person Search</h1>
	</div>
	
	<jsp:include page="includes/navigation.jsp"></jsp:include>
	
	<div class="container">
	
		<jsp:include page="includes/people-view.jsp"></jsp:include>
		
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>