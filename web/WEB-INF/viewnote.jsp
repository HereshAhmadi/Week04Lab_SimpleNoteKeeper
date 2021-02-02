<%-- 
    Document   : viewnote
    Created on : Feb 2, 2021, 1:49:12 PM
    Author     : 699785
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <b>Title: ${note.title} <br>
        <b>Contents: ${note.content} <br>
        <a href="NoteServlet?edit">Edit</a>
    </body>
</html>
