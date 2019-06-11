.<%-- 
    Document   : iniciosesion
    Created on : 04-dic-2018, 18:27:12
    Author     : johndavis09
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Stylees/estilosAP.css" rel="stylesheet" type="text/css"/>
        <title>Inicio</title>
    </head>
    <body>
    
    <div>
        <div>
            <h1 class="textopri">Inicio de Sesion</h1>
            <img class="bodini" src="./images/car-gto.jpg">
        </div>
        
        <div>
            <form class="formu_ini" action="Acceder" method="post">

                <label class="boxini">Documento</label><br>
                <input class="texini" type="text" name="Documento" placeholder="digite numero" required pattern="[0-9]{3,15}" title="debe contener minimo 4 numeros">
                <br>
                <label class="boxini">Clave</label><br>
                <input class="texini" type="password" name="Clave" placeholder="digite contraseña" required pattern="[A-Za-z0-9]{3,8}" title="debe contener minimo 6letras (AZ,aa,0-9)">
                <br>
                <br>
                <input class="inpin" type="submit" value="Iniciar Sesion">
            </form>
        </div>
            <h2 class="subtitini">Agilidad y Seguridad en el Parqueo</h2>
    </div>
    <footer class="footini"> AgilePark  2019</footer>
</body>
</html>
