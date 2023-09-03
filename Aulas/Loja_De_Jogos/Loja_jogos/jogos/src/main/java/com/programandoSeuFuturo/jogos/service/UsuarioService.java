package com.programandoSeuFuturo.jogos.service;

import com.programandoSeuFuturo.jogos.model.Usuario;
import com.programandoSeuFuturo.jogos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsuarioService {

    @Autowired
   private UsuarioRepository usuarioRepository;

    public List<Usuario> getAll(){
        return usuarioRepository.findAll();
    }
    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
