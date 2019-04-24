<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/24
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>车型迁移页面</title>
    <script>
    function removeToSeries(){
    document.modelForm.action="${pageContext.request.contextPath }/remove/removeToSeries";
    document.modelForm.submit();
    }
    </script>
</head>
<body>
<form name="modelForm" method="post">
    车型列表：
    <table width="100%" border=1>
        <tr>

            <td>车型：</td>
        </tr>
        <c:forEach items="${tbModelList }" var="tbModel">
        <tr>
            <td><input type="text" name="modelName" value="${tbModel.modelName }" /></td>
        </tr>
        </c:forEach>
        <tr>
            <td>品牌</td>
            <td><input type="text" name="newSeriesCode" id="newSeriesCode"/></td>
        </tr>
        <tr>
        <td colspan="2" align="center"><input type="submit" value="迁移" onclick="removeToSeries()"/>
        </td>
        </tr>
            <a href="../index.jsp">返回主页</a>
</form>
</body>
</html>
