package com.alderetesmaria.contador.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	
	//Metodos de clase 
	private void setContadorSesion(HttpSession sesion, int numeroVeces) {
		sesion.setAttribute("contador", numeroVeces);
	}
	private int getContadorSesion(HttpSession sesion) {
		Object valorSesion = sesion.getAttribute("contador");
		if(valorSesion == null) {
			setContadorSesion(sesion, 0);
			valorSesion = sesion.getAttribute("contador");
		}
		return (int) valorSesion;
	}
	
	@GetMapping("/")
	public String index(HttpSession sesion) {
		int conteoActual = getContadorSesion(sesion);
		setContadorSesion(sesion, conteoActual + 1);
		return "index.jsp";
	}
	
	@GetMapping("/contador")
	public String contador(HttpSession sesion, Model modelo) {
		modelo.addAttribute("counter", getContadorSesion(sesion));
		return "contador.jsp";
	}

}
