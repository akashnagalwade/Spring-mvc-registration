<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration</title>
<style>
    /* CSS styles */
    body {
        font-family: Arial, sans-serif;
    }
    table {
        border-collapse: collapse;
        width: 50%;
        margin: auto;
    }
    th, td {
        padding: 10px;
        border: 1px solid #ccc;
    }
    input[type="text"], input[type="password"], input[type="date"] {
        width: 100%;
        padding: 8px;
        border-radius: 5px;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }
    input[type="submit"], input[type="button"] {
        padding: 10px 20px;
        background-color: #4CAF50;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }
    
    input[type="submit"]:hover, input[type="button"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
    <h2 style="text-align: center;">Employee Registration Form</h2>
    <form:form id="regForm" modelAttribute="employee"
        action="registerProcess" method="post">

        <table align="center">
            <tr>
                <td><form:label path="name">Name</form:label></td>
                <td><form:input path="name" name="name" id="name" /></td>
            </tr>

            <tr>
                <td><form:label path="dateOfBirth">Date Of Birth</form:label></td>
                <td><form:input path="dateOfBirth" name="dateOfBirth"
                        id="dateOfBirth" type="date" /></td>
            </tr>
            <tr>
                <td><form:label path="gender">Gender</form:label></td>
                <td><form:radiobutton path="gender" id="male" value="Male" />
                    Male <form:radiobutton path="gender" id="female" value="Female" />
                    Female <form:radiobutton path="gender" id="other" value="Other" />
                    Other</td>
            </tr>
            <tr>
                <td><form:label path="address">Address</form:label></td>
                <td><form:input path="address" name="address" id="address" /></td>
            </tr>
            <tr>
                <td><form:label path="city">City</form:label></td>
                <td><form:input path="city" name="city" id="city" /></td>
            </tr>

            <tr>
                <td><form:label path="state">State</form:label></td>
                <td><form:input path="state" name="state" id="state" /></td>
            </tr>

            <tr>
                <td><form:label path="loginId">Login ID</form:label></td>
                <td><form:input path="loginId" name="loginId" id="loginId" /></td>
            </tr>

            <tr>
                <td><form:label path="password">Password</form:label></td>
                <td><form:password path="password" name="password"
                        id="password" /></td>
            </tr>
            <tr>
                <td></td>
                <td><form:button id="register" name="register">Register</form:button></td>
            </tr>
            <tr></tr>
            <tr>
                <td></td>
                <td><a href="home.jsp">Home</a></td>
            </tr>
        </table>
    </form:form>
     <table align="center">
        <tr>
            <td style="font-style: italic; color: red;">${message}</td>
        </tr>
    </table>

</body>
</html>
