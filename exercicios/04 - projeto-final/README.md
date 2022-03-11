# Digytal Code - Programação, Pesquisa, Educação

#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## Água Luz Atração Notificação Webservice
Desafio final para apresenteção da School Java

## Requisitos
Criar um modelo de classes que represente um Registro Profissional no sistema contendo os campos: Id, Cpf, Data Nascimento, Nome, Sexo, Escolaridade, Profissão, Salário (Mínimo/Máximo) Pretendido,Telefone para contato e Estrangeiro (sim/não);


## Obrigatoriedades: 

### Projeto Java: 
Disponibilizar as funcionalidades de preenchimento de uma Ficha Cadastral realizando operações de acesso a dados.
Os dados devem ser armazenados em arquivo e em seguida um banco de dados utilizando o JPA.
NÃO USAR SPRING DATA JPA

Orientações: 
	Aplicar as boas práticas de desenvolvimento, organização do projeto, testes unitários e código fonte no github
	
Forma de entrega:  Código fonte no github com o arquivo README detalhando as funcionalidades, classe principal (main) e membros envolvidos e sua participação no projeto.

### Projeto Spring: 
**Obrigatoriedades:**

Refatorar todo o sistema para a estrutura Spring com a finalidade de prover API Rest em uma aplicação Spring Web + JWT

**Orientações:**

Criar uma camada de controller para disponibilizar todos os serviços para prover recursos para a equipe de front.

**Forma de entrega:**

Disponibilizar uma API Rest documentada pelo Swagger em um ambiente Azure, Heroku ou OnPromisse.

### Projeto Final:
Obrigatoriedades:
Apresentar a API para a plataforma Easy Job devidamente documentada para uma demonstração de uma jornada de consumo dos recursos para criar usuário, realizar login com token, gerar operações CRUD via API de cadastro de candidatos, além de uma consulta com dados relevantes.

Orientações: 
	Detalhar no README do projeto modelo de consumo de endpoint para facilitar a utilização da API, exemplo:

Login:
Request: POST: http://seudominio/login {“login”:”aluno”, “senha”:”1234”}
Response:{“token”:”O_TOKEN_DAAPLICACAO”, “dataExpiracao”:”2021-12-31”}

Forma de entrega: 

Disponibilizar o link do github do projeto bem descrito quanto às funcionalidades, implementações relevantes, participação dos membros da equipe, READEME com a jornada na plataforma e a API Rest documentada pelo Swagger em um ambiente Azure, Heroku ou OnPromisse.

### Critérios de Aceite - Expectativa da Entrega: 

1.	Apresentar a estrutura do projeto no github;

2.	Apresentar a API da plataforma devidamente documentada e preferencialmente no Heroku;

3.	Realizar uma demonstração de uma jornada de consumo dos recursos para conforme requisitados;

4.	Requisitos Técnicos: Implementação aplicando as boas práticas de programação, uso de ORM-JPA, Framework de persistência, segurança na API, integridade do banco de dados. 
 
