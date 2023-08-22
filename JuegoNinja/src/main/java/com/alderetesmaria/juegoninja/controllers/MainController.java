package com.alderetesmaria.juegoninja.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String irRaiz() {
		return "redirect:/Gold";
	}
	
	@GetMapping("/Gold")
	public String raiz(HttpSession sesion, Model model) {
		model.addAttribute("gold", sesion.getAttribute("gold"));
		model.addAttribute("resultados", sesion.getAttribute("resultados"));
		return "index.jsp";
	}
	
	@PostMapping("/Gold")
	public String enviarOro(HttpSession sesion, @RequestParam(value="lugar")String lugar) {
		//variable inicio
		int  oro = 0;
		ArrayList<String> resultados = new ArrayList<String>();
		SimpleDateFormat  formatoFecha = new SimpleDateFormat("MMMM d, yyyy hh:mm aaa");
		
		//iniciar la clave gold
		if(sesion.getAttribute("gold") == null){
			sesion.setAttribute("gold", oro);
			sesion.setAttribute("resultados", resultados);
		}
		else {
			oro = (int) sesion.getAttribute("gold");
			resultados = (ArrayList<String>) sesion.getAttribute("resultados");
		}
		// seccion de incremento/decremento de oro
		if(lugar.equals("farm")) {
			int cantidad = new Random().nextInt(11)+10;
			oro += cantidad;
			resultados.add(0, "Entraste a Farm y aumentas " + cantidad + " gold! " + formatoFecha.format(new Date()) );
			sesion.setAttribute("gold", oro);
			sesion.setAttribute("resultados", resultados);
			return "redirect:/Gold";
		}
		if(lugar.equals("cave")) {
			int cantidad = new Random().nextInt(6)+5;
			oro += cantidad;
			resultados.add(0, "Entraste a Cave y aumentas " + cantidad + " gold! " + formatoFecha.format(new Date()) );
			sesion.setAttribute("gold", oro);
			sesion.setAttribute("resultados", resultados);
			return "redirect:/Gold";
		}
		if(lugar.equals("house")) {
			int cantidad = new Random().nextInt(4)+2;
			oro += cantidad;
			resultados.add(0, "Entraste a House y aumentas " + cantidad + " gold! " + formatoFecha.format(new Date()) );
			sesion.setAttribute("gold", oro);
			sesion.setAttribute("resultados", resultados);
			return "redirect:/Gold";
		}
		if(lugar.equals("casino")) {
			int cantidad = new Random().nextInt(51);
			oro -= cantidad;
			resultados.add(0, "Entraste a casino y disminuyes " + cantidad + " gold! " + formatoFecha.format(new Date()) );
			sesion.setAttribute("gold", oro);
			sesion.setAttribute("resultados", resultados);
			return "redirect:/Gold";
		}
		return "redirect:/Gold";
	}

}
