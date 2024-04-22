package com.example.RoteiroTeste.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Skills")
public class M_Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idskill;
    private String descricao;

    public Long getIdSkill() {
        return idskill;
    }

    public void setIdSkill(Long idSkill) {
        this.idskill = idSkill;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
