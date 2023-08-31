package com.alderetesmaria.listaestudiantes.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alderetesmaria.listaestudiantes.models.StudentModel;

@Repository
public interface StudentRepo extends CrudRepository<StudentModel, Long>{
	List<StudentModel> findAll();
}
