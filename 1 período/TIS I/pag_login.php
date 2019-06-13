<?php 
    session_start();
?>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Pare & Repare</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Favicons -->
    <link href="https://bit.ly/2OawtAT" rel="icon">
    <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Lato:100,300,400,700,900" rel="stylesheet">

    <!-- Bootstrap CSS File -->
    <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/st.css" rel="stylesheet">

    <!-- Libraries CSS Files -->
    <link href="lib/ionicons/css/ionicons.min.css" rel="stylesheet">
    <link href="lib/unveil-effects/animations.css" rel="stylesheet">
    <link href="lib/cubeportfolio/cubeportfolio.css" rel="stylesheet">
    <link rel="stylesheet" href="/css/cadastro/css/stlogin.css">

    <!-- Main Stylesheet File -->
    <link href="css/cadastro/css/style.css" rel="stylesheet">
    <link href="css/cadastro/css/stlogin.css" rel="stylesheet">

    <!-- Script Files -->

    <!-- =======================================================
    Template Name: GadgetLanding
    Template URL: https://templatemag.com/gadgetlanding-bootstrap-landing-template/
    Author: TemplateMag.com
    License: https://templatemag.com/license/
    ======================================================= -->
</head>

<body>
    <?php
        if(isset($_SESSION['nao_autenticado'])):
    ?>
    <div>
        <p>ERRO: Usuário ou senha inválidos ou você não confirmou no e-mail.</p>
    </div>
    <?php 
        endif;
        unset($_SESSION['nao_autenticado']);
    ?>

    <style>
        @import 'https://fonts.googleapis.com/css?family=Cabin+Sketch';
    </style>

    <div id="navigation" class="navbar navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <!--<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>-->
                <!--<a class="navbar-brand " href="#h" class="smoothscroll"><img class="logo img-circle" src="https://image.ibb.co/dJh6Hf/20181030-224426-0001.png" width="80px"></a>-->
            </div>
            <div id="lista" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="active lista">
                        <a href="index.html" class="smoothscroll"> <b>Inicio</b></a>
                    </li>
                    <li class="lista"><a href="cadastro.html" class="smoothscroll"><b>Cadastrar</b></a></li>
                </ul>
            </div>
            <!--/.nav-collapse -->
        </div>
    </div>

    <!----------Login-------->
    <div id="login-guilu">
        <div class="container">
            <div class="col-md-6 col-md-offset-3 centered" id="login2-guilu">
                <h1>Entrar</h1>
                <div class="logologin">
			<img class="imglogin img-circle img-block mx-auto" src="https://image.ibb.co/dJh6Hf/20181030-224426-0001.png" />

		</div>
                <form role=form method="POST" action="login.php">
                    <div class="row">
                        <div class="col-md-6 col-md-offset-3 centered">
                            <label for="inputEmail">E-mail</label>
                            </span><input id="iptEmail" name="email" type="email" class="form-control" placeholder="E-mail">
                        </div>
                        <div class="col-md-6 col-md-offset-3 centered">
                            <label for="inputPassword">Senha</label>
                            <input id="iptSenha" name="senha" type="password" class="form-control" placeholder="Senha">
                        </div>
                        <div class="row col-md-6 col-md-offset-3 centered">
                            <button id="btnFormulario" type="submit" class="btn btn-primary btn-block ">Entrar</button>
                        </div>
                    </div>
                
                </form>
            </div>
        </div>
    </div>

    <div id="copyrights">
        <div class="container">
            <p>
                &copy; Copyrights <strong>Pare & Repare</strong>. All Rights Reserved
            </p>
            <div class="credits">
                <!--
                  You are NOT allowed to delete the credit link to TemplateMag with free version.
                  You can delete the credit link only if you bought the pro version.
                  Buy the pro version with working PHP/AJAX contact form: https://templatemag.com/gadgetlanding-bootstrap-landing-template/
                  Licensing information: https://templatemag.com/license/
                -->
                Created with GadgetLanding template by <a href="https://templatemag.com/">TemplateMag</a>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
    <script src="js/cep.js"></script>

</body>

</html>