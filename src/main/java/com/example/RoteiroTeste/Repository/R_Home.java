package com.example.RoteiroTeste.Repository;

import com.example.RoteiroTeste.Model.M_Acesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Home extends JpaRepository<M_Acesso, Long> {
    @Query(value = "SELECT * FROM acesso WHERE email = :email and senhaacesso =:senhaacesso",nativeQuery = true)
    M_Acesso findByEmailESenha(@Param("email") String email, @Param ("senhaacesso") String senha);
}
