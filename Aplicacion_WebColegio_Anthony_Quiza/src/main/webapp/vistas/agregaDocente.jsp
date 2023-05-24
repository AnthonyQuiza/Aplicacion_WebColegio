<%-- 
    Document   : agregaDocente
    Created on : 19 may. 2022, 16:11:30
    Author     : Smuk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Docentes</title>
    </head>
    <body>
        <a href="index.jsp">[Regresar]</a>  <br>
        <div>
            <h1>Agregar Docente</h1>
            <form action="ServletDocente">
                ID<br>
                <input type="text" name="txtId"><br>
                Nombres<br>
                <input type="text" name="txtNombre"><br>
                Apellidos<br>
                <input type="text" name="txtApellido"><br>
                Especialidad<br>
                <input type="text" name="txtEspecialidad"><br>
                Fecha de Ingreso<br>
                <input type="text" name="txtFechaIngreso"><br>
                <br>
                <input type="submit" name="accion" value="Enviar"><br>
            </form>
        </div>
    </body>
</html>
