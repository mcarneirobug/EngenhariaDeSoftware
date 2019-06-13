$(document).ready(function() {
    
    $("#iptCEP").focusout(function() {
        var cep = $("#iptCEP").val();
            cep = cep.replace("-", "");
        var urlStr = "https://viacep.com.br/ws/"+ cep +"/json/";
        
        $.ajax(
            {
                url      : urlStr,
                type     : "get",
                dataType : "json",
                success : function(data) {
                    $("#iptCidade").val(data.localidade);
                    $("#iptEstado").val(data.uf);
                    $("#iptBairro").val(data.bairro);
                    $("#iptRua").val(data.logradouro);
                    $("#iptCompl").val(data.complemento);
                },
                error : function (erro) {
                    console.log(erro);
                }
            }
        );
    });
});