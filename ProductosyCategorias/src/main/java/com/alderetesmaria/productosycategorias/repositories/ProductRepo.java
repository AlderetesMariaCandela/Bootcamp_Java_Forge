package com.alderetesmaria.productosycategorias.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alderetesmaria.productosycategorias.models.ProductModel;

@Repository
public interface ProductRepo extends CrudRepository<ProductModel, Long>{

	List<ProductModel> findAll();
}
