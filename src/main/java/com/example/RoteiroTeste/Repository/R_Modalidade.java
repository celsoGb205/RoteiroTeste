package com.example.RoteiroTeste.Repository;

import com.example.RoteiroTeste.Model.M_Modalidade;
import com.example.RoteiroTeste.Model.M_Resultados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface R_Modalidade extends JpaRepository<M_Modalidade, Long> {

    @Query(value = "select * \n" +
            "from Skills s\n" +
            "inner join SkillModalidade sm\n" +
            "\ton s.idSkill = sm.idskill\n" +
            "inner join Modalidade m\n" +
            "\ton sm.idmodalidade = m.idModalidade\n" +
            "where s.idSkill = ?",nativeQuery = true)
    List<M_Modalidade> mostrarModalidade(Long idSkill);
}
