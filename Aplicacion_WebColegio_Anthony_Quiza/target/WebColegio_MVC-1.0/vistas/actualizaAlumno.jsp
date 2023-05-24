<%-- 
    Document   : actualizaAlumno
    Created on : 16 may. 2022, 16:22:19
    Author     : Smuk
--%>

<%@page import="Entidad.Alumno"%>
<%@page import="Modelo.ModeloAlumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Alumnos</title>
    </head>
    <body>
        <%
            ModeloAlumno modelo = new ModeloAlumno();
            int id =Integer.parseInt((String)request.getAttribute("idal"));
            Alumno a =(Alumno)modelo.list(id);
        %>
        <div>
            <h1>Actualizar Alumno</h1>
            <form action="ServletAlumno">
                Nombres<br>
                <input type="text" name="txtNombre" value="<%= a.getNombres()%>"><br>
                Apellidos<br>
                <input type="text" name="txtApellido" value="<%= a.getApellidos()%>"><br>
                Edad<br>
                <input type="text" name="txtEdad" value="<%= a.getEdad()%>"><br>
                <br>
                <input type="hidden" name="txtid" value="<%= a.getIdAlumno()%>">
                <input type="submit" name="accion" value="Actualizar">
                <a href="ServletAlumno?accion=listar">[Regresar]</a>
            </form>
        </div>
    </body>
</html>
