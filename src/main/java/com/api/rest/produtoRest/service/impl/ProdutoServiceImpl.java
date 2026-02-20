package com.api.rest.produtoRest.service.impl;

import org.springframework.stereotype.Service;

import com.api.rest.entidade.Produto;
import com.api.rest.entidade.dto.ProdutoDTO;
import com.api.rest.produtoRest.service.ProdutoService;
import com.api.rest.repository.ProdutoRepository;
import com.crud.framework.config.GenericMapper;
import com.crud.framework.service.impl.GenericServiceImpl;


@Service
public class ProdutoServiceImpl extends GenericServiceImpl<Produto, ProdutoDTO, Long> implements ProdutoService {
	
    public ProdutoServiceImpl(ProdutoRepository repository, GenericMapper genericMapper) {
        super(repository, genericMapper, Produto.class, ProdutoDTO.class);
    }
    
}
