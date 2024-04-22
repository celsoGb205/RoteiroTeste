package com.example.RoteiroTeste.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Competidor")
public class M_Competicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idcompeticao;
    private String nome;
    private Date datanascimento;

    public Long getIdcompeticao() {
        return idcompeticao;
    }

    public void setIdcompeticao(Long idcompeticao) {
        this.idcompeticao = idcompeticao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }
}
