<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/18
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加车型</title>
    <script type="text/javascript">
        function addModel(){
            //提交form
            document.modelForm.action="${pageContext.request.contextPath }/add/addModel";
            document.modelForm.submit();
        }

    </script>
</head>
<body>
<form name="modelForm" method="post">
    <table>

        <tr>
            <td>车型</td>
            <td><input type="text" name="modelName"/></td>
        </tr>
        <tr>
            <td>车型编号</td>
            <td><input type="text" name="modelCode"/></td>
        </tr>
        <tr>
            <td>车系编号</td>
            <td><input type="text" name="seriesCode"/></td>
        </tr>
        <tr>
            <td>年份</td>
            <td><input type="text" name="year"/></td>
        </tr>
        <tr>
            <td>简称</td>
            <td><input type="text" name="shortName"/></td>
        </tr>
        <tr>
            <td>引导图</td>
            <td><input type="text" name="leadPic"/></td>
        </tr>
        <tr>
            <td>是否隐藏</td>
            <td><input type="text" name="isHidden"/></td>
        </tr>
    </table>
    <td><input type="button" value="添加" onclick="addModel()"> </td>
    <a href="../index.jsp">返回主页</a>
</form>
</body>
</html>
