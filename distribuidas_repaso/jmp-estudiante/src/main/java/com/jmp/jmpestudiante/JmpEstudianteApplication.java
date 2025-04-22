package com.jmp.jmpestudiante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JmpEstudianteApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmpEstudianteApplication.class, args);
    }

}
