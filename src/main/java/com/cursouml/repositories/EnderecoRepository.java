package com.cursouml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursouml.domain.Categoria;

@Repository
public class EnderecoRepository extends JpaRepository<Categoria, Integer>{
	
}
