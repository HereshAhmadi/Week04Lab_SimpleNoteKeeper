<%-- 
    Document   : editnote
    Created on : Feb 2, 2021, 1:48:47 PM
    Author     : 699785
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Edit Note</h1>
        <h2>View Note</h2>
        <form method="post" action="NoteServlet">
        <b>Title: <input type="text" name="title" value="${note.title}" /> <br>
            <b>Contents: <input type="textarea" name="content" value="${note.content}" /> <br>
        <a href="NoteServlet" name="save">Save</button>
        </form>
           
    </body>
</html>
