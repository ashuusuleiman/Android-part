<%--
  Created by IntelliJ IDEA.
  User: ASHUU
  Date: 7/9/2020
  Time: 1:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<%
  String message=(String) session.getAttribute("message");
%>
<form action="HandleGuess" methods="post">
  <input type="text" name="guessnumber" size=8>
  <%=message %>
  < input type = "submit" value = "submit" >
</form>
<form action="getNumber.jsp" method="post">
  < input type = "submit" value = "get new random number again" >
</form>


  </body>

</html>
