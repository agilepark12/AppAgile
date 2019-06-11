<%-- 
    Document   : regisEmpresa
    Created on : 12-feb-2019, 18:56:57
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

</head>
<body class="bodem">

<center><h1 class="textopri">Formulario de Registro Cliente Empresa</h1></center>

<form name="formu" class="formu_2" action="RegisEm" method="post">
    <label class="boxre">placa</label>
    <input class="texre" type="text" name="placa-e" placeholder=" placa " required pattern="[A-Z0-9]{6,8}" title="ingrese texto en MAYUSCULAS"><br>
    <label class="boxre">Nombre</label>
    <input class="texre" type="text" name="nom-e" placeholder=" nombre " required pattern="[A-Z]{3,15}" title="debe contener minimo 3 letras en MAYUSCULAS"><br>
    <label class="boxre">Apellido</label>
    <input class="texre" type="text" name="ape-e"  placeholder=" apellido " required pattern="[A-Z]{3,15}" title="debe contener minimo 3 letras en MAYUSCULAS"><br>
    <label class="boxre">TipoDocumneto</label>
    <select class="selusu" name="tipodoc-e" size="2"   required >
        <option value="1">pasaporte</option>
        <option value="2">cedula</option>
        <option value="3">tarjeta Identidad</option>
        <option value="4">cedula de extranjeria</option>      
    </select><br>
    <br>
    <br>    
    <label class="boxre">Documento</label>
    <input class="texre" type="text" name="doc-e" pattern="[0-9]{4,15}"  title="debe contener minomo 4 numeros" placeholder="Documento" required ><br>
    <label class="boxre">Departamento</label>
    <select class="selusu" name="depa-e" size="2" required>
        <option value="1"> of. cartera </option>
        <option value="2"> of. compras </option>
        <option value="3"> of. tecnologia </option>
        <option value="4"> of. tesoreria </option>
        <option value="5"> of. gerencia </option>
        <option value="6"> of. diseño </option>
        <option value="7"> of. atencion al cliente </option>
    </select><br><br>
    <br>
    <input class="inpre" type="submit" value="Registrar" >
    <br>
    <br>
    <input class="volver" type="button" value="menu" onClick="location.href = 'menu.jsp'">
    <br>
</form>
<br>
<br>
</body>
</html>


