<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/5/4
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看订单</title>
</head>
<body>
<table>
  <tr>
    <td>订单编号</td>
    <td>地址</td>
    <td>应付金额</td>
    <td>创建时间</td>
    <td>订单状态</td>
    <td>订单操作</td>
  </tr>
  <c:if test="${orderAll != null}">
    <c:forEach items="${orderAll}" var="orderFin">
      <tr>
        <td>${orderFin.oid}</td>
        <td>${orderFin.aid}</td>
        <td>${orderFin.o_money}</td>
        <td>${orderFin.o_time}</td>
        <c:if test="${orderFin.ispay == 0}">
          <td style="color: red;">未支付</td>
          <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/payOrder?oid=${orderFin.oid}' />">支付订单</a></td>
          <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/checkOrderItem?oid=${orderFin.oid}' />">查看订单</a></td>
          <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/delOrder?oid=${orderFin.oid}' />">取消订单</a></td>
        </c:if>
        <c:if test="${orderFin.ispay == 1}">
          <td style="color:orange;">已支付，未收到</td>
          <%--            <td><a>支付订单</a></td>--%>
          <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/checkOrderItem?oid=${orderFin.oid}' />">查看订单</a></td>
          <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/refundOrder?oid=${orderFin.oid}' />">申请退款</a></td>
        </c:if>
        <c:if test="${orderFin.ispay == 2}">
          <td style="color: chartreuse;">已收到，未评价</td>
          <%--            <td><a>支付订单</a></td>--%>
          <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/checkOrderItem?oid=${orderFin.oid}' />">查看订单</a></td>
          <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/refundOrder?oid=${orderFin.oid}' />">申请退款</a></td>
        </c:if>
        <c:if test="${orderFin.ispay == 3}">
          <td style="color:green;">已评价</td>
          <%--            <td><a>支付订单</a></td>--%>
          <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/checkOrderItem?oid=${orderFin.oid}' />">查看订单</a></td>
          <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/refundOrder?oid=${orderFin.oid}' />">申请退款</a></td>
          <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/delOrder?oid=${orderFin.oid}' />">删除订单</a></td>
        </c:if>
        <c:if test="${orderFin.ispay == 4}">
          <td style="color: gray;">已退款</td>
          <%--            <td><a>支付订单</a></td>--%>
          <%--            <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/checkOrder?oid=${orderFin.oid}' />">查看订单</a></td>--%>
          <%--            <td><a href="">申请退款</a></td>--%>
          <td><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/delOrder?oid=${orderFin.oid}' />">删除订单</a></td>
        </c:if>

      </tr>
    </c:forEach>
  </c:if>





</table>
</body>
</html>
