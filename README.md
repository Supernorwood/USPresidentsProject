# US Presidents Web App

## GIT MONEY
### Authors: Jacob Simms, Gregory Norwood, Jen Veigel, Alexis Low

### Project Overview
Created a Web Application that allows users to select and view information about US Presidents. When launched, the app brings up a welcome page that displays a form on the left of the page. This form prompts users to choose a president by term number or view by political party. Alternatively, users can click thru each president's information chronologically, using the "next" and "back" buttons.  

Once selected, each page displays a picture (or pictures) of the president, along with the president's name, dates in office, political party, and one (completely fabricated) interesting fact. The pictures are all stored in the WebContent file, while the information about the presidents is read in from a .txt file stored in WEB-INF. 

### Programming Languages Used
* Java
* HTML
* CSS
* JSP
	* EL
	* JSTL 

### Technologies and concepts implemented
- Amazon Web Services (AMS)
- Apache Tomcat Server
- Maven
- JEE Tools for deployment descriptor  
- .war file (Web Application Repository or Web ARchive)
- Model View Controller 
	- Model: Data Access Object (DAO) Pattern
	- View: JSP (bridge between Servlet and HTML)
	- Controller: Servlet (with doGet & doPost methods to handle requests/responses)
- Bootstrap

### The Struggles were Real
Though most of the functionality code was framed out and written before we left Friday evening, we didn't get it working until Saturday night. We had to fix spacing/tab errors in the .txt file, place everything into a doPost method (which changed with later revisions), change the setAttributes to call each variable (name, term, fact, etc) individually versus use a getAllPresidents. Additionally, one of our teammates was unable to post updates to gitHub for much of the weekend. Additionally, working on the program at the same time without stepping on each others' work proved frustrating at times. But in the end, we done GOT MONEY. :sunglasses:



