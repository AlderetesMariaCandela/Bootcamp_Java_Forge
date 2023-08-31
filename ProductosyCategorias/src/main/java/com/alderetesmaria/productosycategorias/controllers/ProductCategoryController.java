package com.alderetesmaria.productosycategorias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.alderetesmaria.productosycategorias.models.ProductCategoryModel;
import com.alderetesmaria.productosycategorias.services.MainService;

@Controller
public class ProductCategoryController {

	// inyeccion de dependencia
	private final MainService mainServ;

	public ProductCategoryController(MainService service) {
		this.mainServ = service;
	}

	@PostMapping("/aso/{idProducto}")
	public String asociarProductoCategoria(@PathVariable("idProducto") Long idProducto,
			@ModelAttribute("asociacion") ProductCategoryModel productosCategorias,
			Model viewModel, BindingResult resultado) {
		
		if(resultado.hasErrors()) {
			return "mostrarproducto.jsp";
		}
		mainServ.crearVinculo(productosCategorias);
		return "redirect:/product/"+idProducto;
		
	}
}
