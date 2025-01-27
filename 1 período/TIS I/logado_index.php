<?php
    session_start();
    //verificação para se o usuário quiser acessar sem ter feito o login
    //não tenha acesso ao painel.php
    include('verifica_login.php');
?>

<!DOCTYPE html>
<html lang="pt-br">

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

  <!-- Main Stylesheet File -->
  <link href="css/style.css" rel="stylesheet">
  <link href="css/style_anuncios" rel="stylesheet">

  <!-- =======================================================
    Template Name: GadgetLanding
    Template URL: https://templatemag.com/gadgetlanding-bootstrap-landing-template/
    Author: TemplateMag.com
    License: https://templatemag.com/license/
  ======================================================= -->
</head>

<body data-spy="scroll" data-offset="58" data-target="#topnav">
    <style> 
        @import 'https://fonts.googleapis.com/css?family=Cabin+Sketch'; 
    </style>

    <!-- Fixed navbar -->
    <div id="navigation" class="navbar navbar-fixed-top">
      <div class="container">
          <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                  <span class="sr-only">Toggle navigation</span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                </button>
          <!--   <a class="navbar-brand " href="#h" class="smoothscroll"><img class="logo img-circle" src="https://image.ibb.co/dJh6Hf/20181030-224426-0001.png" width="120px"></a> -->
            </div>
        <div id="lista" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active lista"><a href="index.html"> <b>Página Inicial</b></a></li>
            <li class="lista"><a href="#how" class="smoothscroll"><b>Como Contratar?</b></a></li>
            <li class="lista"><a href="#contact" class="smoothscroll"><b>Fale Conosco</b></a></li>
            <li class="lista"><a href="logout.php"><b>SAIR</b></a></li>
          </ul>
        </div>
        <!--/.nav-collapse -->
      </div>
    </div>

  <!-- ********** HEADER ********** -->
  <div id="h">
    <div class="container">
      <div class="row">
        <div id="page" class="col-md-10 col-md-offset-1 centered">
            <a  class="smoothscroll"><img class="logo img-circle" src="https://image.ibb.co/dJh6Hf/20181030-224426-0001.png" width="180px"></a> 
          <h1 data-effect="slide-bottom"><b>AQUI, VOCÊ ENCONTRA</b></h1>
          <hr class="aligncenter">
          <h2><b>os melhores profissionais para atendê-lo.</b></h2>
          <a href="anuncios2.php" class="btn btn-transparent registro">Clique aqui para pesquisar por profissionais</a>
        </div>
      </div>
      <!--/row -->
    </div>
    <!--/container -->
  </div>
  <!--

  <!-- ********** SECOND PART ********** -->
  <div id="how"></div>
  <div class="container">
    <h1 id="contratando"><b>Como contratar um profissional?</b></h1>
    <div class="row mtb2">
      <div class="col-md-5 col-md-offset-1">
        <h2 style="color: #104E8B;"><b>1. </b> <b style="color: black;"> Buscando o profissional </b></h2>
        <h4 class="mtb  comunicacao">Procure a especialidade do profissional que você deseja através da aba "<b>Categorias</b>".</h4>
      </div>
      <!--/col-md-6-->
      <div class="col-md-5 of">
        <img src="https://bit.ly/2Avu2Fz" class="img-responsive aligncenter" alt="" width="220" data-effect="slide-right">
      </div>
      <!--/col-md-6 -->
    </div>
    <!--/row -->
    <div class="row mtb2">
      <div class="col-md-5 col-md-offset-1">
        <h2 style="color: #104E8B;"><b>2. </b> <b style="color: black;"> Encontrando o profissional</b></h2>
        <h4 class="mtb comunicacao">Mostraremos uma lista de profissionais <b>qualificados</b> para resolver o seu problema.<br><br> <b>Obs: recomendamos que 
            escolha sempre os profissionais bem classificados. </b></h4>
      </div>
      <!--/col-md-6-->
      <div class="col-md-5 of">
        <img src="https://bit.ly/2CIrq8D" class="img-responsive aligncenter" alt="" width="220" data-effect="slide-right">
      </div>
      <!--/col-md-6 -->
    </div>
    <!--/row -->
    <div class="row mtb2">
      <div class="col-md-5 col-md-offset-1">
      <h2 style="color:#104E8B;"><b>3. </b> <b style="color: black;"> Entrando em contato com o profissional</b></h2>  
      <h4 class="mtb comunicacao">Escolha o profissional ideal e converse com ele <b>NA HORA</b> através do <b>WhatsApp</b> ou <b>ligando.</b></h4>
      </div>
      <!--/col-md-6-->
      <div class="col-md-5 of">
        <img src="https://bit.ly/2OSzbQv" class="img-responsive aligncenter" alt="" width="220" data-effect="slide-right">
      </div>
      <!--/col-md-6 -->
    </div>
    <!--/row -->
  </div>
  <!--/container -->
  <div class="sep s02" data-stellar-background-ratio="0.5"></div>

  <!-- 
  <div id="help" class="container mt">
    <div id="duvida" class="ajuda"><b id="negrito">Não sabe qual profissional vai resolver seu problema? <br> Nós podemos te ajudar...</b></div>
    <div class="row mtb">
      <div class="col-md-5 col-md-offset-1 of">
        <img src="https://image.ibb.co/kpfvkq/Encanador-e-eletricista-24h-20160218034709.jpg" class="img-responsive aligncenter" alt="" data-effect="slide-left">
      </div>
      <div class="col-md-5 col-md-offset-1">
        <h1 class="centered"><b>Bombeiros hidráulicos</b></h1>
        <h4 class="centered mb" style="margin: 5px;">O que faz um bombeiro hidráulico?</h4>
        <p style="text-align: justify; margin: 10px;">         
           Bombeiros hidráulicos podem operacionalizar projetos de instalações de tubulações, preparar local para instalação, 
           pré-montar tubulações, realizar testes de alta pressão, proteger instalações hidráulicas, realizar manutenções de equipamentos e acessórios, entre outros serviços.</p>
      </div>
    </div>
    
    <div class="row mtb2">
      <div class="col-md-5 col-md-offset-1">
          <h1 class="centered"><b>Eletricistas</b></h1>
          <h4 class="centered mb" style="margin: 5px">O que faz um eletricista?</h4>
        <p style="text-align: justify; margin: 10px;">
            Eletricistas podem realizar manutenções corretivas, preditivas e preventivas. Além disso, podem realizar vistorias em instalações elétricas,
            elaborar propostas comerciais e outros serviços.
      </div>
      

      <div class="col-md-5 col-md-offset-1 of">
        <img src="https://image.ibb.co/eyyFkq/eletriscista.jpg" class="img-responsive aligncenter" alt="" data-effect="slide-right">
      </div>
    </div>

    <div class="row mtb">
      <div class="col-md-5 col-md-offset-1 of">
        <img src="https://image.ibb.co/bYCQ1V/jardineiro-hotelaria-2.jpg" class="img-responsive aligncenter" alt="" data-effect="slide-left">
      </div>

      <div class="col-md-5 col-md-offset-1">
        <h1 class="centered"><b>Jardineiros</b></h1>
        <h4 class="centered mb" style="margin: 5px;">O que faz um jardineiro?</h4>
        <p style="text-align: justify; margin: 10px;">
            Jardineiros além de fazer manutenção em gramas, cortar, regar e cultiar canteiros, podem ser contratados 
            para aplicar inseticidas, adubação para as plantas, colocar grades ou anteparos, 
            podar cercas vivas, cuidar do paisagismo, entre outros serviços. 
        </p>
      </div>
    </div>

    <div class="row mtb2">
        <div class="col-md-5 col-md-offset-1">
            <h1 class="centered"><b>Pedreiros</b></h1>
            <h4 class="centered mb" style="margin: 5px;">O que faz um pedreiro?</h4>
            <p style="text-align: justify; margin: 10px;">
              Pedreiros podem atuar na construção e reforma da parte estrutural e acabamentos de prédios e casas, além de fazer
              controle do fluxo de serviços, recebimento e checagem de materiais, realizar a leitura e a interpretação das plantas 
              desenhadas por engenheiros e arquitetos e outros serviços.
            </p>
        </div>
        
  
        <div class="col-md-5 col-md-offset-1 of">
          <img src="https://image.ibb.co/kZthgV/show-ped.jpg" class="img-responsive aligncenter" alt="" data-effect="slide-right">
        </div>
      </div>

      <div class="row mtb">
          <div class="col-md-5 col-md-offset-1 of">
            <img src="https://image.ibb.co/gd8nFq/mao-de-obra-pintor-diaria-terceirizacao-russel-servicos.jpg" class="img-responsive aligncenter" alt="" data-effect="slide-left">
          </div>
    
          <div class="col-md-5 col-md-offset-1">
              <h1 class="centered"><b>Pintores</b></h1>
              <h4 class="centered mb" style="margin: 5px;">O que faz um pintor?</h4>
              <p style="text-align: justify; margin: 10px;">Pintores têm a responsabilidade de aplicar camadas de tinta ou revestimento 
              similar sobre produtos de madeira, metal, têxteis ou outras matérias, além de recobrir produtos com, esmalte, laca 
            ou substâncias similares, para protegê-los ou decorá-los, podem prestar serviços similares a estes. </p>
          </div>
        </div>

        <div class="row mtb2">
            <div class="col-md-5 col-md-offset-1">
                <h1 class="centered"><b>Gesseiros</b></h1>
                <h4 class="centered mb" style="margin: 5px;">O que faz um gesseiro?</h4>
                <p style="text-align: justify; margin: 10px;">
                  Gesseiros usam o gesso como material de trabalho, onde, são usados para revestimentos e forros, além de 
                  acabamentos e ornamentações, como molduras e sancas, podem também, prestar outros serviços.
                </p>
            </div>
            
      
            <div class="col-md-5 col-md-offset-1 of">
              <img src="https://image.ibb.co/e7angV/gesseiro-968x644.jpg" class="img-responsive aligncenter" alt="" data-effect="slide-right">
            </div>
          </div>

                <div class="row mtb">
          <div class="col-md-5 col-md-offset-1 of">
            <img src="https://image.ibb.co/kHQETA/carpinteiro.jpg" class="img-responsive aligncenter" alt="" data-effect="slide-left">
          </div>
          
          <div class="col-md-5 col-md-offset-1">
              <h1 class="centered"><b>Carpinteiros</b></h1>
              <h4 class="centered mb" style="margin: 5px;">O que faz um carpinteiro?</h4>
              <p style="text-align: justify; margin: 10px;">Carpinteiros trabalham executando os mais diversos trabalhos em madeira, desde móveis, ferramentas, 
              e artigos para construção civil. </p>
          </div>
        </div>

        <div class="row mtb2">
            <div class="col-md-5 col-md-offset-1">
                <h1 class="centered"><b>Decoradores</b></h1>
                <h4 class="centered mb" style="margin: 5px;">O que faz um decorador?</h4>
                <p style="text-align: justify; margin: 10px;">Decoradores projetam soluções para espaços inteiores residencais, comerciais e institucionais, visando
                harmonizar a alteração fisica da obra. Pesquisam produtos e materiais, planejam cores, acabamentos e iluminação de acordo com a 
                necessidade do cliente.</p>
            </div>
      
            <div class="col-md-5 col-md-offset-1 of">
              <img src=https://preview.ibb.co/cVdJ5q/Como-escolher-o-profissional-de-decora-o-735x450.jpg" class="img-responsive aligncenter" alt="" data-effect="slide-right">
            </div>
          </div>
  </div>
  <div class="sep s02" data-stellar-background-ratio="0.5"></div>

  <div class="container" id="team" name="team">
    <br>
    <div class="row white centered">
      <h1 id="who" class="centered"><b>Quem somos?</b></h1>
      <hr>
      <br>
      <br>
      <div class="col-lg-3 centered">
        <img class="img img-circle" src="https://preview.ibb.co/iTsHGV/882e6670-89b3-43ea-bbf0-12b4f54cbe2d.jpg" height="120px" width="120px" alt="">
        <br>
        <h4><b>Ana Luíza</b></h4>
        <a href="#" class="icon icon-facebook"><img class="img img-circle" src="https://image.ibb.co/f6e3qq/90dd9f12fdd1eefb8c8976903944c026-cone-do-cone-do-facebook-by-vexels.png" height="25px" width="25px" alt=""></a>
        <a href="#" class="icon icon-twitter"><img class="img img-circle" src="https://image.ibb.co/eS6V3A/image.png" height="30px" width="30px" alt=""></a>
        <p>Integrante responsável por desenvolver a página de login e auxiliar no desenvolvimento do sistema de avaliação dos profissionais ofertados.</p>
      </div>
      <div class="col-lg-3 centered">
        <img class="img img-circle" src="https://image.ibb.co/cwaF3A/5ef867d7-0e6b-4d77-86ad-1eef8d4ab71f.jpg" height="120px" width="120px" alt="">
        <br>
        <h4><b>Guilherme Diniz</b></h4>
        <a href="#" class="icon icon-facebook"><img class="img img-circle" src="https://image.ibb.co/f6e3qq/90dd9f12fdd1eefb8c8976903944c026-cone-do-cone-do-facebook-by-vexels.png" height="25px" width="25px"alt=""></a>
        <a href="#" class="icon icon-twitter"><img class="img img-circle" src="https://image.ibb.co/eS6V3A/image.png" height="30px" width="30px" alt=""></a>
        <p>Integrante responsável por desenvolver a página de cadastro e auxiliar no desenvolvimento do sistema de avaliação dos profissionais ofertados.</p>
      </div>

      <div class="col-lg-3 centered">
        <img class="img img-circle" src="https://image.ibb.co/ctyJOA/0c0fad93-d402-46b2-8720-0e85629a53de.jpg" height="120px" width="120px" alt="">
        <br>
        <h4><b>Matheus Carneiro</b></h4>
        <a href="#" class="icon icon-facebook"><img class="img img-circle" src="https://image.ibb.co/f6e3qq/90dd9f12fdd1eefb8c8976903944c026-cone-do-cone-do-facebook-by-vexels.png" height="25px" width="25px" alt=""></a>
        <a href="#" class="icon icon-twitter"><img class="img img-circle" src="https://image.ibb.co/eS6V3A/image.png" height="30px" width="30px" alt=""></a>
        <p>Integrante responsável por desenvolver funcionalidades presentes na aplicação, implementar o SGDB utilizado e auxiliar no desenvolvimento sistema de busca.</p>
      </div>

      <div class="col-lg-3 centered">
        <img class="img img-circle" src="https://preview.ibb.co/kZG8qq/90012310-e743-44e9-8958-24ad7553e405.jpg" height="120px" width="120px" alt="">
        <br>
        <h4><b>Raíssa Vilela</b></h4>
        <a href="#" class="icon icon-facebook"><img class="img img-circle" src="https://image.ibb.co/f6e3qq/90dd9f12fdd1eefb8c8976903944c026-cone-do-cone-do-facebook-by-vexels.png" height="25px" width="25px" alt=""></a>
        <a href="#" class="icon icon-twitter"><img class="img img-circle" src="https://image.ibb.co/eS6V3A/image.png" height="30px" width="30px" alt=""></a>
        <p>Integrante responsável por desenvolver a página inicial, página de busca, CSS da aplicação e auxiliar no desenvolvimento do sistema de busca.</p>
      </div>

    </div>
  </div>-->

  <div id="contact">
    <div class="container">
      <div class="row">
        <div class="col-md-8 col-md-offset-2">
          <h2 id="fale" class="centered"><b>Fale Conosco</b></h2>
          <form class="contact-form php-mail-form" role="form" action="contactform/contactform.php" method="POST">

            <div class="form-group">
              <input type="name" name="name" class="form-control" id="contact-name" placeholder="Nome" data-rule="minlen:4" data-msg="Please enter at least 4 chars" >
              <div class="validate"></div>
            </div>
            <div class="form-group">
              <input type="email" name="email" class="form-control" id="contact-email" placeholder="E-mail" data-rule="email" data-msg="Please enter a valid email">
              <div class="validate"></div>
            </div>
            <div class="form-group">
              <input type="text" name="subject" class="form-control" id="contact-subject" placeholder="Assunto" data-rule="minlen:4" data-msg="Please enter at least 8 chars of subject">
              <div class="validate"></div>
            </div>

            <div class="form-group">
              <textarea class="form-control" name="message" id="contact-message" placeholder="Digite uma mensagem" rows="5" data-rule="required" data-msg="Please write something for us"></textarea>
              <div class="validate"></div>
            </div>

            <div class="loading"><img src="lib/php-mail-form/loading.gif"></div>
            <div class="error-message"></div>
            <div class="sent-message">Sua mensagem foi enviada. A equipe <b>Pare & Repare</b> agradece!</div>

            <div class="form-send">
              <button type="submit" class="btn btn-large">Enviar Mensagem</button>
            </div>

          </form>

        </div>
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
  <!-- / copyrights -->

  <!-- JavaScript Libraries -->
  <script src="lib/jquery/jquery.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.min.js"></script>
  <script src="lib/php-mail-form/validate.js"></script>
  <script src="lib/easing/easing.min.js"></script>
  <script src="lib/cubeportfolio/cubeportfolio.js"></script>
  <script src="lib/unveil-effects/unveil-effects.js"></script>

  <!-- Template Main Javascript File -->
  <script src="js/main.js"></script>
  <script src="js/main1.js"></script>

</body>
</html>