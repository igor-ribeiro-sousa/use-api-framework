package com.api.produtoRest.service.impl;

import org.springframework.stereotype.Service;

import com.api.produtoRest.entidade.Produto;
import com.api.produtoRest.entidade.dto.ProdutoDTO;
import com.api.produtoRest.repository.ProdutoRepository;
import com.api.produtoRest.service.ProdutoService;
import com.crud.framework.config.GenericMapper;
import com.crud.framework.service.impl.GenericServiceImpl;


@Service
public class ProdutoServiceImpl extends GenericServiceImpl<Produto, ProdutoDTO, Long> implements ProdutoService {
	
    public ProdutoServiceImpl(ProdutoRepository repository, GenericMapper genericMapper) {
        super(repository, genericMapper, Produto.class, ProdutoDTO.class);
    }
    
}
