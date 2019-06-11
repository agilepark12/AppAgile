<%-- 
    Document   : opt
    Created on : 05-may-2019, 18:58:31
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
        <h1 class="texto">Control de Estacionamiento</h1>
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
                <center><h1 class="texto">Formulario control de Usuarios</h1></center>
                <form class=""  action="usuario" method="post"  class="form-ing">
                    <div class="form-row">
                        <div class="form-group">
                            <label for="inputLastname">Apellido</label>
                            <input type="text" class="form-control" id="inputLastname"  name="Apellido" pattern="[a-z]{4,15}"  placeholder="Apellido" required title="debe ingresar apellido">
                        </div>
                        <div class="form-group">
                            <label for="inputName">Nombre</label>
                            <input type="text" class="form-control" id="inputName"  name="Nombre" pattern="[a-z]{4,15}"   placeholder="Nombre" required title="debe ingresar nombre">
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="inputUser">Departamento</label>
                            <select id="inputUser" class="form-control" name="Tipologis" size="1" required title="debe seleccionar un departamento">
                                <option selected>Seleccionar...</option>
                                <option value="1">SuperAdmin</option>
                                <option value="2">Admin</option>
                                <option value="3">Logistico</option>
                            </select>
                        </div>
                        <div class="form-group col-md-6">
                            <label for="inputPassword10">Contraseña</label>
                            <input type="password" class="form-control" id="inputPassword10" name="Clave" pattern="[A-Za-z0-9]{6,8}" 
                                   title="debe ser una calve compuesta de mayusculas, minusculas y numeros en orden aleatorio" 
                                   placeholder="Contraseña" required>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="inputDocument">Tipo Documento</label>
                            <select id="inputDocument" class="form-control"  name="Tipodocumento" size="1" required="" title="debe seleccinar un tipo de documento">
                                <option selected>Seleccionar..</option>
                                <option value="1">pasaporte</option>
                                <option value="2">cedula</option>
                                <option value="3">tarjeta Identidad</option>
                                <option value="4">cedula de extranjeria</option>  
                            </select>
                        </div>
                        <div class="form-group col-md-6">
                            <label for="inputNumber">Documento</label>
                            <input type="text" class="form-control" id="inputNumber"  name="Documento" pattern="[0-9]{4,15}"  placeholder="Documento" required title="debe contener minimo 4 numeros">
                        </div>
                    </div>
                    <div>
                        <button type="submit" class="btn btn-info">Registrar</button>
                       
                        <button type="button" class="btn btn-info"  onClick="location.href = 'menu.jsp'">Volver</button>
                    </div>
                </form>
            </div>
        </div>
        <footer class="footini"> AgilePark  2019</footer>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>

</html>


