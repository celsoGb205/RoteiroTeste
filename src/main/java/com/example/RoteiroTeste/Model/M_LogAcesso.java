package com.example.RoteiroTeste.Model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "LogAcesso")
public class M_LogAcesso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idlog;
    private Timestamp datahoraacesso;
    private Timestamp datahorasaida;


    public Long getIdlog() {
        return idlog;
    }

    public void setIdlog(Long idlog) {
        this.idlog = idlog;
    }

    public Timestamp getDatahoraacesso() {
        return datahoraacesso;
    }

    public void setDatahoraacesso(Timestamp datahoraacesso) {
        this.datahoraacesso = datahoraacesso;
    }

    public Timestamp getDatahorasaida() {
        return datahorasaida;
    }

    public void setDatahorasaida(Timestamp datahorasaida) {
        this.datahorasaida = datahorasaida;
    }
}
