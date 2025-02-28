package com.api.produtoRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.api.produtoRest", "com.crud.framework"})
public class ProdutoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutoRestApplication.class, args);
	}

}
