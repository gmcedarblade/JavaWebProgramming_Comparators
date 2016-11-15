<!DOCTYPE html>
<%@page import="java.io.File"%>
<%@page import="edu.cvtc.web.util.WorkbookUtility"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.cvtc.web.model.Person"%>
<%@page import="java.util.List"%>
<html>
<head>
	<title>Java Web Programming: View All</title>
	<meta name="description" content="This is a JSP example that demonstrates how to build a dynamic website using JSPs.">
	<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
	
	<div class="hero-unit">
		<h1>Student Roster</h1>
	</div>
	
	<%@ include file="includes/navigation.jsp" %>
	
	<div class="container">
	
		<%
		List<Person> people = new ArrayList<>();
		final String filePath = session.getServletContext().getRealPath("/assets/JavaWebProgramming.xlsx");	
		final File inputFile = new File(filePath);
		people = WorkbookUtility.retrievePeopleFromWorkbook(inputFile);
		
		/**
		* If the sortType is "age", then use an AgeComparator.
		* If the sortType is "lastName", then use a LastNameComparator.
		*/
		
		final String sortType = request.getParameter("sort");
		
		if (null != sortType) {
			
			
			
		}
		
		for(final Person person : people) {
			// Create a new HTML div with a h2 header for the Person's name
			// and a paragraph for the details about that Person.
			%>
			<div class="span4">
				<h2><%=person.getFirstName() %> <%=person.getLastName() %></h2>
				<p><%=person.getFirstName() %> <%=person.getLastName() %> is <%=person.getAge() %> years old.
				<%=person.getFirstName() %>'s favorite color is <%=person.getFavoriteColor() %>.</p>
			</div>
			<%
		}
		%>
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>