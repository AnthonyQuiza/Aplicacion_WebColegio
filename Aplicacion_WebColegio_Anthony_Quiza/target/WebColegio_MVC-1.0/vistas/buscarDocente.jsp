<%-- 
    Document   : buscarDocente
    Created on : 19 may. 2022, 17:01:54
    Author     : Smuk
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Entidad.Docente"%>
<%@page import="Modelo.ModeloDocente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar Docente</title>
    </head>
    <body>
        <a href="index.jsp">[Regresar]</a> <br><br>
        <form action="<%=request.getContextPath()%>/ServletDocente" method="get">
            Apellido o Especialidad del Docente:
            <input type="text" name="txtBuscar"/>
            <input type="submit" name="accion" value="Buscar" />
        </form>
        <br/>
        <table border="1">
            <tr>
                <td>NOMBRE</td><td>APELLIDO</td><td>ESPECIALIDAD</td><td>FECHA DE INGRESO</td>
            </tr>
            <c:forEach items="${resultados}" var="docente">
                <tr>
                    <td><c:out value="${docente.nombres}"></c:out></td>
                    <td><c:out value="${docente.apellidos}"></c:out></td>
                    <td><c:out value="${docente.especialidad}"></c:out></td>
                    <td><c:out value="${docente.fechaIngreso}"></c:out></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
