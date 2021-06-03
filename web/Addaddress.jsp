<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/5/1
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>创建地址</title>
</head>
<body>
    <form action="<c:url context='${pageContext.request.contextPath}' value='/user/safe/addadd2' />" method="post">
      收件人姓名：<input type="text" name="aname" /><br>
      收件人电话号码：<input type="text" name="phonenum" /><br>
      省份：<input type="text" name="province"/><br>
      市：<input type="text" name="city"/><br>
      城镇：<input type="text" name="town"/><br>
      详细地址：<input type="text" name="a_detail"/><br>
      <input type="submit" value="创建"/>

    </form>

</body>
</html>
