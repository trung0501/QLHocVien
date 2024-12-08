<%-- 
    Document   : display
    Created on : Dec 8, 2024, 9:33:08 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý học viên</title>
    </head>
    <body>
        <h1>Quản lý học viên</h1>
        <form method="post" action="displayservlet">
            <table>
                <tr>
                    <td><lable>Ma hoc vien:</lable></td>
                    <td><input type="text" name="mahv"></td>
                </tr>
                <tr>
                    <td><lable>Ho ten:</lable></td>
                    <td><input type="text" name="hoten"></td>
                </tr>
                <tr>
                    <td><lable>Ngay sinh:</lable></td>
                    <td><input type="text" name="ngaysinh"></td>
                </tr>
                <tr>
                    <td><lable>Diem:</lable></td>
                    <td><input type="text" name="diem"></td>
                </tr>
                <tr>
                    <td>
                        <button type="submit" name="chucnang" value="them">Them</button>
                        <button type="submit" name="chucnang" value="xoa">Xoa</button>
                    </td>
                </tr>
                <tr>
                    <td><lable>Tim kiem theo diem:</lable></td>
                    <td>
                        <input type="number" name="fr">
                        <input type="number" name="fr">
                        <button type="submit" name="chucnang" value="tk">Tim kiem</button>
                    </td>
                </tr>
            </table>
                
    </body>
</html>
