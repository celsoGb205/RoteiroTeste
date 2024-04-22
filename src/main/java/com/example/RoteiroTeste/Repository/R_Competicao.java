package com.example.RoteiroTeste.Repository;

import com.example.RoteiroTeste.Model.M_Competicao;
import com.example.RoteiroTeste.Model.M_Resultados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface R_Competicao extends JpaRepository<M_Competicao, Long> {
    @Query(value = "SELECT \n" +
            "    c.nome AS competidor, \n" +
            "    CAST(DATEDIFF(YEAR, c.dataNascimento, GETDATE()) AS INT) AS idade,\n" +
            "    e.Sigla, \n" +
            "    COALESCE(n.s1,0) AS s1,\n" +
            "    COALESCE(n.s2,0) AS s2,\n" +
            "    COALESCE(n.s3,0) AS s3,\n" +
            "    COALESCE(n.s4,0) AS s4,\n" +
            "    COALESCE(n.s5,0) AS s5,\n" +
            "    COALESCE(n.s6,0) AS s6,\n" +
            "    COALESCE(n.s1,0) + COALESCE(n.s2,0) + COALESCE(n.s3,0) + COALESCE(n.s4,0) + COALESCE(n.s5,0) + COALESCE(n.s6,0) AS totalpontos\n" +
            "FROM \n" +
            "    Competidor c \n" +
            "JOIN \n" +
            "    Notas n ON c.idCompetidor = n.idCompetidor \n" +
            "JOIN \n" +
            "    Estados e ON c.estado = e.Sigla ",nativeQuery = true)
    List<M_Resultados> findCompetidoresInfo();
}
