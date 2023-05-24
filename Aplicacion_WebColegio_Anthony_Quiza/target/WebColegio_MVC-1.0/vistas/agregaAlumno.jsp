<%-- 
    Document   : agregaAlumno
    Created on : 16 may. 2022, 16:22:06
    Author     : Smuk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Alumnos</title>
    </head>
    <body>
        <a href="index.jsp">[Regresar]</a>  <br>
        <div>
            <h1>Agregar Alumno</h1>
            <form action="ServletAlumno">
                ID<br>
                <input type="text" name="txtId"><br>
                Nombres<br>
                <input type="text" name="txtNombre"><br>
                Apellidos<br>
                <input type="text" name="txtApellido"><br>
                Edad<br>
                <input type="text" name="txtEdad"><br>
                <br>
                <input type="submit" name="accion" value="Enviar"><br>
            </form>
        </div>
    </body>
</html>
