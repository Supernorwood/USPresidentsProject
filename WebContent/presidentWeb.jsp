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
		<div class="container">
			<div class="row">
				<div class="col-5"> 
					<h2>Welcome to President Info</h2>
					
					<form action="select.do" method="POST">
								<input type="text" name="termNumber" /><br>
								<input type="submit" value="Submit" />
								
					</form>
				</div>
				<div class="col-7">
					<c:choose>
						<c:when test="${president.name != null}">
							<ul>
								<li><img src="#">Placeholder for images</li>
								<li>Name: ${president.name}</li>
								<li>Party: ${president.party}</li>
								<li>Term: ${president.termNumber}</li>
								<li>Dates: ${president.datesInOffice}</li>
								<li>Fact: ${president.interestingFact}</li>
							</ul>
							
						
						
							<form action="select.do" method="POST">
								<table> <!-- logic to display buttons and disable invalid options -->
									<c:choose>
										<c:when test="${president.termNumber == 1}"> <!-- when at first president, disable previous button -->
											<input type="submit" name="termNumber" value="${president.termNumber - 1}" disabled>
										</c:when>
										<c:otherwise> <!-- otherwise enable it-->
											<input type="submit" name="termNumber" value="${president.termNumber - 1}">
										</c:otherwise>
									</c:choose>
									
									<c:choose>
										<c:when test="${president.termNumber == 45}"> <!-- when at last president, disable next button -->
											<input type="submit" name="termNumber" value="${president.termNumber + 1}" disabled>
										</c:when>
										<c:otherwise> <!-- otherwise enable it -->
											<input type="submit" name="termNumber" value="${president.termNumber + 1}">
										</c:otherwise>
									</c:choose>
								
								</table>
							</form>
					
														
						</c:when>
						<c:otherwise>
							Please select a president.
						</c:otherwise>
						
					
					
					
					
					</c:choose>
				</div>
			</div>
		</div>
	</body>
</html>