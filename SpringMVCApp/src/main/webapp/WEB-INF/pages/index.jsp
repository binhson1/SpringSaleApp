<%-- 
    Document   : index
    Created on : Jul 15, 2024, 12:17:21 AM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test Page</title>
    </head>
    <body>
        <h1>Xin Chào</h1>
        <ul>
            <c:forEach items="${cates}" var="c">
                <li>${c.name}</li>
            </c:forEach>
        </ul>
        
        <ul>
            <c:forEach items="${products}" var="p">
                <li>${p.name}</li>
            </c:forEach>
        </ul>
    </body>
</html>
