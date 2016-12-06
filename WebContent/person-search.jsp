<!DOCTYPE html>
<html>
<head>
	<title>Java Web Programming: Person Search</title>
	<meta name="description" content="This is a JSP example that demonstrates how to use a form to search.">
	<%@ include file="includes/styles.jsp" %>
</head>
<body>
	<div class="hero-unit">
		<h1>Person Search</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>
	<div class="container">
		<form action="Search" method="post">
			<div class="form-group">
				<label for="firstName"><strong>Search by First Name:</strong></label>
				<input name="firstName">
				<input name="searchType" type="hidden" value="firstName">
				<input class="btn btn-primary btn-lg" type="submit" value="Search">
 			</div>
 		</form>
 		<form action="Search" method="post">
 			<div class="form-group">
				<label for="lastName"><strong>Search by Last Name:</strong></label>
				<input name="lastName">
				<input name="searchType" type="hidden" value="lastName">
				<input class="btn btn-primary btn-lg" type="submit" value="Search">
 			</div>
 		</form>
 		<form action="Search" method="post">
 			<div class="form-group">
				<label for="favoriteColor"><strong>Search by Favorite Color:</strong></label>
				<input name="favoriteColor">
				<input name="searchType" type="hidden" value="favoriteColor">
				<input class="btn btn-primary btn-lg" type="submit" value="Search">
 			</div>
 		</form>
 		<form action="Search" method="post">
 			<div class="form-group">
				<label for="age"><strong>Search by Age:</strong></label>
				<input name="age">
				<input name="searchType" type="hidden" value="age">
				<input class="btn btn-primary btn-lg" type="submit" value="Search">
 			</div>
		</form>
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>