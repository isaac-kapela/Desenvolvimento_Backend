package com.example.Produtos;
import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;

@SpringBootApplication
public class ProdutosApplication {

	public static void main(String[] args) {
		SpringApplication app =new SpringApplication(ProdutosApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port","8084"));
		app.run();


	}


}
