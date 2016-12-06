<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
	<c:when test="${empty people}">
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