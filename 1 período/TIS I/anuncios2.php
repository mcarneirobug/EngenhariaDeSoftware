<?php
    include_once './conexao.php';
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">  
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">

    <title>Pare & Repare</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Favicons -->
    <link href="https://bit.ly/2OawtAT" rel="icon">
    <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">

    <!-- Bootstrap CSS File -->
    <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Libraries CSS Files -->
    <link href="lib/ionicons/css/ionicons.min.css" rel="stylesheet">

    <!-- Custom styles for this template  -->

    <link href="css/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style1.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link href="css/st.css" rel="stylesheet">
    <link href="css/style_anuncio.css" rel="stylesheet">
    <link href="css/style_comments.css" rel="stylesheet">
    

</head>
<body>

    <div>
      <!-- Navigation -->
      <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#"></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
                <a class="item" href="index.html"> <b> Página Inicial </b></a>
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item">
            <a class="item" href="logout.php"><b> SAIR </b></a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    </div>
  <div>

 <div id="h">
    <div class="container">
      <div class="row">
        <div class="col-md-8 col-md-offset-2 centered">
          <h1 id="prof">Busque profissionais por categorias ...</h1>
          <p id="exemplos"><b>Ex: decoradores, carpinteiros, pintores, etc ...</b></p>
            <form role="form" method="POST" action="" id="form-pesquisa">
              <input class="subscribe-input" type="text" list="historico" name="pesquisa" id="pesquisa" placeholder="Digite o nome da categoria: ">
            </form>

            <datalist id="historico">
                <option value="Bombeiro Hidráulico"></option>
                <option value="Eletricista"></option>
                <option value="Jardineiro"></option>
                <option value="Pedreiro"></option>
                <option value="Pintor"></option>
                <option value="Gesseiro"></option>
                <option value="Carpinteiro"></option>
                <option value="Decorador"></option>
            </datalist>


            <a id="comentario" href="comentario.php" class="btn btn-transparent registro">Veja comentários</a>
            </div>
        </div>
      </div>
      <!--/row-->
    </div>
    <!--/container-->
  </div>
  <h1 id="title" class="my-4"> CATEGORIAS </h1>
   <div class="col-lg-12">
   <div id="result" class="resultado"></div>
   </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <script type="text/javascript" src="personalizado.js"></script>
    
    <div id="copyright">
      <div class="container">
        <p>
          &copy; Copyrights <strong id="nome-site">Pare & Repare</strong>. All Rights Reserved
        </p>
      <div class="credits">
       
        <!--Created with SumoLanding template by <a href="https://templatemag.com/">TemplateMag</a>-->
      </div>
    </div>
  </div>
  <!-- / copyrights -->

  <!-- JavaScript Libraries -->
  <script src="SumoLanding/lib/jquery/jquery.min.js"></script>
  <script src="SumoLanding/lib/bootstrap/js/bootstrap.min.js"></script>
  <script src="SumoLanding/lib/php-mail-form/validate.js"></script>

  <!-- Template Main Javascript File -->
  <script src="js/main.js"></script>

    <!-- Bootstrap core JavaScript -->
    <script src="SumoLanding/vendor/jquery/jquery.min.js"></script>
    <script src="SumoLanding/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
    <script>
        $(function() {
            $("#categoria").autocomplete( {
                source: 'proc_pesq_cate.php'
            });
        });
    </script>
</body>
</html>