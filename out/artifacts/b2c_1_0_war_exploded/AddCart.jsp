<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/28
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加购物车</title>
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
    <th>名称</th>
    <th>分类</th>
    <th>图片</th>
    <th>详情</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${goods}" var="list">
    <tr>
      <td>${list.g_name}</td>
      <td>${list.caid}</td>
      <td><img src="${list.g_imge}"></td>
      <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/g_detail?gid=${list.gid}' />">详情</a></td>
    </tr>
  </c:forEach>


  </tbody>
</table>
</body>
</html>
