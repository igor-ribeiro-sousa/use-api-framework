package com.api.rest.service;

import com.api.rest.entidade.Produto;
import com.api.rest.entidade.dto.ProdutoDTO;
import com.crud.framework.service.GenericService;

public interface ProdutoService extends GenericService<Produto, ProdutoDTO, Long> {
}
