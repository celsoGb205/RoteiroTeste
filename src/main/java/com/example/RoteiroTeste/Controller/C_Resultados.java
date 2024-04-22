package com.example.RoteiroTeste.Controller;

import com.example.RoteiroTeste.Service.S_Resultados;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class C_Resultados {

    @GetMapping("/resultados")
    public String listarResultados(HttpServletRequest request,
                                   HttpSession session,
                                   Model model) {
        if (request.getHeader("Referer") != null) {
            model.addAttribute("email",session.getAttribute("email"));
            model.addAttribute("resultados", S_Resultados.listarResultadosCompetidores());
            return "Home/resultados";
        } else {
            return "redirect:/";
        }

    }
}