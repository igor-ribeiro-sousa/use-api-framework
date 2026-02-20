package com.api.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.entidade.Produto;
import com.api.rest.entidade.dto.ProdutoDTO;
import com.api.rest.produtoRest.service.ProdutoService;
import com.crud.framework.controller.GenericController;


@RestController
@RequestMapping("/api/produto")
public class ProdutoController extends GenericController<Produto, ProdutoDTO, Long> {
	
    public ProdutoController(ProdutoService service) {
		super(service);
    }
}
