<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/23
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改车系页面</title>
    <script type="text/javascript">
        function updateSeriesSubmit(){
            //提交form
            document.seriesForm.action="${pageContext.request.contextPath }/update/updateSeriesSubmit";
            document.seriesForm.submit();
        }
        function removeBrand(){
            document.seriesForm.action="${pageContext.request.contextPath }/remove/removeBrand";
            document.seriesForm.submit();
        }
    </script>
</head>
<body>
<form name="seriesForm" method="post">
    品牌列表：
    <table width="100%" border=1>
        <tr>
            <td>车系号</td>
            <td>车系编号：</td>
            <td>车系：</td>
            <td>品牌编号：</td>
            <td>英文名称：</td>
            <td>别名：</td>
            <td>车系图片：</td>
            <td>是否隐藏：</td>
            <td>展示范围：</td>
        </tr>
        <c:forEach items="${tbSeriesList }" var="tbSeries">
        <tr>
            <td><input type="text" name="id" value="${tbSeries.id}"/></td>
            <td><input type="text" name="seriesCode" value="${tbSeries.seriesCode }" /></td>
            <td><input type="text" name="seriesName" value="${tbSeries.seriesName }" /></td>
            <td><input type="text" name="brandCode" value="${tbSeries.brandCode}" /></td>
            <td><input type="text" name="enName" value="${tbSeries.enName}" /></td>
            <td><input type="text" name="aliasName" value="${tbSeries.aliasName }"/></td>
            <td><input type="text" name="imageUrl" value="${tbSeries.imageUrl }"/></td>
            <td><input type="text" name="isHidden" value="${tbSeries.isHidden }"/></td>
            <td><input type="text" name="displayTag" value="${tbSeries.displayTag }" /></td>
        </tr>
        </c:forEach>
        <td><input type="button" value="修改" onclick="updateSeriesSubmit()"> </td>
        <td colspan="2" align="center"><input type="submit" value="迁移" onclick="removeBrand()"/>
        <a href="../index.jsp">返回主页</a>
</form>
</body>
</html>
