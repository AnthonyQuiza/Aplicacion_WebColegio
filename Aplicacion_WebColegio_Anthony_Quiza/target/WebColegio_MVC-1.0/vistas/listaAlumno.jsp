<%-- 
    Document   : listaAlumno
    Created on : 16 may. 2022, 16:21:33
    Author     : Smuk
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Entidad.Alumno"%>
<%@page import="Modelo.ModeloAlumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Alumnos</title>
    </head>
    <body>
        <a href="index.jsp">[Regresar]</a>  <br>
        <%--<div><br><br>
                <th>[Buscar Alumno por Nombre]<br>
                <form action="ServletAlumno">
                        <input type="search" name="txtBuscar">
                        <input type="submit" name="accion" value="Buscar">
                </form> 
            </div>--%>
        <div>
            <h1>Alumnos</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRES</th>
                        <th>APELLIDOS</th>
                        <th>EDAD</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                    ModeloAlumno modelo = new ModeloAlumno();
                    List<Alumno> list = modelo.listar();
                    for (Alumno a : list) {

                %>
                <tbody>
                    <tr>
                        <td><%= a.getIdAlumno()%></td>
                        <td><%= a.getNombres()%></td>
                        <td><%= a.getApellidos()%></td>
                        <td><%= a.getEdad()%></td>
                        <td>
                            <a href="ServletAlumno?accion=editar&id=<%= a.getIdAlumno()%>">Editar</a>
                            <a href="ServletAlumno?accion=eliminar&id=<%= a.getIdAlumno()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table><br>
                <%--<a href="ServletAlumno?accion=BuscAlum">[Buscar Alumno]</a><br>--%>
        </div>
    </body>
</html>
