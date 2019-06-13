<?php
    session_start();
    include("conexao.php");

 $categoria = filter_input(INPUT_POST, 'palavra', FILTER_SANITIZE_STRING);
 //pesquisar no db nome da categoria do usuario referente a palavra
 $result_categoria = "SELECT * FROM teste_user WHERE profissao LIKE '%$categoria%' LIMIT 20 ";
 //$resultado_categoria = $conn->query($result_categoria);
$resultado_categoria = mysqli_query($conn, $result_categoria);

//if(($resultado_categoria) AND ($resultado_categoria->rowCount() != 0)) {
  if(($resultado_categoria) AND ($resultado_categoria->num_rows != 0)) {
    //while($row_categoria = $resultado_categoria->fetch(PDO::FETCH_ASSOC)) {
      while($row_cat_cont = mysqli_fetch_assoc($resultado_categoria)) {
        //echo "<li>".$row_categoria['nome']. "<li>";
        $arma = "
        <div class='container'>
          <div class='row'>
            <div class='col-md-7'>
              <a href='#'>
              <a id='perfil' href='#'><img class='card-img-top'src='imagens/".$row_cat_cont['imagens']."' alt='foto'></a>
          </div>
          <div class='col-md-5'>
            <h3><a id='name' href='#'>".$row_cat_cont['nome']."<br></a></h3>
            <p id='item' class='card-text'>
            <b id='profissao'>".$row_cat_cont['profissao']."</b><br>
            <br>
            <b>Telefone: ".$row_cat_cont['telefone']."</b><br>
            <br>
            <b>E-mail: ".$row_cat_cont['email']."</b><br>
            <br>
            <b>".$row_cat_cont['cidade']." - ".$row_cat_cont['estado']."</br>
            <br>
            <a id='wpp' class='btn btn-success' href='https://api.whatsapp.com/send?phone=55".$row_cat_cont['telefone']."&text=Olá ".$row_cat_cont['nome'].", 
                vimos seu anúncio no Pare e Repare e gostaria de saber mais informações sobre seu trabalho.' target='_blank'> 
                <i class='fab fa-whatsapp fa-2x'></i>&nbsp; Mandar whatsapp</a>
                <i class='far fa-thumbs-up fa-1x'></i>" .$row_cat_cont['qnt_voto']." <br>
                <a id='vote' class='btn btn-danger' align='right' href='votar.php?id=".$row_cat_cont['id']."'>Votar</a><br><hr>
            </p>
            </p>
          </div>
        </div>
      </div>
  
      <hr>";
      echo $arma;
    } //end while
} //end if
else {
    echo "Nenhuma categoria encontrada.";
} //end else

?>