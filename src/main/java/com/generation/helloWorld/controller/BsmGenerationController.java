package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/bsms")
public class BsmGenerationController {
    private final List<String> bsmList = Arrays.asList(
            "Trabalho em equipe",
            "Orientação ao detalhe",
            "Proatividade",
            "Comunicação",
            "Orientação ao futuro",
            "Responsabilidade pessoal",
            "Mentalidade de crescimento",
            "Persistência"
    );

    @GetMapping
    public List<String> showBsm() {
        return bsmList;
    }
}
