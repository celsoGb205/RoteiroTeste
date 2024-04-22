function searchTable() {
    // Declara variáveis para o input e a tabela
    var input, filter, table, tr, td, i, txtValue;
    input = document.getElementById("searchInput");
    filter = input.value.toUpperCase();
    table = document.getElementById("dataTable");
    tr = table.getElementsByTagName("tr");

    // Loop através de todas as linhas da tabela e esconde aquelas que não correspondem à consulta de pesquisa
    for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[2]; // O índice 2 corresponde à coluna do estado
        if (td) {
            txtValue = td.textContent || td.innerText;
            if (txtValue.toUpperCase().indexOf(filter) > -1) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        }
    }
}

   function expandir(botao) {
        var row = botao.parentNode.parentNode;
        if($(".columT").hasClass("hidden")){
            $(".columT").removeClass("hidden");
        }else{
            $(".columT").addClass("hidden");
        }

    }