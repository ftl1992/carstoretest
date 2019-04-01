<%@ page contentType="text/html; charset=UTF-8"  %>
<html lang="fan">
<head>
    <meta charset="utf-8" />
    <title>首页 - carstore</title>

</head>
<body>
<form name="carForm"  method="post">
    <table width="100%" border=1>
    品牌: <input type="text" name="brand_name" /> <br>
    车系: <input type="text" name="series_name" /> <br>
    车型: <input type="text" name="model_name" /> <br>
    <input type="submit" value="查询" onclick="onclick();" />
    </table>
</form>

<script type="text/javascript">

    function onclick(){
        if('${model}'!=null && '${model}'!='')
    {

        document.carForm.action="${pageContext.request.contextPath }/select/selectByModelname";
        document.carForm.submit();
        return;
    }
        if('${series}'!=null && '${series}'!='')
        {
            document.carForm.action="${pageContext.request.contextPath }/select/selectBySeriesname";
            document.carForm.submit();
            return;
        }
        if('${brand}'!=null && '${brand}'!='')
        {
            document.carForm.action="${pageContext.request.contextPath }/select/selectByBrandname";
            document.carForm.submit();
            return;
        }
    }
</script>
</body>
</html>