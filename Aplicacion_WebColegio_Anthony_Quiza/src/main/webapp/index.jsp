<%-- 
    Document   : index
    Created on : 16 may. 2022, 16:15:48
    Author     : Smuk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <label class="titulo">Bienvenido al Sitio WEB</label> <br> <br>
        <div>
            <a href="ServletAlumno?accion=listar">[Listar Alumnos]</a><br>
            <a href="ServletAlumno?accion=agregar">[Agregar Alumnos]</a><br>
            <a href="ServletAlumno?accion=BuscAlum">[Buscar Alumno]</a><br><br>
            <a href="ServletDocente?accion=listar">[Listar Docentes]</a><br>
            <a href="ServletDocente?accion=agregar">[Agregar Docentes]</a><br>
            <a href="ServletDocente?accion=BuscDocen">[Buscar Docente]</a><br><br>
        </div>
    </body>
</html>
