<%--
  Created by IntelliJ IDEA.
  User: louis
  Date: 2020/10/05
  Time: 6:36 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>

</head>
<body>
<center>
    <h1><spring:message code="message.board.list.mainTitle"/></h1>
    <h3>${userName}<spring:message code="message.board.list.welcomeMsg"/></h3>
    <a href="logout.do">Log Out</a>

    <form action="getBoardList.jsp" method="post">
        <table border="1" cellpadding="0" cellspacing="0" width="700">
            <td align="right">
                <select name="searchCondition">
                    <option value="TITLE">TITLE</option>
                    <option value="CONTENT">CONTENT</option>
                </select>
                <input type="text" name="searchKeyword"/>
                <input type="submit" value="<spring:message code="message.board.list.search.condition.btn"/>"/>
            </td>
        </table>
    </form>

    <table border="1" cellspacing="0" cellpadding="0" width="700">
        <tr>
            <th bgcolor="orange" width="100">NUMBER</th>
            <spring:message code="message.board.list.table.head.seq"/>
            <th bgcolor="orange" width="200">TITLE</th>
            <spring:message code="message.board.list.table.head.title"/>
            <th bgcolor="orange" width="150">WRITER</th>
            <spring:message code="message.board.list.table.head.writer"/>
            <th bgcolor="orange" width="150">DATE</th>
            <spring:message code="message.board.list.table.head.regDate"/>
            <th bgcolor="orange" width="100">COUNT</th>
            <spring:message code="message.board.list.table.head.cnt"/>
        </tr>

        <c:forEach items="${boardList}" var="board">
        <tr>
            <td>${board.seq}</td>
            <td align="left"><a href="getBoard.do?seq=${board.seq}">${board.title}</a></td>
            <td>${board.writer}</td>
            <td>${board.regDate}</td>
            <td>${board.cnt}</td>
        </tr>
        </c:forEach>
    </table>
    <br>
    <a href="insertBoard.jsp">
        <spring:message code="message.board.list.link.insertBoard"/>
    </a>
</center>
</body>
</html>
