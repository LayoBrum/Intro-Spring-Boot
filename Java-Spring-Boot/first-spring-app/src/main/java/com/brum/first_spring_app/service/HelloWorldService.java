package com.brum.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service // marca a classe como um serviço Spring, permitindo que o Spring a detecte e registre automaticamente como um bean
public class HelloWorldService {

    public String helloWorld(String name) {
        return "Hello World " + name;
    }
}
