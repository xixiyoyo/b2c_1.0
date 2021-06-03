<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/5/6
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改购物车</title>
  <script type="text/javascript" src="${pageContext.request.contextPath}/jquery.js"></script>
</head>
<body>
    <form action="<c:url context='${pageContext.request.contextPath}' value='/user/safe/alterCartFin' />" method="post">
      <input type="text" name="spid" value="${cart.spid}" readonly/>
      <input type="text" name="g_did" value="${cart.g_did}" readonly/>
      <input type="text" name="sp_num" value="${cart.sp_num}"/>
      <input type="text" name="sp_money" value="${cart.sp_money}" readonly/>
      <input type="hidden" name="d_price" value="${g_detail.d_price}"/>
      <input type="hidden" name="d_count" value="${g_detail.d_count}">
      <input type="submit" value="修改" />
    </form>

    <script type="text/javascript">
      $(function () {
        $("input[name=sp_num]").on("change",function () {
          if($(this).val() == null ||($(this).val() < 1 && $(this).val() > $("input[name=d_count]").val())  || $(this).val() == ""){
            $(this).val("1");
            var num = $(this).val() * $("input[name=d_price]").val();
            $("input[name=sp_money]").val(num);
          }else {
            var num = $(this).val() * $("input[name=d_price]").val();
            $("input[name=sp_money]").val(num);
          }

        })
      })
    </script>
</body>
</html>
