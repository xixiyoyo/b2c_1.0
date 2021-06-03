<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/26
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品详情页</title>
<%--  <script type="text/javascript" src="jquery.js"></script>--%>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="//unpkg.com/layui@2.6.4/dist/css/layui.css">

</head>
<body>

<table class="layui-table">
  <colgroup>
    <col width="150">
    <col width="200">
    <col>
  </colgroup>
  <thead>
  <tr>
    <th>价格</th>
    <th>颜色</th>
    <th>描述</th>
    <th colspan="3">操作</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${requestScope.g_delist}" var="list">
    <tr>
      <td>${list.d_price}</td>
      <td>${list.d_color}</td>
      <td>${list.d_describe}</td>
      <td><input type="text" value="1" id="in1"></td>
      <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/addCart?g_did=${list.g_did}&num=' />" onclick="getnum(this)" id="a1">加入购物车</a></td>
      <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/addOrder?g_did=${list.g_did}&num=' />" onclick="getnum(this)">生成订单</a></td>

    </tr>
  </c:forEach>


  </tbody>
</table>
<script type="text/javascript">
    function getnum(a) {
      var num = document.getElementById("in1").value;
      // a.getAttribute("href");
      a.href += num;
    }
</script>

</body>
</html>
