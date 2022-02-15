<%@ page import="com.example.application_entreprise_tp4.ClassUser" %>
<%@ page import="com.example.application_entreprise_tp4.ClassUser" %><%--
  Created by IntelliJ IDEA.
  com.example.application_entreprise_tp4.ClassUser: Clement Chevreuil
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
    <jsp:useBean id="classUser" class="com.example.application_entreprise_tp4.ClassUser" scope="session"></jsp:useBean>
    <jsp:getProperty name="classUser" property="name"></jsp:getProperty>

    <!--- methode 2 --->

    <%! ClassUser classUser; %>
    <%! HttpSession session; %>
    <% session= request.getSession(true); %>
    <% classUser = (ClassUser) session.getAttribute("classUser"); %>
    <p>Welcome <%= classUser.getName() %></p>

    <form action="ServletWelcome" method="get">
        <button type="submit">listClassEmployee</button>
    </form>

    <form action="ServletWelcome" method="post">
        <button type="submit">Deconnexion</button>
    </form>
</body>
</html>
