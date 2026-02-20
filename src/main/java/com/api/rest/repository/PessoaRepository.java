package com.api.rest.repository;

import org.springframework.stereotype.Repository;

import com.api.rest.entidade.Pessoa;
import com.crud.framework.repository.GenericRepository;

@Repository
public interface PessoaRepository extends GenericRepository<Pessoa, Long> {}
