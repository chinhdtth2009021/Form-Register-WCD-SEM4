<%@ page import="com.example.T2009m1_WCD_SEM4.entity.Account" %><%
    Account account = (Account) request.getAttribute("account");
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
    <div>Username: <%= account.getUsername()%></div>
    <div>Fullname: <%= account.getFullName()%></div>
    <div>Email: <%= account.getEmail()%></div>
    <div>Phone: <%= account.getPhone()%></div>
    <div>Birthday: <%= account.getBirthday()%></div>
</div>
</body>
</html>