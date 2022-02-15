<%@ page import="com.example.application_entreprise_tp4.Class.User" %>
<%@ page import="com.example.application_entreprise_tp4.Class.User" %>
<%@ page import="com.example.application_entreprise_tp4.Class.User" %><%--
  Created by IntelliJ IDEA.
  com.example.application_entreprise_tp4.Class.User: Clement Chevreuil
  Date: 12/02/2022
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>



</head>
<body>



    <!--- methode 1 --->
    <jsp:useBean id="user" class="com.example.application_entreprise_tp4.Class.User" scope="session"></jsp:useBean>
    <jsp:getProperty name="user" property="name"></jsp:getProperty>

    <!--- methode 2 --->

    <%! User user2; %>
    <%! HttpSession session; %>
    <% session= request.getSession(true); %>
    <% user2 = (User) session.getAttribute("user"); %>
    <p>Welcome <%= user2.getName() %></p>

    <form action="ServletWelcome" method="get">
        <button type="submit">listEmployee</button>
    </form>

    <form action="ServletWelcome" method="post">
        <button type="submit">Deconnexion</button>
    </form>
</body>
</html>
