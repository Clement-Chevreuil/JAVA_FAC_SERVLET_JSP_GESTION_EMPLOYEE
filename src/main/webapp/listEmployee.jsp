<%@ page import="com.example.application_entreprise_tp4.ClassEmployee" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  com.example.application_entreprise_tp4.ClassUser: Clement Chevreuil
  Date: 13/02/2022
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>List Employee</h1>

    <table>
        <thead>
            <tr>
                <td>FirstName</td>
                <td>LastName</td>
                <td>Role</td>
            </tr>
        </thead>
        <tbody>



            <c:forEach var="listClassEmployee" items="${sessionScope['listClassEmployee']}">
                <tr>
                    <td>${listClassEmployee.firstName}</td>
                    <td>${listClassEmployee.lastName}</td>
                    <td>${listClassEmployee.role}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <form action="addEmployee.jsp"> <br/> <br/>
        <input type="submit" value=" Add Employee" class="btn btn-info" />
    </form>
</body>
</html>
