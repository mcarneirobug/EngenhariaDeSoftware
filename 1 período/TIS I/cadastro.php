<?php
    include("conexao.php");
    $msg = false; //variável armazenar msg de texto se o upload deu certo
    //verificar se o usuário enviou algum arquivo
    if(isset($_FILES['imagem'])) {
        //descobrir qual extensão do nosso arquivo
        //-4, vai pegar .jpg utilizando substr
        $extensao = strtolower(substr($_FILES['imagem']['name'], -5)); //pega a extensao do arquivo
        $novo_nome = md5(time()) . $extensao; //define o nome do arquivo, previnindo n duplicar
        $diretorio = "imagens/"; //define o diretorio para onde enviaremos o arquivo

        $nome      = addslashes($_POST['nome']);
        $usuario   = addslashes($_POST['username']);
        $email     = addslashes($_POST['email']);
        $telefone  = addslashes($_POST['telefone']);
        $cep       = addslashes($_POST['cep']);
        $rua       = addslashes($_POST['rua']);
        $cidade    = addslashes($_POST['cidade']);
        $estado    = addslashes($_POST['estado']);
        $senha     = md5(addslashes($_POST['senha']));
        $profissao = addslashes($_POST['profissao']);

        move_uploaded_file($_FILES['imagem']['tmp_name'], $diretorio. $novo_nome); //efetua o upload
        $sql_code = "INSERT INTO teste_user (id, nome, user, email, telefone, cep, rua, cidade, estado, senha, imagens, profissao) VALUES (null, '$nome', '$usuario', '$email', '$telefone', '$cep', '$rua', '$cidade', '$estado', '$senha', '$novo_nome', '$profissao')";
        $resultado = mysqli_query($conn, $sql_code);
        //$conn->query("INSERT INTO teste_user SET nome='$nome', user='$usuario', email='$email',telefone='$telefone', cep='$cep', rua='$rua', cidade='$cidade', estado='$estado', senha='$senha', imagens='$novo_nome', profissao='$profissao' ");
        header('Location: pag_login.php');
    
/*
    $id = mysqli_insert_id($conn);
    $md5 = md5($id);

$assunto  = "Confirme seu cadastro";
$link     = "pareerepare.000webhostapp.com/confirma.php?h=".$md5;
//$mensagem = "Clique aqui para confirmar seu cadastro. ". $link;
$arquivo  = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>
<html xmlns='http://www.w3.org/1999/xhtml'>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
<title>Demystifying Email Design</title>
<meta name='viewport' content='width=device-width, initial-scale=1.0'/>

</head>
<body style='margin: 0; padding: 0;'> 
    <style> 
    <link href='https://fonts.googleapis.com/css?family=Cabin+Sketch' rel='stylesheet'>
    h1#h1-style {
            font-family: 'Cabin Sketch', cursive;
            color: #7AC5CD;
            margin: 3px;
            font-size: 50px;
    }
    </style>

    <table border='0' cellpadding='0' cellspacing='0' width='100%'> 
            <tr>
                    <td style='padding: 10px 0 30px 0; text-align: justify'>
                            <table align='center' border='0' cellpadding='0' cellspacing='0' width='600' style='border: 1px solid #cccccc; border-collapse: collapse;'>
                                    <tr>
                                            <td align='center' bgcolor='#4682B4' style='padding: 40px 0 30px 0; color: #4682B4; font-size: 28px; font-weight: bold; font-family: Arial, sans-serif;'>
                               
                                            <img src='http://www.cadesem.cl/wp-content/uploads/2015/10/mecanica.png' alt='Creating Email Magic' width='130' height='130' style='display: block;'>
                                            <h1 id='h1-style' style='font-family: 'Cabin Sketch', cursive; color: #7AC5CD; margin: 3px; font-size: 50px'> PARE & REPARE</h1>
                                    </td>
                                    </tr>
                                    <tr>
                                            <td bgcolor=#F8F8FF style='padding: 40px 30px 40px 30px;'>
                                                    <table border='0' cellpadding='0' cellspacing='0' width='100%'>
                                                            <tr>
                                                                    <td style='color: #4682B4; font-family: Arial, sans-serif; font-size: 24px;'>
                                                                            <b> Olá $nome, </b>
                                                                            
                                                                    </td> <br>
                                                            </tr>
                            <tr>
                                <td style='padding: 25px 0 5px 0; color: black; font-family: Arial, sans-serif; font-size: px; line-height: 20px;'>
                                     Tudo bem?
                                 </td>
                            </tr>
                                                            <tr>
                                                                    <td style='padding: 20px 0 30px 0; color: black; font-family: Arial, sans-serif; font-size: 16px; line-height: 20px;'>
                                    <p> Nós somos a equipe fundadora do <b style='color: #4682B4;'> Pare & Repare </b> e viemos aqui te dar boas vindas. </p>                                                                         
                                     <p> Conte com a gente para tornar sua busca por prestadores de serviço uma <b style='color: #4682B4;'> experiência fácil, ágil e confiável.</b> </p> 
                                                                           <p> Qualquer dúvida, crítica, sugestão ou elogio, sinta-se à vontade para entrar em contato conosco, através do nosso e-mail <b> (pparepare@gmail.com) </b>. </p> 
                                 </td>
                                                            </tr>
                                                            <tr>
                                                                    <td>
                                                                            <table border='0' cellpadding='0' cellspacing='0' width='100%'>
                                                                                    <tr>
                                                                                            <td width='100' valign='top'>
                                                                                                    <table border='0' cellpadding='0' cellspacing='0' width='100%'>
                                                                                                            <tr>
                                                                                                                    <td style='color: #4682B4; font-family: Arial, sans-serif; font-size: 20px;'>
                                                                                                                            <b> Clique no link abaixo para confirmar o cadastro:  </b>
                                                                                                                    </td> <br>
                                                                                                            </tr>
                                                                                                            <tr>
                                                                                                                    <td style='padding: 25px 0 0 0; color: #153643; font-family: Arial, sans-serif; font-size: 16px; line-height: 20px;'>
                                                                                                                        $link
                                                                                                                    </td>
                                                                                                            </tr>
                                                                                                    </table>
                                                                                            </td> 
                                                                                            <td style='font-size: 0; line-height: 0;' width='20'>
                                                                                                    &nbsp;
                                                                                            </td>
                                                                                    </tr>
                                                                            </table>
                                                                    </td>
                                                            </tr>
                                                    </table>
                                            </td>
                                    </tr>
                                    <tr>
                                            <td bgcolor='#ee4c50' style='padding: 30px 30px 30px 30px;'>
                                                    <table border='0' cellpadding='0' cellspacing='0' width='100%'>
                                                            <tr>
                                                                    <td style='color: #ffffff; font-family: Arial, sans-serif; font-size: 14px;' width='75%'>
                                                                            &reg; Equipe <b> Pare & Repare </b>, Belo Horizonte 2018<br/>
                                                                    </td>
                                                                    <td align='right' width='25%'>
                                                                            <table border='0' cellpadding='0' cellspacing='0'>
                                                                                    <tr>
                                                                                            <td style='font-family: Arial, sans-serif; font-size: 12px; font-weight: bold;'>
                                                                                                    <a href='http://www.facebook.com/' style='color: #ffffff;'>
                                                                                                            <img src='https://image.ibb.co/mVz00q/90dd9f12fdd1eefb8c8976903944c026-cone-do-cone-do-facebook-by-vexels.png' alt='Facebook' width='38' height='38' style='display: block;' border='0' />
                                                                                                    </a>
                                                                                            </td>
                                                                                            <td style='font-size: 0; line-height: 0;' width='20'>&nbsp;</td>
                                                                                            <td style='font-family: Arial, sans-serif; font-size: 12px; font-weight: bold;'>
                                                                                                    <a href='http://www.twitter.com/' style='color: #ffffff;'>
                                                                                                            <img src='https://bit.ly/2D5BObI' alt='Twitter' width='38' height='38' style='display: block;' border='0' />
                                                                                                    </a>
                                                                                            </td>
                                                                                    </tr>
                                                                            </table>
                                                                    </td>
                                                            </tr>
                                                    </table>
                                            </td>
                                    </tr>
                            </table>
                    </td>
            </tr>
    </table>

<!--analytics-->
<script src='http://code.jquery.com/jquery-1.10.1.min.js'></script>
<script src='http://tutsplus.github.io/github-analytics/ga-tracking.min.js'></script>

</body>
</html>";
$header   = 'MIME-Version: 1.0' . "\r\n";
$header .= 'Content-type: text/html; charset=utf-8' . "\r\n";
$header .= 'From: Pare e Repare Inc. <$email>';

mail($email, $assunto, $arquivo, $header);
*/
    } //end if      
?>