package com.alderetesmaria.productosycategorias.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alderetesmaria.productosycategorias.models.CategoryModel;
import com.alderetesmaria.productosycategorias.models.ProductCategoryModel;
import com.alderetesmaria.productosycategorias.models.ProductModel;
import com.alderetesmaria.productosycategorias.repositories.CategoryRepo;
import com.alderetesmaria.productosycategorias.repositories.ProductCategoryRepo;
import com.alderetesmaria.productosycategorias.repositories.ProductRepo;

@Service
public class MainService {

	// inyeccion de dependencia
	private final ProductRepo productRepo;
	private final CategoryRepo categoryRepo;
	private final ProductCategoryRepo proCatRepo;

	public MainService(ProductRepo pRe, CategoryRepo cRe, ProductCategoryRepo pCRe) {
		this.productRepo = pRe;
		this.categoryRepo = cRe;
		this.proCatRepo = pCRe;
	}

	// metodos para crear
	public ProductModel crearProducto(ProductModel producto) {
		return productRepo.save(producto);
	}

	public CategoryModel crearCategoria(CategoryModel categoria) {
		return categoryRepo.save(categoria);
	}

	public ProductCategoryModel crearVinculo(ProductCategoryModel productoCategorias) {
		return proCatRepo.save(productoCategorias);
	}

	// metodos lectura
	public List<CategoryModel> productoSinCategoria(ProductModel producto) {
		return categoryRepo.findByProductsNotContains(producto);
	}

	public ProductModel unProducto(Long id) {
		return productRepo.findById(id).orElse(null);
	}

	public List<ProductModel> todosProductos() {
		return productRepo.findAll();
	}

}
