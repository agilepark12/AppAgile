<%-- 
    Document   : logeo
    Created on : 22-feb-2019, 18:27:34
    Author     : ASUS
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><link href="Stylees/estilosAP.css" rel="stylesheet" type="text/css"/>
        <title>menu</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body class="inicio">
        <h1 class="textopri">Control de Estacionamiento</h1>
        <br>
        <br>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Navegador</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse " id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item " >
                        <a class="nav-link" href="#" onClick="location.href = 'iniciosesion.jsp'" >Inicio <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Estado</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Clientes
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="regisVehiculo.jsp">Cliente dia</a>
                            <a class="dropdown-item" href="validAuto.jsp">Cliente empresa</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Administracion
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="regisUsuario.jsp">Crear usuario</a>
                            <a class="dropdown-item" href="#">Eliminar usuario</a>
                            <a class="dropdown-item" href="#">Actualizar usuario</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Control</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <div>
                        <h2><span class="badge badge-info">nombre de usuario</span></h2>
                    </div>
                </form>
            </div>
        </nav>
        <br>
        <br>
        <br>

        <div class="jumbotron jumbotron-fluid jumbotron-ing">
            <div class="container">
                <h1 class="texto" >Consulta Vehiculo en Base de Datos</h1>
                <br>
                <br>
                <form class="form-inline forming" action="ConsultarPlaca" method="post" >
                    <div class="form-group mb-2">
                        <input type="text"  class="form-control-plaintext"  value="Consultar Placa:">
                    </div>
                    <div class="form-group mx-sm-3 mb-2">
                        
                        <input type="text" class="form-control" name="Placa"  placeholder="Placa" required pattern="" style="text-transform: uppercase ">
                    </div>
                    <button type="submit" class="btn btn-info mb-2"  onClick="document.formu.xx.disabled">Confirmar Vehiculo</button>
                </form>
            </div>
        </div>
        <footer class="footini"> AgilePark  2019</footer>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>

</html>
