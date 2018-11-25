<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h2>客户信息查询</h2><hr />
<form action="/findCustomerById" method="post">
    请输入需要查询的客户id：<input type="text" name="id" /><br />
    <input type="submit" value="查询" />
</form>

<a href="/toTest">html测试</a>
</body>
</html>
