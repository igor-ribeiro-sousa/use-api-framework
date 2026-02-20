package com.api.rest.entidade.dto;

import java.io.Serializable;

public class PessoaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String sobrenome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
