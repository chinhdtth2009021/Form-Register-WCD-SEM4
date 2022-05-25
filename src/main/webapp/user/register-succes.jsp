<%@ page import="com.example.T2009m1_WCD_SEM4.model.User" %><%
    User user = (User) request.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<title>Register</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-container">
    <div class="w3-panel w3-green">
        <h2 class="w3-opacity">Register Success</h2>
    </div>
    <div>FullName: <%= user.getFullName()%></div>
    <div>Username: <%= user.getUsername()%></div>
    <div>Email: <%= user.getEmail()%></div>
    <div>Password: <%= user.getPasswordHash()%></div>
    <div>Status: <%= user.getStatus()%></div>
</div>
</body>
</html>