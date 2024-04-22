package com.example.RoteiroTeste.Model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "DataNacional")
public class M_DataNacional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idnacional;
    private int anomundial;
    private Timestamp inicompeticao;
    private Timestamp terminocompeticao;
    private String localcompeticao;

    public Long getIdnacional() {
        return idnacional;
    }

    public void setIdnacional(Long idnacional) {
        this.idnacional = idnacional;
    }

    public int getAnomundial() {
        return anomundial;
    }

    public void setAnomundial(int anomundial) {
        this.anomundial = anomundial;
    }

    public Timestamp getInicompeticao() {
        return inicompeticao;
    }

    public void setInicompeticao(Timestamp inicompeticao) {
        this.inicompeticao = inicompeticao;
    }

    public Timestamp getTerminocompeticao() {
        return terminocompeticao;
    }

    public void setTerminocompeticao(Timestamp terminocompeticao) {
        this.terminocompeticao = terminocompeticao;
    }

    public String getLocalcompeticao() {
        return localcompeticao;
    }

    public void setLocalcompeticao(String localcompeticao) {
        this.localcompeticao = localcompeticao;
    }
}
