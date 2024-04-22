package com.example.RoteiroTeste.Service;

import com.example.RoteiroTeste.Model.M_Resultados;
import com.example.RoteiroTeste.Repository.R_Competicao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class S_Resultados {
    @Autowired
    private static R_Competicao r_competicao;

    public S_Resultados(R_Competicao r_competicao) {
        this.r_competicao = r_competicao;
    }

    public static List<M_Resultados> listarResultadosCompetidores() {
        return r_competicao.findCompetidoresInfo();
    }
}
