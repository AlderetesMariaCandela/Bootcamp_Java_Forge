package com.alderetesmaria.productosycategorias.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alderetesmaria.productosycategorias.models.ProductCategoryModel;

@Repository
public interface ProductCategoryRepo extends CrudRepository<ProductCategoryModel, Long>{

}
