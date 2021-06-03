<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/5/4
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery.js"></script>
</head>
<body>
    <form action="<c:url context='${pageContext.request.contextPath}' value='/user/safe/addCOrder' />" id="first" method="post">
      <table>
        <tr>
          <td><label for="ji"><input type="checkbox" id="ji"/>全选</label></td>
          <td>购物车编号</td>
          <td>商品详情编号</td>
          <td>商品数量</td>
          <td>商品小计</td>
          <td colspan="2">操作</td>
        </tr>
        <c:forEach var="cart" items="${carts}">
          <tr>
            <td><input type="checkbox" name="spid" value="${cart.spid}" /></td>
            <td>${cart.spid}</td>
            <td>${cart.g_did}</td>
            <td>${cart.sp_num}</td>
            <td>${cart.sp_money}</td>
            <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/delCart?spid=${cart.spid}'/>">删除</a></td>
            <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/alterCart?spid=${cart.spid}'/>">修改</a></td>
          </tr>
        </c:forEach>
        <tr>
          <td align="center"><input type="submit" value="生成订单"/></td>
        </tr>
      </table>
    </form>



    <script type="text/javascript" >
      // function changeVa(){
      //   $('form[name=fin]').empty();
      //   var check = $('input[name=spid1]');
      //   //var val = document.getElementsByName("spid1");
      //   var str = "";
      //   check.each(function(){
      //     if($(this).attr('checked')){
      //       str += "<input type='hidden' name='spid' value='"+$(this).val()+"'/>";
      //       $('form[name=fin]').append(str);
      //     }
      //   });
      //   $("form[name=fin]").submit();
      //
      // }
      $(function () {
        $("#ji").on("click",function () {
          $("input[name=spid]").prop("checked",$(this).prop("checked"));

        })
      })





    </script>
<%--    <form action="<c:url context='${pageContext.request.contextPath}' value='/user/safe/addCOrder' />" name="fin" method="post" >--%>

<%--    </form>--%>

</body>
</html>
