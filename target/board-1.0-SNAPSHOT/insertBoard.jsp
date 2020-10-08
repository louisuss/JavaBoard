<%--
  Created by IntelliJ IDEA.
  User: louis
  Date: 2020/10/05
  Time: 6:49 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>ADD NEW CONTENT</title>
</head>
<body>
<center>
    <h1>ADD NEW CONTENT</h1>
    <hr>
    <form action="insertBoard.do" method="post">
        <table border="1" cellpadding="0" cellspacing="0">
            <tr>
                <td bgcolor="orange" width="70">TITLE</td>
                <td align="left"><input type="text" name="title"></td>
            </tr>
            <tr>
                <td bgcolor="orange">WRITER</td>
                <td align="left"><input type="text" name="title" size="10"></td>
            </tr>
            <tr>
                <td bgcolor="orange">CONTENT</td>
                <td align="left"><textarea name="content" cols="30" rows="10"></textarea></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="NEW CONTENT"/></td>
            </tr>
        </table>
    </form>
    <hr>
    <a href="WEB-INF/board/getBoardList.jsp">LIST</a>
</center>
</body>
</html>
