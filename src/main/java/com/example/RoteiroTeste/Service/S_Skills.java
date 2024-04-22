package com.example.RoteiroTeste.Service;

import com.example.RoteiroTeste.Model.M_Skills;
import com.example.RoteiroTeste.Repository.R_Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class S_Skills {
    @Autowired
    private R_Skills r_skills;

    public List<M_Skills> getAllSkills() {
        return r_skills.findAll();
    }
}
