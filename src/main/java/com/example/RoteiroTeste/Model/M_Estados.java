package com.example.RoteiroTeste.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Estado")
public class M_Estados {
    @Id
    private String sigla;
    private String estado;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
