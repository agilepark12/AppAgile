<%-- 
    Document   : Menu
    Created on : 02-dic-2018, 16:59:34
    Author     : johndavis09
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Stylees/estilosAP.css" rel="stylesheet" type="text/css"/>
        <title>menu</title>

    </head>
    <body class="inicio">
    <center><h1 class="textopri">Control de Estacionamiento</h1></center>

    <table id="colorbox" class="azul">
        <div id="menu">

            <ul class="green">
                <li><a href="menu.jsp"> inicio </a></li>
                <li>
                    <a href="menu.jsp"> usuarios </a>
                    <ul>
                        <li><a href="iniciosesion.jsp">cerrar sesion</a></li>
                        <li><a href="regisUsuario.jsp"> crear usuario </a></li>
                    </ul>
                </li>
                <li>
                    <a href="menu.jsp"> Cliente </a>
                    <ul>                                                    
                        <li><a href="regisVehiculo.jsp">vehiculo</a></li>
                        <li><a href="validAuto.jsp">empresa</a></li>                           
                    </ul>
                </li>
            </ul>
            <ul class="ing">
                <li>
                    <a href="menu.jsp"> Bienvenido:  <%out.println();%></a>
                    <ul>

                    </ul>
                </li>
            </ul>
        </div>
    </table>

    <table>
        <div class="foo">
            <div class="footer" ><h2> MISION: </h2>
                <h3>Fragmento de un escrito con unidad temática, que queda diferenciado del resto de fragmentos
                    por un punto y aparte y generalmente también por llevar letra mayúscula inicial y un espacio 
                    en blanco en el margen izquierdo de alineación del texto principal de la primera línea parágrafo
                </h3>
            </div>
            <div class="footer2" ><h2> VISION: </h2>
                <h3>Fragmento de un escrito con unidad temática, que queda diferenciado del resto de fragmentos
                    por un punto y aparte y generalmente también por llevar letra mayúscula inicial y un espacio 
                    en blanco en el margen izquierdo de alineación del texto principal de la primera línea parágrafo
                </h3>
            </div>
        </div>
    </table>

</body>

</html>
