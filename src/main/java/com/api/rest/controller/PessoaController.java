package com.api.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.entidade.Pessoa;
import com.api.rest.entidade.dto.PessoaDTO;
import com.crud.framework.config.GenericMapper;
import com.crud.framework.controller.GenericController;
import com.crud.framework.service.GenericService;


@RestController
@RequestMapping("/api/pessoa")
public class PessoaController extends GenericController<Pessoa, PessoaDTO, Long> {
	
    public PessoaController(GenericService<Pessoa, Long> service, GenericMapper mapper) {
        super(service, mapper, Pessoa.class, PessoaDTO.class);
    }
}
