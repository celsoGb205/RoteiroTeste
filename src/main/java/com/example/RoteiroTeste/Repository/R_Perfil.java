package com.example.RoteiroTeste.Repository;

import com.example.RoteiroTeste.Model.M_Acesso;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Perfil extends JpaRepository<M_Acesso, Long> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE M_Acesso SET nome = :nome, email = :email, senhaacesso = :senhaacesso WHERE idacesso = :idacesso")
    void atualizarDadosA(@Param("nome") String nome, @Param("email") String email, @Param("senhaacesso") String senha, @Param("idacesso") Long id);

}

