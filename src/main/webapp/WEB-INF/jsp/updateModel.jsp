<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/23
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改车型页面</title>
    <script type="text/javascript">
        function updateModelSubmit(){
            //提交form
            document.modelForm.action="${pageContext.request.contextPath }/update/updateModelSubmit";
            document.modelForm.submit();
        }
        function removeSeries(){
            document.modelForm.action="${pageContext.request.contextPath }/remove/removeSeries";
            document.modelForm.submit();
        }
    </script>
</head>
<body>
<form name="modelForm" method="post">
车型列表：
<table width="100%" border=1>
    <tr>
        <td>车型号</td>
        <td>车型编号：</td>
        <td>车型：</td>
        <td>车系编号：</td>
        <td>年份：</td>
        <td>简称：</td>
        <td>引导图：</td>
        <td>是否在售：</td>
        <td>进口方式：</td>
        <td>是否隐藏：</td>
        <td>展示范围：</td>
    </tr>
    <c:forEach items="${tbModelList }" var="tbModel">
    <tr>
        <td><input type="text" name="id" value="${tbModel.id}"/></td>
        <td><input type="text" name="modelCode" value="${tbModel.modelCode }" /></td>
        <td><input type="text" name="modelName" value="${tbModel.modelName }" /></td>
        <td><input type="text" name="seriesCode" value="${tbModel.seriesCode}" /></td>
        <td><input type="text" name="year" value="${tbModel.year}" /></td>
        <td><input type="text" name="shortName" value="${tbModel.shortName }"/></td>
        <td><input type="text" name="leadPic" value="${tbModel.leadPic }" /></td>
        <td><input type="text" name="sellStatus" value="${tbModel.sellStatus }"/></td>
        <td><input type="text" name="isHidden" value="${tbModel.isHidden }"/></td>
        <td><input type="text" name="displayTag" value="${tbModel.displayTag }" /></td>
        </td>
    </tr>
    </c:forEach>
    <td><input type="button" value="修改" onclick="updateModelSubmit()"> </td>
    <td colspan="2" align="center"><input type="submit" value="迁移" onclick="removeSeries()"/>
    <a href="../index.jsp">返回主页</a>
    </form>
</body>
</html>
