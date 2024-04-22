package com.example.RoteiroTeste.Service;

import com.example.RoteiroTeste.Model.M_Acesso;
import com.example.RoteiroTeste.Repository.R_Acesso;
import org.springframework.stereotype.Service;

@Service
public class S_Login {

    private static R_Acesso r_acesso;

    public S_Login(R_Acesso r_acesso) {
        this.r_acesso = r_acesso;
    }
    public static M_Acesso getPessoaLogin(String email, String senha) {
        if (!email.trim().equals("")) {
            return r_acesso.findByEmailESenha(email,Integer.parseInt(senha));
        }
        return null;
    }
}
