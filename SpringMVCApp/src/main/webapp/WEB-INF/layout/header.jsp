
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
    Document   : header
    Created on : Jul 18, 2024, 10:19:13 AM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">VHBS </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#">Trang chu</a>
                </li>                
                <c:forEach items="${cates}" var="c">
                    <c:url value="/" var="cateUrl">
                        <c:param name="cateId" value="${c.id}"/>
                    </c:url>
                    <li class="nav-item">
                        <a class="nav-link" href="${cateUrl}">${c.name}</a>
                    </li>
                </c:forEach>                        
            </ul>
        </div>
    </div>
</nav> 