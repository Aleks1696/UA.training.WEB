
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
    <h2>It seems like something went wrong</h2>
    <br>
    <%
        Object errorMessage = request.getAttribute("errorMessage");
    %>
    <h4>Info: <%= errorMessage.toString()%> </h4>
    <br>
    <input type="button" value="Try again"
           onclick="location.href = 'http://localhost:8080/registrationFrom_WEB_war_exploded/'"/>
</body>
</html>
