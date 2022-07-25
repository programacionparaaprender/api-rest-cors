package com.programacionparaaprender.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programacionparaaprender.app.entity.Usuario;


public interface TodoRepository  extends JpaRepository<Usuario, Long>{
	
	List<Usuario> findByUsername(String username);
	
	List<Usuario> findById(long id);
	
	
}
