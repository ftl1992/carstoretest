<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/29
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="UTF-8"%>

<html>
<head>
    <title>车系列表</title>
</head>
<body>
<form name="seriesForm"  method="post">

车系列表：
<table width="100%" border=1>
    <tr>
        <td>选择</td>
        <td>车系图片：</td>
        <td>车系：</td>
        <td>品牌编号：</td>
        <td>英文名：</td>
        <td>是否进口：</td>
        <td>操作：</td>
    </tr>
    <c:forEach items="${tbSeriesList }" var="tbSeries">
    <tr>
        <td><input type="checkbox" name="tbSeries_id" value="${tbSeries.id}"/></td>
        <td>${tbSeries.imageUrl }</td>
        <td>${tbSeries.seriesName }</td>
        <td>${tbSeries.brandCode }</td>
        <td>${tbSeries.enName }</td>
        <td>${tbSeries.isImport }</td>
        <td><a href="${pageContext.request.contextPath }/select/selectBySeries_code?seriesCode=${tbSeries.seriesCode}">查看具体车型</a></td>
        <td><a href="${pageContext.request.contextPath }/update/updateSeries?seriesName=${tbSeries.seriesName}">修改信息</a></td>
        <a href="${pageContext.request.contextPath }/delete/deleteBySeriesName?seriesName=${tbSeries.seriesName}">删除</a>
    </tr>
    </c:forEach>
    <a href="${pageContext.request.contextPath }/add/addSe">添加车系页面</a>
    <a href="../index.jsp">返回主页</a>
</table>
</form>
</body>
</html>
