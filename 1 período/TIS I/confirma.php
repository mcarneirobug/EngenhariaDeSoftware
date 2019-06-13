<?php

include_once './conexao.php';

$h = $_GET['h'];

//verificar se o h (id) nao esta vazio

if(!empty($h)) {
    mysqli_query($conn, "UPDATE teste_user SET status='1' WHERE MD5(id) = '$h' ");
    header('Location: pag_login.php');
} //end if


?>