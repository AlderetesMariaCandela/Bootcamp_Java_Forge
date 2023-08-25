package com.alderetesmaria.lenguajes.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.alderetesmaria.lenguajes.models.LenguajesModel;
import com.alderetesmaria.lenguajes.services.LenguajesService;

import jakarta.validation.Valid;

@Controller
public class LenguajesController {

	private final LenguajesService lengService;

	public LenguajesController(LenguajesService lengService) {
		this.lengService = lengService;
	}

	@GetMapping("/")
	public String raiz() {
		return "redirect:/languages";
	}

	// Muestra todos los libros y crea un libro
	@GetMapping("/languages")
	public String index(Model model, @ModelAttribute("lenguaje") LenguajesModel len) {
		List<LenguajesModel> lenguaje = lengService.findAll();
		model.addAttribute("lenguajes", lenguaje);
		
		return "index.jsp";
	}
	//crear
	@PostMapping("/languages")
	public String crearLenguaje(@Valid @ModelAttribute("lenguaje") LenguajesModel len, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			lengService.save(len);
			return "redirect:/languages";
		}
	}
	//muestra uno
	@GetMapping("/languages/{id}")
	public String mostrarLenguaje(Model model, @PathVariable("id") Long id) {
		model.addAttribute("lenguajes", lengService.findById(id));
		return "mostrar.jsp";
		
	}
	//editar
	@GetMapping("/languages/{id}/edit")
	public String editarLenguaje(Model model, @PathVariable("id") Long id) {
		model.addAttribute("lenguajes", lengService.findById(id));
		return "editar.jsp";
	}
	//actualizar
	@PutMapping("/languages/{id}")
	public String actualizarLenguaje(@Valid @ModelAttribute("lenguajes") LenguajesModel len,
			BindingResult result, 
			@PathVariable("id") Long id) {
		if (result.hasErrors()) {
			return "editar.jsp";
		} 
		len.setId(id);
		lengService.save(len);
		return "redirect:/languages";
	}
	//eliminar
	@DeleteMapping("/languages/{id}")
	public String eleminarLenguaje(@PathVariable("id") Long id) {
		lengService.deleteById(id);
		return"redirect:/languages";
	}
}
