<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/24
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改个人信息</title>
</head>
<body>
    <form action="<c:url context='${pageContext.request.contextPath}' value='/user/safe/update2User' />" method="post" >
      <input type="text" name="id" value="${user.uid}" readonly/><br>
      <input type="text" name="username" value="${user.uname}"/> <br>
      <input type="password" name="password" value="${user.password}"/><br>
      <input type="text" name="email" value="${user.email}" /><br>
      <input type="text" name="sex" value="${user.sex}" /><br>
      <input type="submit" value="确定"/>
    </form>

</body>
</html>
