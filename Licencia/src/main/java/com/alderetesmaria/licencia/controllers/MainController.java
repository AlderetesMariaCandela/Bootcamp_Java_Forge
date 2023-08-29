package com.alderetesmaria.licencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alderetesmaria.licencia.models.Licencia;
import com.alderetesmaria.licencia.models.Persona;
import com.alderetesmaria.licencia.services.MainService;

import jakarta.validation.Valid;

@Controller
public class MainController {

	// inyeccion dependencia de servicio

	@Autowired
	private MainService mainService;
	
	@GetMapping("/")
	public String raiz(Model viewModel) {
		List<Persona> todosUsuarios = mainService.todasPersonas();
		viewModel.addAttribute("todos" ,todosUsuarios);
		return "index.jsp";
	}

	// instancia del formulario vacia
	@GetMapping("/person/new")
	public String formularioPersona(@ModelAttribute("persona") Persona persona) {
		return "newperson.jsp";
	}

	// crear
	@PostMapping("/person/new")
	public String crearPersona(@Valid @ModelAttribute("persona") Persona persona, BindingResult resultado) {
		if (resultado.hasErrors()) {
			return "newperson.jsp";
		}
		mainService.crearPersona(persona);
		return "redirect:/";
	}

	// instancia del formulario vacia
	@GetMapping("/licencias/new")
	public String formularioLicencia(@ModelAttribute("licencia") Licencia licencia, Model viewModel) {
		//List<Persona> todosUsuarios = mainService.todasPersonas();
		//viewModel.addAttribute("personas", todosUsuarios);
		viewModel.addAttribute("personas", mainService.obtenerPersonaSinLic());
		return "newlic.jsp";
	}
	
	//crear licencias
	@PostMapping("/licencias/new")
	public String crearLicencia(@Valid @ModelAttribute("licencia") Licencia licencia, BindingResult resultado, Model viewModel) {
		if (resultado.hasErrors()) {
			//viewModel.addAttribute("personas", mainService.todasPersonas());
			viewModel.addAttribute("personas", mainService.obtenerPersonaSinLic());
			return "newlic.jsp";
		}
		System.out.println("se ejecuto");
		mainService.crearLicencia(licencia);
		return "redirect:/";
	}
	
}
