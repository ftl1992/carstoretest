<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/29
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>车型表</title>
</head>
<body>
<form name="modelForm" method="post">
    车型列表：
    <table width="100%" border=1>
        <tr>
            <td>选择</td>
            <td>车型图片：</td>
            <td>车型：</td>
            <td>车系编号：</td>
            <td>年份：</td>
            <td>简称：</td>
            <td>进口方式：</td>
            <td>是否平行进口：</td>
        </tr>
        <c:forEach items="${tbModelList }" var="tbModel">
        <tr>
            <td><input type="checkbox" name="tbModel_id" value="${tbModel.id}"/></td>
            <td>${tbModel.leadPic }</td>
            <td>${tbModel.modelName }</td>
            <td>${tbModel.seriesCode }</td>
            <td>${tbModel.year }</td>
            <td>${tbModel.shortName }</td>
            <td>${tbModel.importType }</td>
            <td>${tbModel.isImport }</td>
            <td><a href="${pageContext.request.contextPath }/update/updateModel?modelName=${tbModel.modelName}">修改信息</a></td>
            <a href="${pageContext.request.contextPath }/delete/deleteByModelName?modelName=${tbModel.modelName}">删除</a>
        </tr>
        </c:forEach>
        <a href="${pageContext.request.contextPath }/add/addMo">添加车型页面</a>
        <a href="../index.jsp">返回主页</a>
        </form>
</body>
</html>
