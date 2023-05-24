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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar Alumno</title>
    </head>
    <body>
        <a href="index.jsp">[Regresar]</a> <br><br>
        <%--<a href="vistas/listaAlumno.jsp">[Regresar a la lista]</a> <br><br>--%>
        <%--<div><br><br>
                <th>[Buscar Alumno por Nombre]<br>
                <form action="ServletAlumno">
                        <input type="search" name="txtBuscar">
                        <input type="submit" name="accion" value="Buscar">
                </form> 
            </div>--%>
        <form action="<%=request.getContextPath()%>/ServletAlumno" method="get">
            Nombre del Alumno:
            <input type="text" name="txtBuscar"/>
            <input type="submit" name="accion" value="Buscar" />
        </form>
        <br/>
        <table border="1">
            <tr>
                <td>NOMBRE</td><td>APELLIDO</td><td>EDAD</td>
            </tr>
            <c:forEach items="${resultados}" var="alumno">
                <tr>
                    <%--<td><c:out value="${alumno.IdAlumno}"></c:out></td>--%>
                    <td><c:out value="${alumno.nombres}"></c:out></td>
                    <td><c:out value="${alumno.apellidos}"></c:out></td>
                    <td><c:out value="${alumno.edad}"></c:out></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
