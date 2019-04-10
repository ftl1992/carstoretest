<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/1
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>品牌表</title>
</head>
<body>
<form name="modelForm" method="post">
品牌列表：
<table width="100%" border=1>
    <tr>
        <td>选择</td>
        <td>品牌图片：</td>
        <td>品牌：</td>
        <td>国家：</td>
        <td>英文名称：</td>
    </tr>
    <c:forEach items="${tbBrandList }" var="tbBrand">
    <tr>
        <td><input type="checkbox" name="tbBrand" value="${tbBrand.id}"/></td>
        <td>${tbBrand.logoUrl }</td>
        <td>${tbBrand.brandName }</td>
        <td>${tbBrand.country }</td>
        <td>${tbBrand.enName }</td>
        <td><a href="${pageContext.request.contextPath }/select/selectByBrand_code?brandCode=${tbBrand.brandCode}">查看具体车系</a></td>
    </tr>
    </c:forEach>
    <a href="../index.jsp">返回主页</a>
</form>
</body>
</html>