<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/1
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>品牌表</title>
</head>
<body>
品牌列表：
<table width="100%" border=1>
    <tr>
        <td>选择</td>
        <td>品牌图片：</td>
        <td>品牌：</td>
        <td>国别：</td>
        <td>英文名称：</td>
    </tr>
    <c:forEach tbSeries="${tbBrandList }" var="tbBrand">
    <tr>
        <td><input type="checkbox" name="tbBrand_id" value="${tbBrand.id}"/></td>
        <td>${tbBrand.lead_pic }</td>
        <td>${tbBrand.brand_name }</td>
        <td>${tbBrand.year }</td>
        <td>${tbBrand.short_name }</td>
        <td>${tbBrand.import_type }</td>
        <td>${tbBrand.is_import }</td>

    </tr>
    <a href="index">返回主页</a>
    </c:forEach>
    <form action="${pageContext.request.contextPath }/select/selectByBrand_code" method="post">
        车型: <input type="text" name="lead_pic" /> <br>
        车型名称: <input type="text" name="model_name" /> <br>
        年份: <input type="text" name="year" /> <br>
        简称: <input type="text" name="short_name" /> <br>
        进口方式: <input type="text" name="import_type" /> <br>
        是否平行进口: <input type="text" name="is_import" /> <br>
        <input type="submit" value="查看具体车系" onclick="onclick();" />
    </form>

</body>
</html>
