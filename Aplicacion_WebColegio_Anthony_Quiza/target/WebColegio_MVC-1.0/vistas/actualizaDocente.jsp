<%-- 
    Document   : actualizaDocente
    Created on : 19 may. 2022, 16:34:01
    Author     : Smuk
--%>

<%@page import="Entidad.Docente"%>
<%@page import="Modelo.ModeloDocente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Docentes</title>
    </head>
    <body>
        <%
            ModeloDocente modelo = new ModeloDocente();
            int id =Integer.parseInt((String)request.getAttribute("iddoc"));
            Docente d =(Docente)modelo.list(id);
        %>
        <div>
            <h1>Actualizar Docente</h1>
            <form action="ServletDocente">
                Nombres<br>
                <input type="text" name="txtNombre" value="<%= d.getNombres()%>"><br>
                Apellidos<br>
                <input type="text" name="txtApellido" value="<%= d.getApellidos()%>"><br>
                Especialidad<br>
                <input type="text" name="txtEspecialidad" value="<%= d.getEspecialidad()%>"><br>
                Fecha de Ingreso<br>
                <input type="text" name="txtFechaIngreso" value="<%= d.getFechaIngreso()%>"><br>
                <br>
                <input type="hidden" name="txtid" value="<%= d.getIdDocente()%>">
                <input type="submit" name="accion" value="Actualizar">
                <a href="ServletDocente?accion=listar">[Regresar]</a>
            </form>
        </div>
    </body>
</html>
