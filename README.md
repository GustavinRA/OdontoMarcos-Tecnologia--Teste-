# ODONTOMARCOS-TECNOLOGIA--TESTE-

- Não teve tempo de ajustar os testes para API, apesar da aplicação funcionar corretamente, os testes não irão funcionar.

- Não teve tempo para aplicar responsividade na página web (feita em react). Porém, ela é funcional e você pode acessa-lá através do endereço "http://localhost:8080/" no seu Browser

- Existem duas contas de usuário para acessar o sistema, as contas são criadas (se já não estiverem criadas) ao inicializar a aplicação
  (Usuário: Admin , senha: 123qwel@#; Usuário: Padrão, senha: 123qwe123 )

  - A aplicação usa o Java 20 e o Maven 3.9.1
 
  - Documentação do Sistema
1. Pacotes e Configuração
com.pedrofacchinetti.TesteBackEnd.config

Este pacote contém classes de configuração do Spring.

AppConfig: Define a estratégia de codificação de senha para o Spring Security.
WebConfig: Estende WebMvcConfigurer para configurar a maneira como o Spring MVC lida com as solicitações de URL.

2. Controladores
com.pedrofacchinetti.TesteBackEnd.controller

AuthenticationController: Lida com autenticação de usuários.
Método authenticateUser: Autentica um usuário e retorna um JWT se a autenticação for bem-sucedida.
ClienteController: Lida com operações relacionadas a entidades Cliente.
Métodos CRUD para Cliente e verificação de roles para operações de exclusão.

3. DTOs
com.pedrofacchinetti.TesteBackEnd.dto

ClienteDTO: Representa um cliente com informações relacionadas.
EmailDTO: Representa um e-mail.
EnderecoDTO: Representa um endereço.
LoginRequest: Usado para fazer login, contendo nome de usuário e senha.
LoginResponse: Representa a resposta após o login bem-sucedido, contendo nome de usuário, role e token.
TelefoneDTO: Representa um telefone.
UserDTO: Representa um usuário.

4. Enums
com.pedrofacchinetti.TesteBackEnd.enums

TipoTelefone: Define tipos de telefone - RESIDENCIAL, COMERCIAL, CELULAR.
UserRole: Define roles de usuário - ADMIN, PADRAO.

5. Exceções
com.pedrofacchinetti.TesteBackEnd.exception

ApiException: Exceção personalizada para a API.
GlobalExceptionHandler: Controlador de exceções global que lida com várias exceções e retorna respostas HTTP apropriadas.
ResourceNotFoundException: Lançada quando um recurso solicitado não é encontrado.

6. Modelos
com.pedrofacchinetti.TesteBackEnd.model

Cliente: Representa uma entidade Cliente com suas propriedades e relacionamentos.
Email: Representa uma entidade Email relacionada a um Cliente.
Endereco: Representa um endereço embutido na entidade Cliente.
Telefone: Representa um telefone associado a um Cliente.
User: Representa um usuário do sistema.

7. Repositórios
com.pedrofacchinetti.TesteBackEnd.repository

ClienteRepository: Repositório para operações CRUD em Cliente.
EmailRepository: Repositório para operações CRUD em Email.
TelefoneRepository: Repositório para operações CRUD em Telefone.
UserRepository: Repositório para operações CRUD em User e busca por nome de usuário.

8. Serviços
com.pedrofacchinetti.TesteBackEnd.service

ClienteService: Serviço para operações relacionadas a Cliente.
DtoMapper: Um serviço que ajuda a mapear entidades para DTOs e vice-versa.
EmailService: Serviço para operações relacionadas a Email.
TelefoneService: Serviço para operações relacionadas a Telefone.
UserService: Serviço para operações relacionadas a User, incluindo autenticação.

9. Utilidades
com.pedrofacchinetti.TesteBackEnd.util

JwtProvider: Fornece métodos para gerar, validar e extrair informações de tokens JWT.
10. Aplicação Principal
com.pedrofacchinetti.TesteBackEnd.TesteBackEndApplication

Ponto de entrada da aplicação Spring Boot.
Inicializa usuários padrão no banco de dados.

11. Página web

Feita em React, mas sem responsividade.
