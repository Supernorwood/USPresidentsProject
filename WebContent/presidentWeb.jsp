<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<link rel="stylesheet" href="css/style.css">
<title>President</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<h2>Welcome to President Info</h2>
				<form action="select.do" method="POST">
					<input type="text" name="termNumber" /><br> <input type="submit" value="Submit" />

				</form>
				<form action="select.do" method="GET">
					<select name="filter">
						<option value="Democrat">Democrat</option>
						<option value="Democratic-Republican">Democratic-Republican</option>
						<option value="Federalist">Federalist</option>
						<option value="Independent">Independent</option>
						<option value="Republican">Republican</option>
						<option value="Whig">Whig</option>
					</select> <input type="Submit">
				</form>
			</div>


			<div class="col">
				<c:choose>
					<c:when test="${not empty filteredList}">
						<c:forEach var="president" items="${filteredList}">
							<img src="${president.imageFile}">
							<ul>
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
						<div id="myCarousel" class="carousel slide" data-ride="carousel">


							<!-- Wrapper for slides -->
							<div class="carousel-inner">


								<div class="item active">

									<img class="image" src="${president.imageFile}" alt="photo of president">
							<form action="select.do" method="POST">
								<c:choose>
									<c:when test="${president.termNumber == 1}">
										<!-- when at first president, disable previous button -->
										<button type="submit" class="carousel-control-prev carouselOverride" name="termNumber" value="${president.termNumber - 1}" role="button" data-slide="prev" disabled>
											<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span class="sr-only">Prev</span>
										</button>
									</c:when>
									<c:otherwise>
										<!-- otherwise enable it-->
										<button type="submit" class="carousel-control-prev carouselOverride" name="termNumber" value="${president.termNumber - 1}" role="button" data-slide="prev">
											<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span class="sr-only">Prev</span>
										</button>
									</c:otherwise>
								</c:choose>
								<c:choose>
									<c:when test="${president.termNumber == 45}">
										<!-- when at last president, disable next button -->
										<button type="submit" class="carousel-control-next carouselOverride" name="termNumber" value="${president.termNumber + 1}" role="button" data-slide="next" disabled>
											<span class="carousel-control-next-icon" aria-hidden="true"></span> <span class="sr-only">Next</span>
										</button>
									</c:when>
									<c:otherwise>
										<!-- otherwise enable it-->
										<button type="submit" class="carousel-control-next carouselOverride" name="termNumber" value="${president.termNumber + 1}" role="button" data-slide="next">
											<span class="carousel-control-next-icon" aria-hidden="true"></span> <span class="sr-only">Next</span>
										</button>
									</c:otherwise>
								</c:choose>
							</form>

								</div>
							</div>
						</div>
						<ul class="centerOverride">
							<li>Name: ${president.name}</li>
							<li>Party: ${president.party}</li>
							<li>Term: ${president.termNumber}</li>
							<li>Dates: ${president.datesInOffice}</li>
							<li>Fact: ${president.interestingFact}</li>
						</ul>
					</c:when>
					<c:otherwise>
						<h1>Please select a president to the right.</h1>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
</body>
</html>