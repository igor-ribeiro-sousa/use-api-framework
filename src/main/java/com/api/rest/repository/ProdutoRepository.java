package com.api.rest.repository;

import org.springframework.stereotype.Repository;

import com.api.rest.entidade.Produto;
import com.crud.framework.repository.GenericRepository;

@Repository
public interface ProdutoRepository extends GenericRepository<Produto, Long> {}
