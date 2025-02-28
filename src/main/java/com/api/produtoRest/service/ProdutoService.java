package com.api.produtoRest.service;

import com.api.produtoRest.entidade.Produto;
import com.api.produtoRest.entidade.dto.ProdutoDTO;
import com.crud.framework.service.GenericService;

public interface ProdutoService extends GenericService<Produto, ProdutoDTO, Long> {
}
