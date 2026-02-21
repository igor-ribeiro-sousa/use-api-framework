package com.api.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.entidade.Produto;
import com.api.rest.entidade.dto.ProdutoDTO;
import com.crud.framework.config.GenericMapper;
import com.crud.framework.controller.GenericController;
import com.crud.framework.service.GenericService;


@RestController
@RequestMapping("/api/produto")
public class ProdutoController extends GenericController<Produto, ProdutoDTO, Long> {
	
    public ProdutoController(GenericService<Produto, Long> service, GenericMapper mapper) {
        super(service, mapper, Produto.class, ProdutoDTO.class);
    }
}
