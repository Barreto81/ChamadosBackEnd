# ChamadosBackEnd
Atividade da Disciplina Prog para Mobile
Chamados API - Backend

Esta é a API backend do sistema Chamados, desenvolvida em Spring Boot, responsável por fornecer os dados para o aplicativo mobile via requisições HTTP (REST).

Funcionalidades da API:

GET /chcontroller/chamados – Lista todos os chamados.

GET /chcontroller/chamados/{id} – Retorna um chamado específico por ID.

POST /chcontroller/chamados – Cadastra um novo chamado.

PUT /chcontroller/chamados/{id} – Atualiza um chamado existente.

DELETE /chcontroller/chamados/{id} – Exclui um chamado pelo ID.

Atributos do chamado:

titulo: título do chamado (String)

descricao: descrição do problema ou solicitação (String)

cliente: nome do cliente (String)

data_abertura: data de abertura do chamado (Date)

data_encerramento: data de encerramento do chamado (Date)

Tecnologias utilizadas:

Java 17+

Spring Boot

Spring Data JPA

Banco de dados relacional (H2, MySQL ou outro)

Jakarta Persistence (JPA)

Maven

Como executar o backend:

Clone o projeto e abra em uma IDE Java (como IntelliJ ou Eclipse).

Configure o arquivo application.properties com o banco de dados desejado.

Execute a classe principal ChamadosApplication.java.

A API estará disponível em:

bash
Copiar
Editar
http://localhost:8080/chcontroller/chamados
Observações:

Certifique-se de permitir requisições CORS (@CrossOrigin) para que o app mobile possa consumir a API.

Use o Postman ou o próprio aplicativo mobile para testar os endpoints.
