package com.api.rest.service.impl;

import org.springframework.stereotype.Service;

import com.api.rest.entidade.Produto;
import com.api.rest.repository.ProdutoRepository;
import com.api.rest.service.ProdutoService;
import com.crud.framework.service.impl.GenericServiceImpl;


@Service
public class ProdutoServiceImpl extends GenericServiceImpl<Produto, Long> implements ProdutoService {
	
    public ProdutoServiceImpl(ProdutoRepository repository) {
        super(repository);
    }
    
}
