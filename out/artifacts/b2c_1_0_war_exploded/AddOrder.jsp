<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/29
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>生成订单</title>
  <script type="text/javascript" src="${pageContext.request.contextPath}/jquery.js"></script>

</head>
<body>

    <a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/addaddress' />">添加地址</a>
    <form action="<c:url context='${pageContext.request.contextPath}' value='/user/safe/addOrder2' />" method="post">
      <input type="text" value="${order.oid}" name="oid" readonly>
      <input type="text" value="${order.uid}" name="uid" readonly>
      <input type="text" value="${order.o_money}" name="o_money" readonly>


      <%-- 遍历地址 --%>
      <select id="se">
        <option value="-1">请选择地址</option>
<%--        for循环--%>
        <c:if test="${addressList != null}">
          <c:forEach var="address" items="${addressList}">
            <option value="${address.aid}">${address.province}</option>
          </c:forEach>
        </c:if>


      </select>
      <input type="hidden" name="aid" id="ip3" value="">
      <c:if test="${item != null}">
        <input type="hidden" name="g_did" value="${item.g_did}"/>
        <input type="hidden" name="i_num" value="${item.i_num}"/>
        <input type="hidden" name="i_money" value="${item.i_money}"/>
      </c:if>
      <c:if test="${spids != null}">
        <c:forEach items="${spids}" var="spid">
          <input type="hidden" name="spid" value="${spid}"/>
        </c:forEach>
      </c:if>
      <input type="submit" id="sub" value="提交订单">
    </form>

    <script type="text/javascript">

      $(function () {
        $("#se").on("change",function () {
          var vaOid = $(this).val();
          $("#ip3").val(vaOid);
          // console.log( $("#ip3").val());
        })
        $("form").on("submit",function () {
          if($("#ip3").val() == null){
            return false;
          }else{
            return true;
          }
        })

      })

    </script>


</body>
</html>
