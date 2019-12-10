package com.authorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class AuthorizationApplication {

    @GetMapping
    public String sayGreetingToOauth2User(Principal principal){
        return "hello "+principal.getName();
    }

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationApplication.class, args);
    }
}
