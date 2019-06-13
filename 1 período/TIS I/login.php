<?php
session_start();
include('conexao.php');

//verifica se o usuário digitou algo no formulário
if(empty($_POST['email']) || empty($_POST['senha'])) {
    header('Location: pag_login.php');
    exit();
} //end if

//prevenção contra mySQL injection
$usuario = mysqli_real_escape_string($conn, $_POST['email']);
$senha   = mysqli_real_escape_string($conn, $_POST['senha']);
//vai realizar a consulta no banco de dados
$query   = "SELECT * FROM teste_user WHERE email='$usuario' AND senha= md5('$senha') "; 
$result  = mysqli_query($conn, $query);
//passar a quantidade de linhas da query resultante
$row     = mysqli_num_rows($result);

if($row == 1) {
    $_SESSION['email'] = $usuario;
    header('Location: logado_index.php');
    exit();
} //end if
else { //se a query nao retornar um registro, vamos redirecionar
    $_SESSION['nao_autenticado'] = true;
    header('Location: pag_login.php'); //redireciona para página para fazer o login 
    exit();
} //end else
?>