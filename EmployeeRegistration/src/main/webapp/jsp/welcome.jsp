<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome</title>
    <style>
        /*  CSS styles  */
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 80%; /* Adjust width as needed */
            margin: 20px auto; /* Center the container */
            background-color: #fff;
            border: 1px solid #ccc;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .welcome-message {
            font-size: 24px;
            margin-bottom: 20px;
        }

        .navigation-link {
            text-decoration: none;
            color: #007bff;
        }

        .navigation-link:hover {
            color: #0056b3;
        }
        .link-separator {
    margin: 0 10px; /* Adjust the margin as needed */
    color: #ccc; /* change color or other styles */
}
        
    </style>
</head>

<body>
    <div class="container">
        <div class="welcome-message">Welcome ${name}</div>

        <a href="listEmployees" class="navigation-link">View Employee List</a>

        <span class="link-separator">&nbsp;&nbsp;|&nbsp;&nbsp;</span>

        <a href="home.jsp" class="navigation-link">Home</a>
    </div>
</body>

</html>
