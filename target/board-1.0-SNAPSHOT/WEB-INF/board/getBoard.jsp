<%--
  Created by IntelliJ IDEA.
  User: louis
  Date: 2020/10/05
  Time: 6:49 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="biz.board.BoardVO" %>



<html>
<head>
    <title>DETAIL</title>
</head>
<body>
<center>
    <h1>DETAIL</h1>
    <hr>
    <form action="updateBoard.do" method="post">
        <input type="hidden" name="seq" value="${board.seq}"/>
        <table border="1" cellpadding="0" cellspacing="0">
            <tr>
                <td bgcolor="orange" width="70">TITLE</td>
                <td align="left"><input type="text" name="title" value="${board.title}"/></td>
            </tr>
            <tr>
                <td bgcolor="orange">WRITER</td>
                <td align="left">${board.writer}</td>
            </tr>
            <tr>
                <td bgcolor="orange">CONTENT</td>
                <td align="left"><textarea name="content" cols="30" rows="10">${board.content}</textarea></td>
            </tr>
            <tr>
                <td bgcolor="orange">DATE</td>
                <td align="left">${board.regDate}</td>
            </tr>
            <tr>
                <td bgcolor="orange">COUNT</td>
                <td align="left">${board.cnt}</td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="MODIFY">
                </td>
            </tr>
        </table>
    </form>
    <hr>
    <a href="inserBoard.jsp">ADD</a>&nbsp;&nbsp;&nbsp;
    <a href="deleteBoard.do?seq=${board.seq}">DELETE</a>&nbsp;&nbsp;&nbsp;
    <a href="deleteBoard.do">DELETE</a>&nbsp;&nbsp;&nbsp;
    <a href="getBoardList.jsp">LIST</a>&nbsp;&nbsp;&nbsp;
</center>
</body>
</html>
