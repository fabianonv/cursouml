package com.cursouml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursouml.domain.Produto;

@Repository
public class ProdutoRepository extends JpaRepository<Produto, Integer>{
	
}
