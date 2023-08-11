package com.alderetesmaria.enrutamiento.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/{urlUno}")
	public String metodoUno(@PathVariable("urlUno") String var) {
		return  "El dojo es increíble!";
	}
	@RequestMapping("/{burbank}/{dojo}")
	public String metodoDos(@PathVariable("burbank") String var, @PathVariable("dojo") String varDos ) {
		return  "El Dojo Burbank está localizado al sur de California";
	}
	@RequestMapping("/san/{jose}")
	public String metodoTres(@PathVariable("jose") String var) {
		return  "El Dojo SJ es el cuartel general";
	}
	
	
}
