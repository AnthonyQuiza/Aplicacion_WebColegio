<%-- 
    Document   : listaDocente
    Created on : 19 may. 2022, 15:56:57
    Author     : Smuk
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Entidad.Docente"%>
<%@page import="Modelo.ModeloDocente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Docentes</title>
    </head>
    <body>
        <a href="index.jsp">[Regresar]</a>  <br>
        <div>
            <h1>Docentes</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRES</th>
                        <th>APELLIDOS</th>
                        <th>ESPECIALIDAD</th>
                        <th>FECHA DE INGRESO</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                    ModeloDocente modelo = new ModeloDocente();
                    List<Docente> list = modelo.listar();
                    for (Docente d : list) {

                %>
                <tbody>
                    <tr>
                        <td><%= d.getIdDocente()%></td>
                        <td><%= d.getNombres()%></td>
                        <td><%= d.getApellidos()%></td>
                        <td><%= d.getEspecialidad()%></td>
                        <td><%= d.getFechaIngreso()%></td>
                        <td>
                            <a href="ServletDocente?accion=editar&id=<%= d.getIdDocente()%>">Editar</a>
                            <a href="ServletDocente?accion=eliminar&id=<%= d.getIdDocente()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table><br>
        </div>
    </body>
</html>
