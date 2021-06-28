<%-- 
    Document   : shoppingList
    Created on : Jun 25, 2021, 10:03:40 PM
    Author     : 816386
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Shopping List</h1>
         <p>Hello ${username}</p>
         <a href="register?register.jsp" action="logout">Logout</a>
         <h2>List</h2> <br>
         <form action="shoppingList" method="get">
            Add Item: <input type="text" name="item" ><input type="submit" value="Add" action="add">
             
            
            <input type="submit" value="delete" action="delete">
            
        </form>
    </body>
</html>
