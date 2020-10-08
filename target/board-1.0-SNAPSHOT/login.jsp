<%--
  Created by IntelliJ IDEA.
  User: louis
  Date: 2020/10/05
  Time: 12:58 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<center>
    <h1>Log In</h1>
    <hr>
    <form action="login.do" method="post">
        <table border="1" cellpadding="0" cellspacing="0">
            <tr>
                <td bgcolor="orange">ID</td>
                <td><input type="text" name="id"/></td>
            </tr>
            <tr>
                <td bgcolor="orange">PWD</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Log In">
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
