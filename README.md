# README

## Introdução

Este repositório contém um projeto de exemplo utilizando **Spring Boot**. O objetivo é fornecer uma base para que os alunos aprendam a desenvolver aplicações web com Spring. O projeto inclui uma configuração básica, um controlador REST e um serviço que retorna mensagens personalizadas.

## Estrutura do Projeto

Para conferir a estrutura do projeto, veja o arquivo `guia.txt`. Lá é possível ver um desenho da estrutura com sua explicação.

### Descrição dos Arquivos

- **HelloConfiguration.java**: Classe de configuração do Spring que define um bean que retorna a string "Hello World".
  
- **HelloWorldController.java**: Controlador REST que mapeia requisições HTTP e utiliza o serviço para retornar mensagens personalizadas.

- **User  .java**: Classe de domínio que representa um usuário com atributos como nome e email.

- **HelloWorldService.java**: Serviço que contém a lógica de negócio para retornar mensagens personalizadas.

- **application-dev.properties**: Arquivo de configuração para o ambiente de desenvolvimento.

- **pom.xml**: Arquivo de configuração do Maven que lista as dependências do projeto.

## Como Baixar o Repositório

Para baixar o repositório, siga os passos abaixo:

1. **Clone o repositório**:
  ```bash
  git clone https://github.com/seu_usuario/first-spring-app.git
  ```
   
2. **Navegue até a pasta do projeto:**:
  ```bash
  cd first-spring-app
  ```

3. **Compile e execute o projeto:**:
  ```bash
  mvn spring-boot:run
  ```

Documentação
Como Funciona
Injeção de Dependência: O Spring Boot utiliza a injeção de dependência para gerenciar as instâncias das classes. O controlador HelloWorldController injeta o serviço HelloWorldService automaticamente.

Controlador REST: O controlador escuta requisições na URL /hello-world. Ele possui dois métodos:

GET /hello-world: Retorna "Hello World Brum".
POST /hello-world/{id}: Retorna "Hello World {nome}" onde {nome} é o nome enviado no corpo da requisição.

Exemplos de Uso:
GET Request:
  ```bash
  curl -X GET http://localhost:8080/hello-world
  ```

POST Request:
  ```bash
  curl -X POST http://localhost:8080/hello-world/1 -H "Content-Type: application/json" -d '{"name": "Seu Nome", "email": "seuemail@example.com"}'
  ```
