<%-- 
    Document   : regisVehiculo
    Created on : 4/12/2018, 08:29:46 PM
    Author     : jhoana cardona
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Stylees/estilosAP.css" rel="stylesheet" type="text/css"/>
        <title>regisVehiculo</title>
    </head>
    


</head>
<body class="bodreg">

<center><h1 class="textopri">Formulario de Registro Vehiculos Diarios</h1></center>
<form class="formu_reg" action="vehiculo" method="post">
    <label class="boxre">Color</label>
    <select class="selre" name="col" size="2" required title="debe seleccionar un color">
        <option value="beige">beige</option>
        <option value="negro">negro</option>
        <option value="azul">azul</option>
        <option value="marron">marron</option>
        <option value="plateado">plateado</option>
        <option value="naranja">naranjado</option>
        <option value="blanco">blanco</option>
        <option value="gris">gris</option>
        <option value="crema">crema</option>
        <option value="dorado">dorado</option>
        <option value="amarillo">amarillo</option>
        <option value="morado">morado</option>
        <option value="vinotinto">vinotinto</option>
        <option value="verde">verde</option>
        <option value="otro">otro</option>
    </select><br>
    <br>
    <label class="boxre">Placa</label>
    <input class="texre" type="text" name="pla"  id="placa_E" pattern="[A-Z0-9]{6,8}"  placeholder="Placa" required title="debe contener mayusculas"><br>
    <label class="boxre">Marca</label>
    <input class="texre" type="text" name="mar" placeholder="Marca" required pattern="[A-Z]{3,15}" title="debe ingresar la marca del vehiculo en mayuscula"><br>

    <label class="boxre">Foto</label>
    <div id="div-file">
        <input id="addfile" placeholder="Añadir Foto"> </input>
    <input class="file-input" id="btn" type="file" accept="image/*"  name="foto" placeholder="foto" required title="debe cargar la foto"><br>
    </div>
    <label class="boxre">Clase</label>
    <select class="selre"  name="tipo" size="2" required title="debe realizar una seleccion">
        <option value="1">bicicleta</option>
        <option value="2">moto</option>
        <option value="3">auto</option>
        <option value="4">camioneta</option>
        <option value="5">pesado</option>
    </select><br>
    <br> 
    <br>
    <input class="inpre" type="submit" value="Registrar" >
    <br>
    <br>
    <input class="inpre" type="button" value="   volver  " onClick="location.href = 'menu.jsp'"">
</form>
<br>
<br>
</body>
</html>
