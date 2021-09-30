    Document   : index
    Created on : 29/09/2021, 09:05:28 PM
    Author     : emart
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
       <link rel="preconnect" href="https://fonts.googleapis.com">
       <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
       <link rel="stylesheet" href="css/styles.css">
        <title>Iniciar Sesion</title>
    </head>
    <body>
        
        <div class="global-container">
            <div class="card login-form">
                <div class="card-body">
                    <h1 class="card-title text-center">LOGIN</h1>
                    <div class="card-text">
                        <form method="POST" action="UsuariosServlet">
                            <div class="form-group">
                                <label for="usuario">Usuario: </label>
                                <input type="text" class="form-control form-control-sm" name="usuario" placeholder="Digite el nombre de usuario"/>
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="contrasena">Contraseña: </label>
                                <input type="password" class="form-control form-control-sm" name="contrasena" placeholder="Digite la contraseña"/>
                            </div>
                            <br> 
                            <button type="submit" class="btn btn-primary btn-block form-control">Iniciar Sesión</button>
                            
                        
                        </form>
                    </div>
                </div>
            </div>
        
        </div>
        
       
</html>