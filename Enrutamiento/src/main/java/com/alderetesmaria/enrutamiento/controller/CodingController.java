package com.alderetesmaria.enrutamiento.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {

	@RequestMapping("")
    public String metodoUno() {
            return "¡Hola Coding Dojo!";
    }
	
	@RequestMapping("/python")
    public String metodoDos() {
            return "¡Python/Django fue increíble!";
    }
	
	@RequestMapping("/java")
    public String metodoTres() {
            return "¡Java/Spring es mejor!";
    }
	
}
