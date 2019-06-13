<?php
    session_start();
    include_once("conexao.php");
    //verificar se está vindo a variável id pela URL
    if(isset($_GET['id'])) { //caso ela exista
        //limitar quantidade de votos
        if(isset($_COOKIE['voto_cont'])) {
            $_SESSION['msg'] = "<span style='color: red'>Você já votou!</span>";
            header("Location: anuncios2.php");
        } //end if
        else { //caso ele nao tenha votado
            setcookie('voto_cont', $_SERVER['REMOTE_ADDR'], time() + 20);
            $result = "UPDATE teste_user SET qnt_voto=qnt_voto + 1
            WHERE id ='".$_GET['id']."'";
            $resultado_client = mysqli_query($conn, $result);

            //verificar se teve alteração no db
            if(mysqli_affected_rows($conn)) {
                $_SESSION['msg'] = "<span style='color: green'>Voto recebido com sucesso!</span>";
                header("Location: anuncios2.php");
            } //end if
            else {
                $_SESSION['msg'] = "<span style='color: red'>Erro ao votar!</span>";
                header("Location: anuncios2.php");
            } //end else
        } //end else 
    } //end if
?>