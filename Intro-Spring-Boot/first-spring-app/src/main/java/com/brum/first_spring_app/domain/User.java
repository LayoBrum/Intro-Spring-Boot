package com.brum.first_spring_app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter // essa anotação gera os métodos getters para todos os atributos da classe
@Setter // essa anotação gera os métodos setters para todos os atributos da classe
@AllArgsConstructor // essa anotação gera um construtor com todos os parâmetros
public class User {
    private String name; // nome do usuário
    private String email; // email do usuário
}
