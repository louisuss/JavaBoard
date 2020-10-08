<%--
  Created by IntelliJ IDEA.
  User: louis
  Date: 2020/10/06
  Time: 11:49 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ERROR PAGE</title>
</head>
<body bgcolor="#ffffff" text="#000000">
<table width="100%" border="1" cellspacing="0" cellpadding="0">
    <tr><tr align="center" bgcolor="orange"><b>ERROR PAGE</b></tr></tr>
</table>
<br>
<table width="100%" border="1" cellpadding="0" cellspacing="0" align="center">
    <tr>
        <td align="center">
            <br><br><br><br>
            Message: ${exception.message}
            <br><br><br><br>
        </td>
    </tr>
</table>
</body>
</html>
