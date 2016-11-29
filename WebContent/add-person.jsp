<!DOCTYPE html>
<html>
<head>
	<title>Java Web Programming: Add New Person</title>
	<meta name="description" content="This is a JSP example that demonstrates how to use a form to add a new Person object to the database.">
	<%@ include file="includes/styles.jsp" %>
</head>
<body>
	<div class="hero-unit">
		<h1>Add Person</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>
	<div class="container">
		<form action="addPerson" method="post">
			<div class="form-group">
				<label for="firstName"><strong>First Name:</strong></label>
				<input name="firstName">
				
				<label for="lastName"><strong>Last Name:</strong></label>
				<input name="lastName">
				
				<label for="age"><strong>Age:</strong></label>
				<input name="age">
				
				<label for="favoriteColor"><strong>Favorite Color:</strong></label>
				<input name="favoriteColor">
				
				<input class="btn btn-primary btn-lg" type="submit" value="Add Person">
			</div>
		</form>
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>