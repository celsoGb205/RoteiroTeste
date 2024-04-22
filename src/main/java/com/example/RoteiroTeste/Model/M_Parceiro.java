package com.example.RoteiroTeste.Model;

import jakarta.persistence.*;
import org.w3c.dom.Text;

import java.awt.*;
import java.sql.Blob;
import java.sql.Clob;

@Entity
@Table(name = "parceiro")
public class M_Parceiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idparceiro;
    private Blob logo;
    private String nome;
    private String descrição;

    public Long getIdParceiro() {
        return idparceiro;
    }

    public void setIdParceiro(Long idparceiro) {
        this.idparceiro = idparceiro;
    }

    public Blob getLogo() {
        return logo;
    }

    public void setLogo(Blob logo) {
        this.logo = logo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}
