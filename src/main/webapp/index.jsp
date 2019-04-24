<%--suppress ALL --%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="UTF-8"%>
<html lang="fan">
<head>
    <meta charset="UTF-8" />
    <title>首页 - carstore</title>

    <script language="JavaScript">
        function a(str){ //删除左右两端的空格
            return str.replace(/(^\s*)|(\s*$)/g, "");
        }
        function ss(){
            alert("进入");
            var brand_name = document.getElementById("brand_name");
            var series_name = document.getElementById("series_name");
            var model_name = document.getElementById("model_name");
            if( a(model_name.value)!=null && a(model_name.value)!=="")
            {

                document.carForm.action="${pageContext.request.contextPath }/select/selectByModelname";
                document.carForm.submit();
                alert("成功");
                return;
            }

            if(a(series_name.value)!=null && a(series_name.value)!=="")
            {
                alert("成功");
                document.carForm.action="${pageContext.request.contextPath }/select/selectBySeriesname";
                document.carForm.submit();
                return;
            }

            if( a(brand_name.value)!=null && a(brand_name.value)!=="")
            {
                document.carForm.action="${pageContext.request.contextPath }/select/selectByBrandname";
                document.carForm.submit();
                alert("成功");
                return;
            }
            if ( brand_name.value=="" || brand_name.value==null){
                document.carForm.action="${pageContext.request.contextPath }/select/searchAllBrand";
                document.carForm.submit();
                alert("成功");
                return;
            }

        }

    </script>
</head>
<body>
<form id="carForm" name="carForm" method="post" >
    <table width="100%" border=1>
        <tr>
            <td>品牌</td>
            <td><input type="text" name="brand_name" id="brand_name"/></td>
        </tr>
        <tr>
            <td>车系</td>
            <td><input type="text" name="series_name" id="series_name"/></td>
        </tr>
        <tr>
            <td>车型</td>
            <td><input type="text" name="model_name" id="model_name"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="查询" onclick="ss()"/>
            </td>
        </tr>
    </table>
</form>

</body>
</html>