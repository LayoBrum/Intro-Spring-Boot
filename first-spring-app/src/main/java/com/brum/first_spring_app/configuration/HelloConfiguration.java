package com.brum.first_spring_app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // essa anotação marca a classe como uma classe de configuração do Spring
// O Spring irá escanear essa classe em busca de anotações e beans
public class HelloConfiguration {

    @Bean // essa anotação marca o método como um bean do Spring
    // O Spring irá chamar esse método e registrar o objeto retornado como um bean
    public String helloWorld() {
        return "Hello World"; // retorna uma string "Hello World"
    }
}
