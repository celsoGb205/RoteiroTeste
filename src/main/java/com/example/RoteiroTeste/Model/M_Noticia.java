package com.example.RoteiroTeste.Model;

import jakarta.persistence.*;
import org.attoparser.dom.Text;

import java.util.Date;

@Entity
@Table(name = "noticia")
public class M_Noticia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Date data;
    private Text noticia;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Text getNoticia() {
        return noticia;
    }

    public void setNoticia(Text noticia) {
        this.noticia = noticia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
