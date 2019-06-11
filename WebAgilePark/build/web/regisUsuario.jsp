<%-- 
    Document   : regisUsuario
    Created on : 02-dic-2018, 17:04:32
    Author     : johndavis09
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Stylees/estilosAP.css" rel="stylesheet" type="text/css"/>
        <title>regisUsuario</title>

    </head>


    <body class="bodusu">

    <center><h1 class="textopri">Formulario control de Usuarios</h1></center>
    <form class="formu_usu" action="usuario" method="post">
        <label class="boxre">Nombre</label>
        <input class="texre" type="text" name="Nombre" pattern="[a-z]{4,15}"  title="unicamente letras" placeholder="Nombre" required title="debe ingresar nombre"><br>
        <label class="boxre">Apellido</label>
        <input class="texre" type="text" name="Apellido" pattern="[a-z]{4,15}"  title="unicamente letras" placeholder="Apellido" required title="debe ingresar apellido"><br>
        <label class="boxre">Tipo documento</label>
        <select class="selusu" name="Tipodocumento" size="2" required="" title="debe seleccinar un tipo de documento">
            <option value="1">pasaporte</option>
            <option value="2">cedula</option>
            <option value="3">tarjeta Identidad</option>
            <option value="4">cedula de extranjeria</option>      
        </select><br>
        <br>
        <br>    
        <label class="boxre">Documento</label>
        <input class="texre" type="text" name="Documento" pattern="[0-9]{4,15}"  title="unicamente numeros" placeholder="Documento" required title="debe contener minimo 4 numeros"><br>
        <label class="boxre">Clave</label>
        <input class="texre" type="password" name="Clave" pattern="[A-Za-z0-9]{6,8}" 
               title="debe ser una calve compuesta de mayusculas, minusculas y numeros en orden aleatorio" 
               placeholder="Clave" required><br>
        <label class="boxre">Tipo</label>
        <select class="selog" name="Tipologis" size="2" required title="debe seleccionar un departamento">
            <option value="1">SuperAdmin</option>
            <option value="2">Admin</option>
            <option value="3">Logistico</option>
        </select><br>
        <br>
        <br>
        <input class="inpre" type="submit" value="Registrar"><br>
        <br>
        <input class="volver" type="button" value="menu" onClick="location.href='menu.jsp'">


    </form>
</body>
</html>
