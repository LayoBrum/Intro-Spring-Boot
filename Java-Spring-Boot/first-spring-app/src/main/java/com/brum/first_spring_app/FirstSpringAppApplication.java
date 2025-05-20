package com.brum.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication // essa anotação marca a classe principal de uma aplicação Spring Boot
@Profile("dev") // essa anotação indica que a classe deve ser carregada apenas quando o perfil "dev" estiver ativo
public class FirstSpringAppApplication {

	public static void main(String[] args) { // esse é o ponto de entrada da aplicação
		SpringApplication.run(FirstSpringAppApplication.class, args); // esse método inicia a aplicação Spring Boot
		// O Spring Boot irá escanear o pacote e suas subpastas em busca de componentes, configurações e serviços
	}

}
