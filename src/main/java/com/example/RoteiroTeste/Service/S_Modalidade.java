package com.example.RoteiroTeste.Service;

import com.example.RoteiroTeste.Model.M_Modalidade;
import com.example.RoteiroTeste.Repository.R_Modalidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class S_Modalidade {

    @Autowired
    private static R_Modalidade r_modalidade;
    public S_Modalidade (R_Modalidade r_modalidade){
        this.r_modalidade = r_modalidade;
    }

    public static List<M_Modalidade> getAllModalidades() {
        return r_modalidade.findAll();
    }
    public List<M_Modalidade> mostrarModalidade(Long idSkill) {
        return r_modalidade.mostrarModalidade(idSkill);
    }
}
