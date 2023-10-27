package com.pedrofacchinetti.TesteBackEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pedrofacchinetti.TesteBackEnd.model.User;
import com.pedrofacchinetti.TesteBackEnd.service.UserService;
import com.pedrofacchinetti.TesteBackEnd.util.JwtProvider;
import com.pedrofacchinetti.TesteBackEnd.dto.LoginRequest;
import com.pedrofacchinetti.TesteBackEnd.dto.LoginResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Autenticação") //integrar novas aplicações com sistemas de software existentes
@RestController //Anotação pra dizer pro Spring Boot que vai ser o controller
public class AuthenticationController {

    @Autowired //injeta automaticamente dependências em um componente gerenciado pelo contêiner Spring.
    private UserService userService;

    @Autowired
    private JwtProvider jwtProvider;

    @ApiOperation(value = "Autentica um usuário e retorna um token JWT") // é usada para especificar o valor, as notas e outras informações da API para a rota.
    @PostMapping("/api/login") // Determina que o método aceitará requisições HTTP do tipo POST.
    public ResponseEntity<LoginResponse> authenticateUser(@RequestBody LoginRequest loginRequest) {
        User user = userService.authenticate(loginRequest.getUsername(), loginRequest.getPassword());

        if (user != null) { //jwt Token verifica a identidade de um usuário e conceder acesso a recursos ou serviços.
            String token = jwtProvider.generateToken(user.getUsername(), user.getRole().toString());
            return ResponseEntity.ok(new LoginResponse(user.getUsername(), user.getRole().toString(), token));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }
}