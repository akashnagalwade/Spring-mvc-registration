<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>Welcome</h1>
    
    <h2> Employees List</h2>
    <table>
        <tr>
            <th>Name</th>
            <th>Date of Birth</th>
            <th>Gender</th>
            <th>Address</th>
            <th>City</th>
            <th>State</th>
            <th>Login ID</th>
            <th>Password</th>
        </tr>
        <c:forEach items="${employees}" var="emp">
            <tr>
                <td>${emp.name}</td>
                <td>${emp.dateOfBirth}</td>
                <td>${emp.gender}</td>
                <td>${emp.address}</td>
                <td>${emp.city}</td>
                <td>${emp.state}</td>
                <td>${emp.loginId}</td>
                <td>${emp.password}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
