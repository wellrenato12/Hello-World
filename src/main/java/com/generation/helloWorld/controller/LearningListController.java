package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/learning")
public class LearningListController {
    private final List<String> learning = Arrays.asList(
            "Desenvolver minhas habilidades com Spring",
            "Desenvolver minha comunicação",
            "Desenvolver minha persistência"
    );

    @GetMapping()
    public List<String> showLearning(){

        return learning;
    }

}
