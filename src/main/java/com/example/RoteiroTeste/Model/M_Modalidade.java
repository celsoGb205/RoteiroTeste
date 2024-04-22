package com.example.RoteiroTeste.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "modalidade")
public class M_Modalidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idmodalidade;
    private String nomemodalidade;
    private String descmodalidade;

    public Long getIdModalidade() {
        return idmodalidade;
    }

    public void setIdModalidade(Long idmodalidade) {
        this.idmodalidade = idmodalidade;
    }

    public String getNomeModalidade() {
        return nomemodalidade;
    }

    public void setNomeModalidade(String nomemodalidade) {
        this.nomemodalidade = nomemodalidade;
    }

    public String getDescModalidade() {
        return descmodalidade;
    }

    public void setDescModalidade(String descmodalidade) {
        this.descmodalidade = descmodalidade;
    }
}
