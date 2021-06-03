<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/27
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>分类导航</title>
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
    <th>类别</th>
    <th>查看</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${requestScope.categories}" var="list">
    <tr>
      <td>${list.ca_name}</td>

      <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/cateDetail?caid=${list.caid}' />">查看</a></td>

    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
