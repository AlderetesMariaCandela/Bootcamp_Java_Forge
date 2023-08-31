package com.alderetesmaria.productosycategorias.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alderetesmaria.productosycategorias.models.CategoryModel;
import com.alderetesmaria.productosycategorias.models.ProductModel;

@Repository
public interface CategoryRepo extends CrudRepository<CategoryModel, Long> {

	List<CategoryModel> findByProductsNotContains(ProductModel producto);
}
