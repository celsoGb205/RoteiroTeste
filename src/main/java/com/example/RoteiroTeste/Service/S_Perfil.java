package com.example.RoteiroTeste.Service;

import com.example.RoteiroTeste.Model.M_Acesso;
import com.example.RoteiroTeste.Repository.R_Perfil;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class S_Perfil {

    @Autowired
    private static R_Perfil r_perfil;

    public S_Perfil(R_Perfil r_perfil) {
        this.r_perfil = r_perfil;
    }
    @Transactional
    public static M_Acesso atualizarPerfil(String nome, String email, int senha, M_Acesso usuario) {

        usuario.setIdAcesso(usuario.getIdAcesso());
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenhaAcesso(senha);
        r_perfil.save(usuario);
        return null;
    }
}
