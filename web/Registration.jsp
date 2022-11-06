<%-- 
    Document   : index
    Created on : Aug 22, 2021, 11:20:24 AM
    Author     : Usman Rana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="./RegServlet">
            
            <table border="5px">
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="email" name="email"></td>
                </tr>
                
                <tr>
                    <td>City</td>
                    <td><input type="text" name="city"></td>
                </tr>
                <tr>
                    <td>Mobile</td>
                    <td><input type="mobile" name="mobile"></td>
                </tr>
                <tr>
                    <td>password</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td><input type="reset"></td>
                    <td><input type="submit"></td>
                </tr>
                
            </table>
            
        </form>
    </body>
</html>
