<!DOCTYPE html>
<%@page import="edu.cvtc.web.dao.impl.PersonDaoImpl"%>
<%@page import="edu.cvtc.web.dao.PersonDao"%>
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
	 	
	 	try {
	 		
	 		final String filePath = session.getServletContext().getRealPath("/assets/JavaWebProgramming.xlsx");
	 		final PersonDao personDao = new PersonDaoImpl();
	 		
	 		personDao.populatePersonTable(filePath);
	 		
	 	} catch (final Exception e) {
	 		
	 		e.printStackTrace();
	 		%>
	 		<p>Error: Sorry, we were unable to populate the database at this time.</p>
	 		<%
	 		
	 	}
	 	
		%>
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>