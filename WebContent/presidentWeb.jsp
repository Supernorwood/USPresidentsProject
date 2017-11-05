<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<!-- Required meta tags -->
	    <meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
	    <!-- Bootstrap CSS -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
	    <!-- my css -->
	    <link rel="stylesheet" href="css/styles.css">		
	    <title>President</title>
	</head>
	<body>
	
	
	
		<h2>Welcome to President Info</h2>
		
		<form action="select.do" method="POST">
					<input type="text" name="termNumber" /><br>
					<input type="submit" value="Submit" />
					
		</form>
		
		${name}  ${party} ${term} ${fact}
		
			
		<table border="0">
			<tr>
				<th>Term Number</th>
				<th>President Name</th>
		
			</tr>
			<tr>
				<td>${presidents.termNumber}</td>
				<td>${presidents.name}</td>
				
				
			</tr>
		</table>
			
			
			
			
	
	</body>
</html>