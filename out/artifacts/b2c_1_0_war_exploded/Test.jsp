<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/20
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
    <title>Title</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="//unpkg.com/layui@2.6.4/dist/css/layui.css">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>

<%--<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">--%>
<%--  <legend>水平导航菜单</legend>--%>
<%--</fieldset>--%>

<%--<ul class="layui-nav">--%>
<%--  <li class="layui-nav-item"><a href="">最新活动</a></li>--%>
<%--  <li class="layui-nav-item layui-this">--%>
<%--    <a href="javascript:;">产品</a>--%>
<%--    <dl class="layui-nav-child">--%>
<%--      <dd><a href="">选项1</a></dd>--%>
<%--      <dd><a href="">选项2</a></dd>--%>
<%--      <dd><a href="">选项3</a></dd>--%>
<%--    </dl>--%>
<%--  </li>--%>
<%--  <li class="layui-nav-item"><a href="">大数据</a></li>--%>
<%--  <li class="layui-nav-item">--%>
<%--    <a href="javascript:;">解决方案</a>--%>
<%--    <dl class="layui-nav-child">--%>
<%--      <dd><a href="">移动模块</a></dd>--%>
<%--      <dd><a href="">后台模版</a></dd>--%>
<%--      <dd class="layui-this"><a href="">选中项</a></dd>--%>
<%--      <dd><a href="">电商平台</a></dd>--%>
<%--    </dl>--%>
<%--  </li>--%>
<%--  <li class="layui-nav-item"><a href="">社区</a></li>--%>
<%--</ul>--%>
<%--<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">--%>
<%--  <legend>导航带徽章和图片</legend>--%>
<%--</fieldset>--%>

<ul class="layui-nav">
  <li class="layui-nav-item">
    <a href="">控制台<span class="layui-badge">9</span></a>
  </li>
  <li class="layui-nav-item">
    <a href="">个人中心<span class="layui-badge-dot"></span></a>
  </li>
  <c:if test="${user == null}">
  <li class="layui-nav-item" lay-unselect="">
    <a href="<c:url context='${pageContext.request.contextPath}' value='/user/login' />">登录</a>
  </c:if>
  <c:if test="${user != null}">
  <li class="layui-nav-item" lay-unselect="">
    ${user.uname}
    <dl class="layui-nav-child">
      <dd><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/updateUser' />">修改信息</a></dd>
      <dd><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/checkAllOrder' />">查看订单</a></dd>
      <dd><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/checkCart' />">购物车</a></dd>
      <dd><a href="<c:url context='${pageContext.request.contextPath}' value='/user/safe/loginOut' />">退了</a></dd>
  </c:if>

    </dl>
  </li>
</ul>
<%--<div style="margin-top: 15px;">--%>

<%--  <!-- 示例-970 -->--%>
<%--  <ins class="adsbygoogle" style="display:inline-block;width:970px;height:90px" data-ad-client="ca-pub-6111334333458862" data-ad-slot="3820120620"></ins>--%>

<%--</div>--%>

<%--<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">--%>
<%--  <legend>更多导航主题</legend>--%>
<%--</fieldset>--%>
<ul class="layui-nav layui-bg-cyan">
  <li class="layui-nav-item"><a href="<c:url context='${pageContext.request.contextPath}' value='/user/cate' />">藏青导航</a></li>
  <li class="layui-nav-item"><a href="<c:url context='${pageContext.request.contextPath}' value='/user/show' />">产品</a></li>
  <li class="layui-nav-item"><a href="">大数据</a></li>
  <li class="layui-nav-item">
    <a href="javascript:;">解决方案</a>
    <dl class="layui-nav-child">
      <dd><a href="">移动模块</a></dd>
      <dd><a href="">后台模版</a></dd>
      <dd><a href="">电商平台</a></dd>
    </dl>
  </li>
  <li class="layui-nav-item"><a href="">社区</a></li>
</ul>
<%--<br>--%>
<%--<ul class="layui-nav layui-bg-green">--%>
<%--  <li class="layui-nav-item"><a href="">墨绿导航</a></li>--%>
<%--  <li class="layui-nav-item layui-this"><a href="">产品</a></li>--%>
<%--  <li class="layui-nav-item"><a href="">大数据</a></li>--%>
<%--  <li class="layui-nav-item">--%>
<%--    <a href="javascript:;">解决方案</a>--%>
<%--    <dl class="layui-nav-child">--%>
<%--      <dd><a href="">移动模块</a></dd>--%>
<%--      <dd><a href="">后台模版</a></dd>--%>
<%--      <dd><a href="">电商平台</a></dd>--%>
<%--    </dl>--%>
<%--  </li>--%>
<%--  <li class="layui-nav-item"><a href="">社区</a></li>--%>
<%--</ul>--%>
<%--<br>--%>
<%--<ul class="layui-nav layui-bg-blue">--%>
<%--  <li class="layui-nav-item"><a href="">艳蓝导航</a></li>--%>
<%--  <li class="layui-nav-item layui-this"><a href="">产品</a></li>--%>
<%--  <li class="layui-nav-item"><a href="">大数据</a></li>--%>
<%--  <li class="layui-nav-item">--%>
<%--    <a href="javascript:;">解决方案</a>--%>
<%--    <dl class="layui-nav-child">--%>
<%--      <dd><a href="">移动模块</a></dd>--%>
<%--      <dd><a href="">后台模版</a></dd>--%>
<%--      <dd><a href="">电商平台</a></dd>--%>
<%--    </dl>--%>
<%--  </li>--%>
<%--  <li class="layui-nav-item"><a href="">社区</a></li>--%>
<%--</ul>--%>

<%--<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">--%>
<%--  <legend>垂直导航菜单</legend>--%>
<%--</fieldset>--%>

<%--<ul class="layui-nav layui-nav-tree layui-inline" lay-filter="demo" style="margin-right: 10px;">--%>
<%--  <li class="layui-nav-item layui-nav-itemed">--%>
<%--    <a href="javascript:;">默认展开</a>--%>
<%--    <dl class="layui-nav-child">--%>
<%--      <dd><a href="javascript:;">选项一</a></dd>--%>
<%--      <dd><a href="javascript:;">选项二</a></dd>--%>
<%--      <dd><a href="javascript:;">选项三</a></dd>--%>
<%--      <dd><a href="">跳转项</a></dd>--%>
<%--    </dl>--%>
<%--  </li>--%>
<%--  <li class="layui-nav-item">--%>
<%--    <a href="javascript:;">解决方案</a>--%>
<%--    <dl class="layui-nav-child">--%>
<%--      <dd><a href="">移动模块</a></dd>--%>
<%--      <dd><a href="">后台模版</a></dd>--%>
<%--      <dd><a href="">电商平台</a></dd>--%>
<%--    </dl>--%>
<%--  </li>--%>
<%--  <li class="layui-nav-item"><a href="">云市场</a></li>--%>
<%--  <li class="layui-nav-item"><a href="">社区</a></li>--%>
<%--</ul>--%>
<%--<ul class="layui-nav layui-nav-tree layui-bg-cyan layui-inline" lay-filter="demo">--%>
<%--  <li class="layui-nav-item layui-nav-itemed">--%>
<%--    <a href="javascript:;">默认展开</a>--%>
<%--    <dl class="layui-nav-child">--%>
<%--      <dd><a href="javascript:;">选项一</a></dd>--%>
<%--      <dd><a href="javascript:;">选项二</a></dd>--%>
<%--      <dd><a href="javascript:;">选项三</a></dd>--%>
<%--      <dd><a href="">跳转项</a></dd>--%>
<%--    </dl>--%>
<%--  </li>--%>
<%--  <li class="layui-nav-item">--%>
<%--    <a href="javascript:;">解决方案</a>--%>
<%--    <dl class="layui-nav-child">--%>
<%--      <dd><a href="">移动模块</a></dd>--%>
<%--      <dd><a href="">后台模版</a></dd>--%>
<%--      <dd><a href="">电商平台</a></dd>--%>
<%--    </dl>--%>
<%--  </li>--%>
<%--  <li class="layui-nav-item"><a href="">云市场</a></li>--%>
<%--  <li class="layui-nav-item"><a href="">社区</a></li>--%>
<%--</ul>--%>

<%--<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">--%>
<%--  <legend>侧边固定导航菜单</legend>--%>
<%--</fieldset>--%>

<%--← 囖，就左边那家伙！ 带图标神马的那是必须可以的。另外你可能还需要下拉菜单，这个将在下版本推出！--%>

<%--<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">--%>
<%--  <legend>默认面包屑</legend>--%>
<%--</fieldset>--%>

<%--<span class="layui-breadcrumb">--%>
<%--  <a href="/">首页</a>--%>
<%--  <a href="/demo/">演示</a>--%>
<%--  <a><cite>导航元素</cite></a>--%>
<%--</span>--%>

<%--<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">--%>
<%--  <legend>自定义分隔符的面包屑</legend>--%>
<%--</fieldset>--%>

<%--<span class="layui-breadcrumb" lay-separator="—">--%>
<%--  <a href="">首页</a>--%>
<%--  <a href="">国际新闻</a>--%>
<%--  <a href="">亚太地区</a>--%>
<%--  <a><cite>正文</cite></a>--%>
<%--</span>--%>

<%--<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">--%>
<%--  <legend>还可以用于门户频道的面包屑</legend>--%>
<%--</fieldset>--%>
<%%>
<div id = "pro">
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
</div>

<span class="layui-breadcrumb" lay-separator="|">
  <a href="">娱乐</a>
  <a href="">八卦</a>
  <a href="">体育</a>
  <a href="">搞笑</a>
  <a href="">视频</a>
  <a href="">游戏</a>
  <a href="">综艺</a>
</span>

<p class="layui-elem-quote">其实就是自定义了个“|”的分隔符，然后最后一项也可以点。</p>

<script src="//unpkg.com/layui@2.6.4/dist/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述 JS 路径需要改成你本地的 -->
<script>
  layui.use('element', function(){
    var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块

    //监听导航点击
    element.on('nav(demo)', function(elem){
      //console.log(elem)
      layer.msg(elem.text());
    });
  });


</script>


</body>
</html>
