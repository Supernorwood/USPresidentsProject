<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Filtered List of Presidents</title>
	</head>
	<body>
	
	
		<form action="select.do" method="POST">
			Placeholder for number selection
		
		</form>
	
		<form action="select.do" method="GET">
			<select name="filter">
				<option value="Democrat">Democrat</option>
				<option value="Democratic-Republican">Democratic-Republican</option>
				<option value="Federalist">Federalist</option>
				<option value="Independent">Independent</option>
				<option value="Republican">Republican</option>
				<option value="Whig">Whig</option>
			</select>
			<input type="Submit">
		</form>
		
		<c:choose>
			<c:when test="${not empty filteredList}">
				<c:forEach var="president" items="${filteredList}">
					<ul>
						<li><img src="${president.imageFile}"></li>
						<li>Name: ${president.name}</li>
						<li>Party: ${president.party}</li>
						<li>Term: ${president.termNumber}</li>
						<li>Dates: ${president.datesInOffice}</li>
						<li>Fact: ${president.interestingFact}</li>
					</ul>
					<hr>
				</c:forEach>
			</c:when>
			<c:when test="${president != null}">
				<h1>Placeholder for carousel display!</h1>
			</c:when>
			<c:otherwise>
				<h1>Please select a president to the right.</h1>
			</c:otherwise>
		
		
		</c:choose>
	</body>
</html>