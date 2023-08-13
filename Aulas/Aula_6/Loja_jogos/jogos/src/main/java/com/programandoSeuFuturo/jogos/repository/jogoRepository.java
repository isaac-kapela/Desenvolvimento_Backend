package com.programandoSeuFuturo.jogos.repository;


import com.programandoSeuFuturo.jogos.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jogoRepository extends JpaRepository<Jogo,Integer> {
}
