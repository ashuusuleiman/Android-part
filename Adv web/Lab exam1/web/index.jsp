<%--
  Created by IntelliJ IDEA.
  User: ASHUU
  Date: 7/16/2020
  Time: 3:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action = "servlet1" method="get">
    textbox
    Name <input type="text" name="Name"> <br>
    RegistrationNumber <input type="text" name="RegistrationNumber"> <br>
   Grade <input type="text" name="Grade"> <br>
   Phonenumber <input type="text" name="PhoneNumber"> <br>
    Email id  <input type="text" name="Email"> <br>


    radiobutton
    Male <input type="radio" name="Male" value="Male"> <br>
    Female <input type="radio" name="" value="Female"> <br>

    <select>
      <option>1</option>
    </select>
  </form>
  </body>
</html>
