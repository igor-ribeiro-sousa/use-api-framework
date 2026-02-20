package com.api.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.entidade.Pessoa;
import com.api.rest.entidade.dto.PessoaDTO;
import com.api.rest.produtoRest.service.PessoaService;
import com.crud.framework.controller.GenericController;


@RestController
@RequestMapping("/api/pessoa")
public class PessoaController extends GenericController<Pessoa, PessoaDTO, Long> {
	
    public PessoaController(PessoaService service) {
		super(service);
    }
}
