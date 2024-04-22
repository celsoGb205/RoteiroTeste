package com.example.RoteiroTeste.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Imagens {

    @GetMapping("/home")
    public String getLogin(){
        return "Home/home";
    }
}
