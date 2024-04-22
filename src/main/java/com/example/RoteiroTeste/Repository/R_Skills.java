package com.example.RoteiroTeste.Repository;

import com.example.RoteiroTeste.Model.M_Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Skills extends JpaRepository<M_Skills, Long> {
}
