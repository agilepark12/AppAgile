<%-- 
    Document   : job
    Created on : 05-may-2019, 14:40:21
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
                <h1 class="texto" >Formulario de Registro Vehiculos Diarios</h1>
                <br>
                <br>
                <form action="vehiculo" method="post" class="form-ing" >
                    <div class="form-row">
                        <div class="form-group col-md-5">
                            <label for="placa_E">Placa</label>
                            <input type="text" class="form-control" name="pla"  id="placa_E" pattern="[A-Z0-9A-Z]{6,8}"  placeholder="Placa" required style="text-transform: uppercase ">
                        </div>
                        <div class="form-group col-md-7">
                            <label for="Marca_E">Marca</label>
                            <input type="text" class="form-control" name="mar" id="Marca_E" placeholder="Marca" required pattern="[A-Z]{2,15}" style="text-transform: uppercase ">
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="inputState">Color</label>
                            <select  class="form-control"  name="col" size="1" required title="debe seleccionar un color">
                                <option selected>Selecciona...</option>
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
                            </select>
                        </div>
                        <div class="form-group col-md-6">
                            <label for="inputState">Tipo Vehiculo</label>
                            <select  class="form-control"  name="tipo" size="1" required title="debe realizar una seleccion">
                                <option selected>Selecciona..</option>
                                <option value="1">bicicleta</option>
                                <option value="2">moto</option>
                                <option value="3">auto</option>
                                <option value="4">camioneta</option>
                                <option value="5">pesado</option>
                            </select>
                        </div>
                    </div>
                    <label>Foto del Vehiculo</label>
                    
                    <div class="custom-file filing">
                        <input  type="file" class="custom-file-input" accept="image/*"  name="foto" id="validatedCustomFile" required title="debe cargar la foto ">
                        <label class="custom-file-label"  for="validatedCustomFile" >Buscar archivo...  </label>
                        
                    </div>
                  
                    <br>
                    <br>
                        <button type="submit" class="btn btn-info" value="Registrar">Registrar</button>
                        <button type="submit" class="btn btn-info" value="Volver" onClick="location.href = 'menu.jsp'">Volver</button>

                </form>
            </div>
        </div>
        <footer class="footini"> AgilePark  2019</footer>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>

</html>


