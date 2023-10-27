package com.pedrofacchinetti.TesteBackEnd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration //Anotação para minimizar a quantidade de código
public class AppConfig {

    @Bean //Carrega uma classe e faz injeções de dependência dela em outra classes.
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); //algoritmo de hashing de senhas projetado especificamente para armazenar senhas de forma segura.
    }

}

