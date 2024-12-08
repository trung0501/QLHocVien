<%-- 
    Document   : login
    Created on : Dec 8, 2024, 11:46:30 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Dang nhap tai khoan</h1>
        <from action="Loginservlet_21103100534" method="post">
            taikhoan:<input type="text" name="username" required><br><br>
            matkhau:<input type="text" name="password" required><br><br>
            <input type="submit" value="login">
            <input type="reset" value="reset">
        </from>
              
        
    </body>
</html>
