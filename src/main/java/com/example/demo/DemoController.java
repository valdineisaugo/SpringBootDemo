package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {
    @GetMapping("/")
    public String index(){
        return "My SpringBoot APP";
    }

    @GetMapping("/api")
    public String api(){
        return "Você chamou api.";
    }

    @GetMapping("/horario")
    public String horario(){
        return new Date().toString();
    }

    @PostMapping("/api/valor")
    public String valor(@RequestBody String info){
        return "Informação recebida: " + info;
    }

    @PostMapping("api/validacao")
    public String numero(@RequestBody String valor){
        if(Integer.parseInt(valor) % 2 == 0)
            return "O número é par!";
        else
            return "O número é ímpar";
    }



}
