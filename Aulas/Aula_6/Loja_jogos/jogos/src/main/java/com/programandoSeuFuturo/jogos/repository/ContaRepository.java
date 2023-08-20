package com.programandoSeuFuturo.jogos.repository;

import com.programandoSeuFuturo.jogos.model.Conta;
import com.programandoSeuFuturo.jogos.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Integer> {
}
