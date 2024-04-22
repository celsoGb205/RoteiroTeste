 $("#entrar_login").click(envia);

          function validaCampoVazio(campo){
          if(campo.trim() == ''){
              return true;
          }else{
              return false;
          }
      }

    function envia(){

        let podeEnviar = true;
        let email = $("#email").val();
        let senha = $("#senha").val();
        let  mensagem = "";

          if(validaCampoVazio(email)){
              podeEnviar = false;
              mensagem += "Email precisa ser informado!\n";
          }
          if(validaCampoVazio(senha)){
             podeEnviar = false;
             mensagem += "A senha precisa ser informada!\n";
         }

          if(podeEnviar){
        $.ajax({
            type: "POST",
            url: "/login",
            data: {
                email: email,
                senha:senha,
            },
            success: function (data){
                //$("#entrar_login").click(envia);
                 if(data.sucesso){
                        $('.hide-after-login').remove(); // Esconde os itens da navbar após o login
                        $('.show-after-login').removeClass('d-none'); // Mostra os itens da navbar após o login
                        $('#skills-container').html("");
                 }else{
                      alert(data.mensagem);
                 }
            },
            error: function (data) {
                  $("#mensagem");
            }
        });
        }else{
          alert(mensagem);

        }
    }