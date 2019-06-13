<?php
  $servidor = "mysql:dbname=id7693065_user;host=localhost";
  $usuario  = "id7693065_root";
  //$usuario = "root";
  $senha    = "estreet2";
  //$senha = "";
  $dbname   = "id7693065_user";

  define('HOST', 'localhost');
  define('USUARIO', 'id7693065_root');
  //define('USUARIO', 'root');
  define('SENHA', 'estreet2' );
  //define('SENHA', '' );
  define('DB', 'id7693065_user');

  //criar conexão
  $conn = mysqli_connect(HOST, USUARIO, SENHA, DB) or die('Não foi possível conectar.');
  //try {
  //$conn = new PDO($servidor, $usuario, $senha);
  //} catch(PDOException $e) {
//echo "ERROR: ". $e->getMessage();
 // }
?>