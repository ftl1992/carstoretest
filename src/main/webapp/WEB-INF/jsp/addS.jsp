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
    <title>添加车系</title>
    <script type="text/javascript">
        function addSeries(){
            //提交form
            document.seriesForm.action="${pageContext.request.contextPath }/add/addSeries";
            document.seriesForm.submit();
        }

    </script>
</head>
<body>
<form name="seriesForm" method="post">
    <table>

        <tr>
            <td>车系</td>
            <td><input type="text" name="seriesName"/></td>
        </tr>
        <tr>
            <td>车系编号</td>
            <td><input type="text" name="seriesCode"/></td>
        </tr>
        <tr>
            <td>品牌编号</td>
            <td><input type="text" name="brandCode"/></td>
        </tr>
        <tr>
            <td>英文名称</td>
            <td><input type="text" name="enName"/></td>
        </tr>
        <tr>
            <td>车系图片</td>
            <td><input type="text" name="imageUrl"/></td>
        </tr>
        <tr>
            <td>别名</td>
            <td><input type="text" name="aliasName"/></td>
        </tr>
        <tr>
            <td>是否隐藏</td>
            <td><input type="text" name="isHidden"/></td>
        </tr>
    </table>
    <td><input type="button" value="添加" onclick="addSeries()"> </td>
    <a href="../index.jsp">返回主页</a>
</form>
</body>
</html>
