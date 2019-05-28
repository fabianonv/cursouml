package com.cursouml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursouml.domain.Cidade;

@Repository
public class CidadeRepository extends JpaRepository<Cidade, Integer>{
	
}
