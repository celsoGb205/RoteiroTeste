package com.example.RoteiroTeste.Controller;

import com.example.RoteiroTeste.Model.M_Acesso;
import com.example.RoteiroTeste.Model.M_Modalidade;
import com.example.RoteiroTeste.Model.M_Resposta;
import com.example.RoteiroTeste.Service.S_Login;
import com.example.RoteiroTeste.Service.S_Modalidade;
import com.example.RoteiroTeste.Service.S_Perfil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.example.RoteiroTeste.Model.M_Skills;
import com.example.RoteiroTeste.Service.S_Skills;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class C_Home {

    @Autowired
    private S_Skills s_skills;
    @Autowired
    private S_Modalidade s_modalidade;

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/skills")
    public String getAllSkills(Model model) {
        List<M_Skills> skills = s_skills.getAllSkills();
        model.addAttribute("skills", skills);
        List<M_Modalidade> modalidades = s_modalidade.getAllModalidades();
        model.addAttribute("modalidades", modalidades);
        return "Home/skills";
    }
    @PostMapping("/skills")
    public String mostrarModalidade(@RequestParam Long idSkill,
                               Model model) {
        List<M_Modalidade> modalidades = s_modalidade.mostrarModalidade(idSkill);
        model.addAttribute("modalidades", modalidades);
        return "Home/parcialModalidade";
    }
    @GetMapping("/login")
    public String getLogin() {
        return "Home/login";
    }

    @PostMapping("/login")
    @ResponseBody
    public M_Resposta postLogin(@RequestParam("email") String email,
                                @RequestParam("senha") String senha, HttpSession session,
                                RedirectAttributes redirectAttributes) {
        M_Acesso acesso = S_Login.getPessoaLogin(email, senha);
        session.setAttribute("email", acesso);
        if (session.getAttribute("email") == null) {
            M_Resposta m_resposta = new M_Resposta(false, "E-mail ou senha inválidos!");
            return m_resposta;
        } else {
            M_Resposta m_resposta = new M_Resposta(true, "Bem Vindo!");
            return m_resposta;
        }

    }

    @GetMapping("/perfil")
    public String getAlterarSenha(HttpServletRequest request) {
        if (request.getHeader("Referer") != null) {
            return "Home/perfil";
        } else {
            return "redirect:/";
        }
    }

    @PostMapping("/perfil")
    @ResponseBody
    public M_Acesso postAlterarSenha(
            @RequestParam("nome") String nome,
            @RequestParam("email") String email,
            @RequestParam("senha") int senha,
            HttpSession session) {
        return S_Perfil.atualizarPerfil(nome, email, senha, (M_Acesso) session.getAttribute("email"));
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.setAttribute("email", null);
        return "redirect:/";
    }
}
