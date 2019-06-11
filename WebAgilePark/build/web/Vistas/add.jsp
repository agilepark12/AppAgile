<%-- 
    Document   : add
    Created on : 11-may-2019, 12:03:02
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Stylees/estilosAP.css" rel="stylesheet" type="text/css"/>
        <title>regisEmpresa</title>
    </head>
    <body>
        <h1>Agregar Cliente</h1>
        <form action="Controlador">
            <div>
                <label for="txtname">Nombre</label>
                <input type="text"  name="txtname">
            </div>
            <div>
                <label for="txtlast">Apellido</label>
                <input type="text" name="txtlast">
            </div>
            <div>
                <label for="txttipo" >Tipo Documento</label>
                <select name="txttipo">
                    <option value="1">pasaporte</option>
                    <option value="2">cedula</option>
                    <option value="3">tarjeta Identidad</option>
                    <option value="4">cedula de extranjeria</option>    
                </select>
            </div>
            <div>
                <label for="txtdoc" >Documento</label>
                <input type="text" name="txtdoc">
            </div>
            <div>
                <label for="txtdep" >Departamento</label>
                <select name="txtdep">
                    <option value="1"> of. Cartera </option>
                    <option value="2"> of. Compras </option>
                    <option value="3"> of. Tecnologia </option>
                    <option value="4"> of. Tesoreria </option>
                    <option value="5"> of. Gerencia </option>
                    <option value="6"> of. Diseño </option>
                    <option value="7"> of. Atencion al cliente </option>
                </select>
            </div>
            <div>
                <label for="txtplaca" >Placa</label>
                <input type="text" name="txtplaca">
            </div>
            <br>
            <input class="inpre" type="submit" name="accion" value="Registrar" >
            <br>
            <br>
            <input class="volver" type="button" value="menu" onClick="location.href = 'index.jsp'">
            <br>
        </form>
    </body>
</html>
