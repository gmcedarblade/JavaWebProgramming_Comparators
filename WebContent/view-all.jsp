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
	
		<c:choose>
			<c:when test="empty ${people}">
				<p>Sorry the list of people is empty.</p>
			</c:when>
			<c:otherwise>
				<c:forEach var="person" items="${people}">
					<div class="span4">
						<h2>${person.firstName} ${person.lastName}</h2>
						<p>${person.firstName} ${person.lastName} is ${person.age} years old.
							${person.firstName}'s favorite color is ${person.favoriteColor}.
						</p>
					</div>
				</c:forEach>
			</c:otherwise>
		</c:choose>
		
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>