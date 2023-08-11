package com.alderetesmaria.cadenas.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Hello {

	@GetMapping("/")
	public String hello() { 
        return "Hola Cliente!";
	}
	@GetMapping("/random")
	public String hello2() {
		return "Spring Boot es genial!";
	}
	
}
