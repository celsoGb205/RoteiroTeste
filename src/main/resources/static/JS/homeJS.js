document.addEventListener("DOMContentLoaded", function() {
       const botaoSair = document.getElementById("sair");

       botaoSair.addEventListener("click", function() {
         gerarSwal();
       });
});

        $(document).ready(function(){
            // Verificar se a rota é desconhecida
            $(window).on('load', function() {
                var path = window.location.pathname;
                if(path !== '/' && path !== '/skills' && path !== '/perfil' && path !== '/login') {
                    // Rota desconhecida, exibir mensagem de erro
                    $('body').html('<h1>404 Not Found</h1><p>Redirecionando em 5...4...3...</p>');
                    // Contagem regressiva de redirecionamento
                    var countdown = 5;
                    var countdownInterval = setInterval(function() {
                        countdown--;
                        $('p').text('Redirecionando em ' + countdown + '...');
                        if(countdown <= 0) {
                            clearInterval(countdownInterval);
                            $('body').html('<h1>404 Not Found</h1><p>Você será redirecionado para a página inicial.</p>');
                        }
                    }, 1000);
                }
            });
        });

$('#check').change(function(){
if($(this).is(':checked')){
    $('body, .navbar, .nav-link,.square,#carousel-control-prev,#r,td').addClass('dark');
    $('.carousel').removeClass('carousel-dark');
} else {
    $('body, .navbar, .nav-link,.square,#carousel-control-next,#r,td').removeClass('dark');
    $('.carousel').addClass('carousel-dark');
}
});

$('#buttonLogin').click(function(){
 event.preventDefault();

 $.ajax({
     url: $(this).attr('href'),
     type: 'GET',
     success: function(response) {
              $('#skills-container').html(response);
              $("#entrar_login").click(envia);
         },
         error: function() {
              alert('Deu merda.'); // Exibe um alerta em caso de erro
     }
 });
});
$('#perfil').click(function(){
      event.preventDefault();

      $.ajax({
          url: $(this).attr('href'),
          type: 'GET',
          success: function(response) {
                   $('#skills-container').html(response);
                   $('#salvaP').click(enviar);
              },
              error: function() {
                   alert('Deu merda.'); // Exibe um alerta em caso de erro
          }
      });
  });
$('#resultado').click(function(){
      event.preventDefault();

      $.ajax({
          url: $(this).attr('href'),
          type: 'GET',
          success: function(response) {
                   $('#skills-container').html(response);
              },
              error: function() {
                   alert('Deu merda.'); // Exibe um alerta em caso de erro
          }
      });
  });
$('#NH').click(function(){
    event.preventDefault();

    $.ajax({
        url: $(this).attr('href'),
        type: 'GET',
        success: function(response) {
                 $('#skills-container').html(response);
            },
            error: function() {
                 alert('Deu merda.'); // Exibe um alerta em caso de erro
        }
    });
});

// Quando o link "Skills" for clicado
$('.btskills').click(function(event) {
 event.preventDefault(); // Impede o comportamento padrão do link

 // Carrega o conteúdo do arquivo skills.html usando AJAX
 $.ajax({
     url: $(this).attr('href'), // Obtém o URL do link "Skills"
     type: 'GET',
     success: function(response) {
         $('#skills-container').html(response); // Insere o conteúdo no container
         $('#skill_descModalidade').html(response); // Insere o conteúdo no container
     },
     error: function() {
         alert('Erro ao carregar as habilidades.'); // Exibe um alerta em caso de erro
     }
 });
});

function gerarSwal(){
  const swalWithBootstrapButtons = Swal.mixin({
    customClass: {
      confirmButton: 'btn btn-success me-2',
      cancelButton: 'btn btn-danger ms-2'
    },
    buttonsStyling: false
  });

  swalWithBootstrapButtons.fire({
    title: 'Sair?',
    text: "Você realmente deseja sair da aplicação?",
    icon: 'question',
    showCancelButton: true,
    confirmButtonText: '<i class="fa-solid fa-thumbs-up"></i> Sim!',
    cancelButtonText: '<i class="fa-solid fa-thumbs-down"></i> Não!',
    reverseButtons: false
  }).then((result) => {
    if (result.isConfirmed) {
      window.location.href="/";
    }
  });
}