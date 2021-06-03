<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/5/2
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <script type="text/javascript" src="jquery.js"></script>
</head>
<body>

<select id="se">
  <option value="dfs" name="ji">jihu</option>
  <option value="sad" name="ji"> dsds</option>
  <option value="dfddf" name="ji"> dsads</option>
</select>
<input type="text" id="ip2"/>
  <script type="text/javascript">
      $(function () {
        $("#se").on("change",function () {
          var zhi = $(this).val();
          alert(zhi)
          $("#ip2").val(zhi);

        })
      })
  </script>

</body>
</html>
