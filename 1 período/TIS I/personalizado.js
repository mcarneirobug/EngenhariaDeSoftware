$(function(){
    $("#pesquisa").keyup(function(){
        var pesquisa = $(this).val();

        //verificar se ha algo digitado pelo usuário
        if(pesquisa != '') {
            var dados = {
                palavra : pesquisa
            }
            $.post('proc_anuncios.php', dados, function(retorna) {
                //Mostrar dentro da ul os resultados obtidos
                $(".resultado").html(retorna);
            });
        } //end if
    });
});