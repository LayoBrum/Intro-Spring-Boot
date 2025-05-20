package com.brum.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brum.first_spring_app.domain.User;
import com.brum.first_spring_app.service.HelloWorldService;

@RestController // essa anotação marca a classe como um controlador REST, permitindo que o Spring a detecte e registre automaticamente como um bean
@RequestMapping("/hello-world") // essa anotação mapeia a URL base para o controlador
public class HelloWorldController {
    
    @Autowired // essa anotação indica que o Spring deve injetar a dependência HelloWorldService aqui
    // O Spring irá injetar automaticamente uma instância de HelloWorldService aqui
    private HelloWorldService helloWorldService; // instanciando a classe HelloWorldService (da pasta service) para usar seus métodos

    // O construtor é usado para injetar a dependência HelloWorldService
    // O Spring irá chamar esse construtor quando criar uma instância de HelloWorldController
    // public HelloWorldController(HelloWorldService helloWorldService) {
    //     this.helloWorldService = helloWorldService;
    // }

    @GetMapping // essa anotação mapeia o método helloWorld() para a URL /hello-world
    public String helloWorld() { //
        return helloWorldService.helloWorld("Brum"); // retorna uma string "Hello World " + nome (como definido no método helloWorld() da classe HelloWorldService)
    }

    @PostMapping("/{id}") // essa anotação mapeia o método helloWorld() para a URL /hello-world
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) { // esse método é chamado quando uma requisição POST é feita para /hello-world/{id}
        return "Hello World " + body.getName() + filter; // retorna uma string "Hello World " + nome
    //     // O Spring irá chamar esse método quando receber uma requisição POST para /hello-world
    }
}
