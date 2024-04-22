

function enviar() {
    // Captura os valores dos campos de entrada
    var nome = $('#nome').val();
    var email = $('#email').val();
    var senha = $('#senha').val();

    // Envie os dados para o servidor usando AJAX
    $.ajax({
        url: '/perfil', // Substitua pela URL do seu endpoint de atualização de dados
        type: 'POST',
        data: {
            nome: nome,
            email: email,
            senha: senha
        },
        success: function(response) {
            // Lógica de sucesso, se necessário
            alert("Atualizado com sucesso");
        },
        error: function(xhr, status, error) {
            // Lógica de tratamento de erro, se necessário
            alert("deu merda");
        }
    });
}