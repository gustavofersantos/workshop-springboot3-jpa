# Projeto web services com Spring Boot e JPA / Hibernate

## Estudo com objetivo de aprender sobre

- Criação de projeto Spring Boot Java
- Implementação de modelo de domínio
- Estruturar camadas lógicas: resource, service, repository
- Configuração de banco de dados de teste (H2)
- Povoação do banco de dados
- CRUD (Create, Retrieve, Update, Delete)
- Tratamento de exceções

## Como rodar

### Clone o repositório
### Configure o banco de dados (MySQL via XAMPP)
- Inicie o XAMPP e ative o Apache e o MySql
- Acesse phpMyAdmin no navegador: http://localhost/phpmyadmin/
- Crie um banco de dados: CREATE DATABASE nome_do_banco;
- Abra o projeto no VS Code ou IntelliJ/Eclipse.
- Atualize o arquivo de configuração do Spring Boot (application.properties) com os dados do banco:
spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
- Rode a aplicação
- Acesse a API via Postman: http://localhost:8080/
- Acesse a API via navegador: http://localhost:8080/h2-console

