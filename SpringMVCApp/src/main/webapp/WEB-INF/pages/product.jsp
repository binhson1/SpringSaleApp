<%-- 
    Document   : product
    Created on : Jul 20, 2024, 1:27:31 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h1 class="text-center primary">TRANG QUẢN TRỊ</h1>
<c:url value="/product" var="action" />
<form:form method="post" action="${action}" modelAttribute="product" enctype="multipart/form-data">

    <form:errors path="*" cssClass="alert alert-danger" element="div"/>

    <div class="mb-3 mt-3">
        <label for="email" class="form-label">Tên sản phẩm</label>
        <form:input path="name" type="text" class="form-control" id="name" placeholder="Tên sản phẩm" name="name"></form:input>
        <form:errors path="*" cssClass="alert alert-danger" element="div"/>
    </div>
    <div class="mb-3 mt-3">
        <label for="price" class="form-label">Giá sản phẩm</label>
        <form:input path="price" type="number" class="form-control" id="price" placeholder="Giá sản phẩm" name="price"></form:input>
        </div>
        <div class="mb-3 mt-3">
            <label for="price" class="form-label">Danh mục sản phẩm</label>
        <form:select path="categoryId" class="form-select">
            <c:forEach items="${cates}" var ="c">
                <option value="${c.id}">${c.name}</option>
            </c:forEach> 
        </form:select>
    </div>
</div>
<div class="mb-3 mt-3">
    <label for="file" class="form-label">Ảnh sản phẩm</label>
    <form:input accept=".png,.jpg" path="file" type="file" class="form-control" id="file"  name="price"></form:input>
    </div>
    <div class="mb-3 mt-3">
        <button class="btn btn-success">Thêm sản phẩm</button>
    </div>

</form:form>    