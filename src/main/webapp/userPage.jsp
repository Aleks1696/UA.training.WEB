<%@ page import="app.model.entity.Note" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Page</title>
</head>
<body>
    <h3>Congratulations! You have successfully registered</h3>
        <%
            Note note = (Note)request.getAttribute("note");
        %>
    <table>
        <tr>
            <td><h4>Info:</h4></td>
            <td>Login: <%= note.getLogin()%></td>
        </tr>
        <tr>
            <td></td>
            <td>E-mail: <%= note.getEmail()%></td>
        </tr>
    </table>
</body>
</html>
