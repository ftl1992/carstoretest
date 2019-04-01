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
    车型列表：
    <table width="100%" border=1>
        <tr>
            <td>选择</td>
            <td>车型图片：</td>
            <td>车型：</td>
            <td>年份：</td>
            <td>简称：</td>
            <td>进口方式：</td>
            <td>是否平行进口：</td>
        </tr>
        <c:forEach tbSeries="${tbModelList }" var="tbModel">
        <tr>
            <td><input type="checkbox" name="tbModel_id" value="${tbModel.id}"/></td>
            <td>${tbModel.lead_pic }</td>
            <td>${tbModel.model_name }</td>
            <td>${tbModel.year }</td>
            <td>${tbModel.short_name }</td>
            <td>${tbModel.import_type }</td>
            <td>${tbModel.is_import }</td>

        </tr>
        <a href="">返回主页</a>
        </c:forEach>
        <form method="post">
            车型: <input type="text" name="lead_pic" /> <br>
            车型名称: <input type="text" name="model_name" /> <br>
            年份: <input type="text" name="year" /> <br>
            简称: <input type="text" name="short_name" /> <br>
            进口方式: <input type="text" name="import_type" /> <br>
            是否平行进口: <input type="text" name="is_import" /> <br>
        </form>

</body>
</html>
