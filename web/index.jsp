<%--
  Created by IntelliJ IDEA.
  User: Yura
  Date: 01.05.2017
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>net.ukr.dreamsicle</title>
  </head>
  <body>
  <form action="/question" method="POST">
    Name: <input type="text" name="name">
    Surname: <input type="text" name="surname">
    Age: <input type="text" name="age">

    <br/>Do you like Java?
    <br/> <input type="radio" name="question1" value="Yes" />
    <br/> <input type="radio" name="question1" value="No" />

    <br/>Do you like .Net?
    <br/> <input type="radio" name="question2" value="Yes" />
    <br/> <input type="radio" name="question2" value="No" />

    <br/><input type="submit" />
  </form>>



  </body>
</html>
