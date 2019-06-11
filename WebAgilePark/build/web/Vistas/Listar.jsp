<%-- 
    Document   : Listar
    Created on : 11-may-2019, 12:02:46
    Author     : ASUS
--%>

<%@page import="java.util.Iterator"%>
<%@page import="modelos.Persona"%>
<%@page import="java.util.List"%>
<%@page import="modelos.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar</title>
    </head>
    <body>
        <div>
            <h1>Listar personas</h1>
            <a href="Controlador?accion=add">Agregar Cliente Empleado</a>
            <table border="1">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>TipoDocumento</th>
                        <th>Documento</th>
                        <th>Departamento</th>
                        <th>Placa</th>
                    </tr>
                </thead>
                <%
                PersonaDAO dao=new PersonaDAO();
                List<Persona>list=dao.Listar();
                Iterator<Persona>iter=list.iterator();
                Persona per = null;
                while(iter.hasNext()){
                    per=iter.next();
               
                %>
                <tbody>
                    <tr>
                        <td><%=per.getNom_E()%></td>
                        <td><%=per.getApe_E()%></td>
                        <td><%=per.getTipoDoc_E()%></td>
                        <td><%=per.getDoc_E()%></td>
                        <td><%=per.getDepa_E()%></td>
                        <td><%=per.getPlaca_E()%></td>
                        <td>
                            <a>Editar</a>
                            <a>Remover</a>
                        </td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
    </body>
</html>
