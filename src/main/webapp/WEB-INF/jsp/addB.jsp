<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/18
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加品牌</title>
    <script type="text/javascript">
        function addBrand(){
            //提交form
            document.brandForm.action="${pageContext.request.contextPath }/add/addBrand";
            document.brandForm.submit();
        }

    </script>
</head>
<body>
<form name="brandForm" method="post">
    <table>

        <tr>
            <td>品牌</td>
            <td><input type="text" name="brandName"/></td>
        </tr>
        <tr>
            <td>品牌编号</td>
            <td><input type="text" name="brandCode"/></td>
        </tr>
        <tr>
            <td>国家</td>
            <td><input type="text" name="country"/></td>
        </tr>
        <tr>
            <td>英文名称</td>
            <td><input type="text" name="enName"/></td>
        </tr>
        <tr>
            <td>拼音</td>
            <td><input type="text" name="pinyin"/></td>
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
    <td><input type="button" value="添加" onclick="addBrand()"> </td>
    <a href="../index.jsp">返回主页</a>
</form>


</body>
</html>
