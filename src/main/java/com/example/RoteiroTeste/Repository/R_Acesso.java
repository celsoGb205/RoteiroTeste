package com.example.RoteiroTeste.Repository;

import com.example.RoteiroTeste.Model.M_Acesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Acesso extends JpaRepository<M_Acesso, Long> {
    @Query(value = "SELECT TOP 1 * FROM acesso WHERE email = ?1 and senhaacesso = ?2", nativeQuery = true)
    M_Acesso findByEmailESenha(String email, int senha);
}