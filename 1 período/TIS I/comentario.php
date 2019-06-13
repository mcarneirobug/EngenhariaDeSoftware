<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Pare & Repare</title>
    <link href="https://bit.ly/2OawtAT" rel="icon">
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="css/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style1.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link href="css/st.css" rel="stylesheet">
    <link href="css/style_anuncio.css" rel="stylesheet">
    <link href="css/style_comments.css" rel="stylesheet">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript">
        function post() {
          var comment = document.getElementById("comment").value;
          var name = document.getElementById("username").value;
          if(comment && name) {
            $.ajax 
            ({
                type: 'post',
                url: 'post_comments.php',
                data: 
            {
                user_comm:comment,
	            user_name:name
            },
            success: function (response) 
            {
	            document.getElementById("all_comments").innerHTML=response+document.getElementById("all_comments").innerHTML;
	            document.getElementById("comment").value="";
                document.getElementById("username").value="";
            }
            });
            }
             return false;
        } //end post()
</script>
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
              <a class="nav-link" href="logado_index.php">Página Inicial
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="anuncios2.php">Anúncios</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="logout.php">SAIR</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    </div>
    <br>
    <br>
    <br>
    <br>
    <br>
    <div class="container">
    <div class="col-md-18 clear"><h3 style="color:#104E8B; font-size: 25px; padding-left: 18px;"> Deixe seu Comentário</h3>
        <div>
           <div class="col-md-10">
        		<div class="container-fluid well span8">
                    <div class="panel panel-default">
                        <div class="panel-body">                
                            <form action="" method="POST" onsubmit="return post();" id="container">
                                <input type="text" id="username" placeholder="Digite seu nome" autocomplete="off">
                                <textarea style="font-size: 15px;" id="comment" placeholder="Escreva seu comentário aqui..." class="form-control counted" name="message" rows="5" style="margin-bottom:10px;"></textarea>
                                <h6 style="font-size: 15px;" class="pull-right" id="counter">320 characters</h6>
                                <input style="font-size: 15px; margin-top: 5px;" value="Comentar" id="submit" class="btn btn-info" type="submit">Comentar</input>
                            </form>
                        </div>
                    </div>
                </div>
	        </div>	
        </div>	
        <br>
        <br>
        <br>
        <!--
    <form method="POST" action="" onsubmit="return post();" id="container">
	      <!-- <input type="text" id="username" placeholder="Digite seu nome" autocomplete="off"> 
	      <textarea id="comment" placeholder="Escreva seu comentário aqui"></textarea>  
	      <input type="submit" value="Comentar" id="submit">
    </form>  end form -->
    </div>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <div id="all_comments">
    <?php
        include("conexao.php");
  
        $comm = mysqli_query($conn, "SELECT * FROM comments ORDER BY id DESC");
        while($row = mysqli_fetch_array($comm)) {
	        $name    = $row['name'];
	        $comment = $row['comment'];
            $time    = $row['post_time'];
    ?>

    <div class="container">
    <p class="comment_div"> 
        <p class="name"><strong>Postado por:</strong> <?php echo $name;?> <span style="float:right"><?php echo date("j-M-Y g:ia", strtotime($time)) ?></span></p>
        <p class="comments"><?php echo $comment;?></p>	
    </div>  <!-- end comment_div -->
    <hr>
    </div>
  
    <?php
    } //end while
    ?>
  </div> <!-- end all_comments -->

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
</body>
</html>