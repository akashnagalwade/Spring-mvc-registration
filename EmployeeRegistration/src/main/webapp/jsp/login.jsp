<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style>
.form-container {
    width: 300px;
    margin: 0 auto;
}

.form-container label {
    display: block;
    margin-bottom: 10px;
}

.form-container input[type="text"],
.form-container input[type="password"] {
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
}

.form-container button {
    width: 100%;
    padding: 10px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

.form-container button:hover {
    background-color: #3E8E41;
}
</style>
</head>
<body>
    <h1 style="text-align: center;">Employee Login</h1>
    <form id="loginForm" action="loginProcess" method="post" class="form-container">
        <table align="center">
            <tr>
                <td><label for="loginId">Login Id</label></td>
                <td><input type="text" id="loginId" name="loginId" /></td>
            </tr>
            <tr>
                <td><label for="password">Password:</label></td>
                <td><input type="password" id="password" name="password" /></td>
            </tr>
            <tr>
                <td></td>
                <td align="left"><button type="submit" id="login">Login</button></td>
            </tr>
            <tr></tr>
            <tr>
                <td></td>
                <td><a href="home.jsp">Home</a></td>
            </tr>
        </table>
    </form>
    <table align="center">
        <tr>
            <td style="font-style: italic; color: red;">${message}</td>
        </tr>
    </table>
</body>
</html>
