package com.example.RoteiroTeste.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "notas")
public class M_Notas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idnota;
    private int s1;
    private int s2;
    private int s3;
    private int s4;
    private int s5;
    private int s6;

    public Long getIdnota() {
        return idnota;
    }

    public void setIdnota(Long idnota) {
        this.idnota = idnota;
    }

    public int getS1() {
        return s1;
    }

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public int getS2() {
        return s2;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    public int getS3() {
        return s3;
    }

    public void setS3(int s3) {
        this.s3 = s3;
    }

    public int getS4() {
        return s4;
    }

    public void setS4(int s4) {
        this.s4 = s4;
    }

    public int getS5() {
        return s5;
    }

    public void setS5(int s5) {
        this.s5 = s5;
    }

    public int getS6() {
        return s6;
    }

    public void setS6(int s6) {
        this.s6 = s6;
    }
}
