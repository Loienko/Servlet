<%@ page import="net.ukr.dreamsicle.AnketaServlet" %>
<%@ page import="net.ukr.dreamsicle.AnketaServlet" %><%--
  Created by IntelliJ IDEA.
  User: Yurii
  Date: 04.05.2017
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<% String name = (String)session.getAttribute("user");%>


<% if (name == null) { %>
<form action="/profile" method="POST">

    Name: <input type="text" name="name" /><br/>
    Surname: <input type="text" name="surname" /><br/>
    Age: <input type="text" name="age" /><br/>

    <br/> Do you like Trips?
    <br/><input type="radio" name="question1" value="yes" />   Yes
    <br/> <input type="radio" name="question1" value="no" />   No

    <br> Do you like London city?<br/>
    <br/> <input type="radio" name="question2" value="yes" />   Yes
    <br/> <input type="radio" name="question2" value="no" />    No

    <br/><input type="submit" />

</form>
<% } else { %>
<h1> Hello,  -  <%= name %>  </h1>
<br>Number of people who like Trips: <b><%=AnketaServlet.q1Yes %></b>
<br>
<br>Number of people who don`t like Trips:<b> <%=AnketaServlet.q1No %> </b>
<br>
<br>Number of people who like Trips:<b> <%=AnketaServlet.q2Yes %></b>
<br>
<br>Number of people who like Trips:<b> <%=AnketaServlet.q2No %></b>
<br>
<br>Click this link to <a href="/profile?a=exit">logout</a>
<% } %>
</body>
</html>