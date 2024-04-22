package com.example.RoteiroTeste.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "acesso")
public class M_Acesso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idacesso;
    private String email;
    private int senhaacesso;
    private String nome;



    public Long getIdAcesso() {
        return idacesso;
    }

    public void setIdAcesso(Long idacesso) {
        this.idacesso = idacesso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenhaAcesso() {
        return senhaacesso;
    }

    public void setSenhaAcesso(int senhaacesso) {
        this.senhaacesso = senhaacesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
