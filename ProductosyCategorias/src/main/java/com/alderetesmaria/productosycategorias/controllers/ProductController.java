package com.alderetesmaria.productosycategorias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.alderetesmaria.productosycategorias.models.ProductCategoryModel;
import com.alderetesmaria.productosycategorias.models.ProductModel;
import com.alderetesmaria.productosycategorias.services.MainService;

import jakarta.validation.Valid;

@Controller
public class ProductController {

	//inyeccion de dependencia 
	private final MainService mainServ;
	public ProductController(MainService service) {
		this.mainServ = service;
	}
	@GetMapping("/products/new")
	public String formProducto(@ModelAttribute("producto") ProductModel producto) {
		return "nuevoproducto.jsp";
	}
	@PostMapping("/products/new")
	public String nuevoProducto(@Valid @ModelAttribute("producto") ProductModel producto, BindingResult resultado) {
		if (resultado.hasErrors()) {
			return "nuevoproducto.jsp";
		}
		mainServ.crearProducto(producto);
		return "redirect:/";
	}
	@GetMapping("/product/{idProduct}")
	public String mostrarProducto(@PathVariable("idProduct") Long idProduct,
			@ModelAttribute("asociacion") ProductCategoryModel asociacion,
			Model modelo) {
		ProductModel producto = mainServ.unProducto(idProduct);
		modelo.addAttribute("categorias", mainServ.productoSinCategoria(producto));
		modelo.addAttribute("producto",producto);
		System.out.println(producto.getCategories().size());
		return "mostrarproducto.jsp";
	}
}
