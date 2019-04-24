<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/23
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改品牌页面</title>
    <script type="text/javascript">
        function updateBrandSubmit(){
            //提交form
            document.brandForm1.action="${pageContext.request.contextPath }/update/updateBrandSubmit";
            document.brandForm1.submit();
        }

    </script>
</head>
<body>
<form name="brandForm1" method="post">
    品牌列表：
    <table width="100%" border=1>
        <tr>
            <td>品牌号</td>
            <td>品牌编号：</td>
            <td>品牌图片：</td>
            <td>品牌：</td>
            <td>国家：</td>
            <td>英文名称：</td>
            <td>拼音：</td>
            <td>别名：</td>
            <td>是否隐藏：</td>
            <td>展示范围：</td>
        </tr>
        <c:forEach items="${tbBrandList }" var="tbBrand">
        <tr>
            <td><input type="text" name="id" value="${tbBrand.id}"/></td>
            <td><input type="text" name="brandCode" value="${tbBrand.brandCode }" /></td>
            <td><input type="text" name="logoUrl" value="${tbBrand.logoUrl }" /></td>
            <td><input type="text" name="brandName" value="${tbBrand.brandName}" /></td>
            <td><input type="text" name="country" value="${tbBrand.country}" /></td>
            <td><input type="text" name="enName" value="${tbBrand.enName }"/></td>
            <td><input type="text" name="pinyin" value="${tbBrand.pinyin }" /></td>
            <td><input type="text" name="aliasName" value="${tbBrand.aliasName }"/></td>
            <td><input type="text" name="isHidden" value="${tbBrand.isHidden }"/></td>
            <td><input type="text" name="displayTag" value="${tbBrand.displayTag }" /></td>
        </tr>
        </c:forEach>
        <td><input type="button" value="修改" onclick="updateBrandSubmit()"> </td>
        <a href="../index.jsp">返回主页</a>
</form>
</body>
</html>
