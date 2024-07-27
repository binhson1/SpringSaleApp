<%-- 
    Document   : index
    Created on : Jul 15, 2024, 12:17:21 AM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="row">
    <div class="col-3 bg-secondary">
        <c:url value="/" var="action"/>
        <form action="${action}">
            <div class="mb-3 mt-3">
                <label for="q" class="form-label">Từ khóa:</label>
                <input type="text" class="form-control" id="q" placeholder="Từ khóa:" name="q">
            </div> 
            <div class="mb-3 mt-3">
                <label for="fromPrice" class="form-label">Từ Giá:</label>
                <input type="number" class="form-control" id="q" placeholder="Từ giá:" name="fromPrice">
            </div>
            <div class="mb-3 mt-3">
                <label for="fromPrice" class="form-label">Đến Giá:</label>
                <input type="number" class="form-control" id="q" placeholder="Đến giá:" name="toPrice">
            </div>                        
            <div class="mb-3 mt-3">
                <input type="submit" value="Tim SP" class ="btn-success">
            </div>
        </form>
    </div>
    <div class="col-9">
        <a class="btn btn-info" href="<c:url value="/product"></c:url>">Thêm sản phẩm</a>
        <table class="table table-striped"> 
            <tr>
                <th></th>
                <th>ID</th>
                <th>Ten</th>
                <th>Gia</th>
                <th></th>
            </tr>
            <c:forEach items="${prods}" var="p">
                <tr>
                    <td><img src="${p.image}" alt="${p.name}></td>                    
                    <td>${p.id}</td>
                    <td>${p.name}</td>
                    <td>${String.format("%,d", p.price)} VND</td>
                    <td>
                        <a href="#" class ="btn btn-info">&LongLeftArrow;</a>
                        <button class="btn btn-danger">&times;</button>
                    </td>                    
                </tr>
            </c:forEach>
        </table>
    </div>             
</div>
