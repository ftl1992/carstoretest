<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/25
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>车系迁移网页</title>
    <script>
        function removeToBrand(){
            document.seriesForm.action="${pageContext.request.contextPath }/remove/removeToBrand";
            document.seriesForm.submit();
        }
    </script>
</head>
<body>
<form name="seriesForm" method="post">
    车型列表：
    <table width="100%" border=1>
        <tr>

            <td>车型：</td>
        </tr>
        <c:forEach items="${tbSeriesList }" var="tbSeries">
        <tr>
            <td><input type="text" name="seriesName" value="${tbSeries.seriesName }" /></td>
        </tr>
        </c:forEach>
        <tr>
            <td>品牌</td>
            <td><input type="text" name="newBrandCode" id="newBrandCode"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="迁移" onclick="removeToBrand()"/>
            </td>
        </tr>
        <a href="../index.jsp">返回主页</a>
</form>
</body>
</html>
