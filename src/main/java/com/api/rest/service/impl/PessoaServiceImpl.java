package com.api.rest.service.impl;

import org.springframework.stereotype.Service;

import com.api.rest.entidade.Pessoa;
import com.api.rest.repository.PessoaRepository;
import com.api.rest.service.PessoaService;
import com.crud.framework.service.impl.GenericServiceImpl;


@Service
public class PessoaServiceImpl extends GenericServiceImpl<Pessoa, Long> implements PessoaService {
	
    public PessoaServiceImpl(PessoaRepository repository) {
        super(repository);
    }
    
}
