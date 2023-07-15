<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2023/7/5
  Time: 8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>index</title>
</head>
<body>
    哈哈
    <a href="/hello/sayHello">点我</a>
    <a href="/hello/getServletAPI">原生API</a>

    <hr size="5" color="yellow">
    <a href="/hello/findById?id=1">根据ID进行查询</a>

    <hr size="5" color="yellow">
    <form action="/hello/addUser" method="post">
        用户id:<input type="text" name="id"/><br>
        用户账号：<input type="text" name="username"/><br>
        用户密码：<input type="password" name="password"/><br>
        用户地址：<input type="text" name="address"/><br>
        用户生日：<input type="text" name="birthday"/><br>
        <input type="submit" value="提交"/>
    </form>

    <hr size="5" color="yellow">
    <form action="/hello/addUser" method="post">
        用户id:<input type="text" name="id"/><br>
        用户账号：<input type="text" name="username"/><br>
        用户密码：<input type="password" name="password"/><br>
        用户地址：<input type="text" name="address"/><br>
        用户生日：<input type="text" name="birthday"/><br>
        角色id：<input type="text" name="role.id"/><br>
        角色姓名：<input type="text" name="role.roleName"/><br>
        角色描述：<input type="text" name="role.roleDesc"/><br>
        <input type="submit" value="提交"/>
    </form>

    <hr size="5" color="yellow">
    <form action="/hello/addBatchUser" method="post">
        角色id：<input type="text" name="role.id"/><br>
        角色姓名：<input type="text" name="role.roleName"/><br>
        角色描述：<input type="text" name="role.roleDesc"/><br>
        用户id:<input type="text" name="userList[0].id"/><br>
        用户账号：<input type="text" name="userList[0].username"/><br>
        用户密码：<input type="password" name="userList[0].password"/><br>
        用户地址：<input type="text" name="userList[0].address"/><br>
        用户生日：<input type="text" name="userList[0].birthday"/><br>
        用户id:<input type="text" name="userList[1].id"/><br>
        用户账号：<input type="text" name="userList[1].username"/><br>
        用户密码：<input type="password" name="userList[1].password"/><br>
        用户地址：<input type="text" name="userList[1].address"/><br>
        用户生日：<input type="text" name="userList[1].birthday"/><br>
        <input type="submit" value="提交"/>
    </form>

    <hr size="5" color="yellow">
    <form action="/hello/addBatchUser1" method="post">
        用户id:<input type="text" name="id"/><br>
        用户账号：<input type="text" name="username"/><br>
        用户密码：<input type="password" name="password"/><br>
        用户地址：<input type="text" name="address"/><br>
        用户生日：<input type="text" name="birthday"/><br>
        角色id：<input type="text" name="roleMap['one'].id"/><br>
        角色姓名：<input type="text" name="roleMap['one'].roleName"/><br>
        角色描述：<input type="text" name="roleMap['one'].roleDesc"/><br>
        角色id：<input type="text" name="roleMap['two'].id"/><br>
        角色姓名：<input type="text" name="roleMap['two'].roleName"/><br>
        角色描述：<input type="text" name="roleMap['two'].roleDesc"/><br>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
