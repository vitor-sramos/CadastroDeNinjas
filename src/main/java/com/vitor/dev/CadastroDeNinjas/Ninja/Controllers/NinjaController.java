package com.vitor.dev.CadastroDeNinjas.Ninja.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NinjaController {

    @GetMapping(value = "/boasVindas")
    public String boasVindas() {
        return "Está é a minha primeira mensagem nesta rota!";
    }
}
