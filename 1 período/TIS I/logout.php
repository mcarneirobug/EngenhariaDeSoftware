<?php
    session_start();
    //pega todas as sessões existentes e exclui todas
    session_destroy();
    header('Location: index.html');
?>