package com.alderetesmaria.productosycategorias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alderetesmaria.productosycategorias.models.CategoryModel;
import com.alderetesmaria.productosycategorias.services.MainService;

import jakarta.validation.Valid;

@Controller
public class CategoryController {

	// inyeccion de dependencia
	private final MainService mainServ;

	public CategoryController(MainService service) {
		this.mainServ = service;
	}

	@GetMapping("/categories/new")
	public String formCategoria(@ModelAttribute("categoria") CategoryModel categoria) {
		return "nuevacategoria.jsp";
	}

	@PostMapping("/categories/new")
	public String nuevoProducto(@Valid @ModelAttribute("categoria") CategoryModel categoria, BindingResult resultado) {
		if (resultado.hasErrors()) {
			return "nuevacategoria.jsp";
		}
		mainServ.crearCategoria(categoria);
		return "redirect:/";
	}
}
