<%-- 
    Document   : logeo
    Created on : 22-feb-2019, 18:27:34
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
<body class="bodem_1">

<center><h1 class="textopri">Formulario de Registro Cliente Empresa</h1></center>
<form class="formu_1" action="ConsultarPlaca" method="post">
    <label class="boxre">Placa</label>
    <input class="texre" type="text" name="Placa" placeholder="placa" required pattern="[A-Z0-9]{6,8}" title="ingrese solo mayusculas"><br>
    <input class="inpre" name="xx" type="submit" value="consultar" onClick="document.formu.xx.disabled">
</form>
</body>
</html>