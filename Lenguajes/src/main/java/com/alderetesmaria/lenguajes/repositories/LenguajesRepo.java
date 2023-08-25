package com.alderetesmaria.lenguajes.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alderetesmaria.lenguajes.models.LenguajesModel;

@Repository
public interface LenguajesRepo extends CrudRepository<LenguajesModel, Long>{

	//Este método recupera todos los lenguajes de la base de datos
    List<LenguajesModel> findAll();
	//Crear 
    LenguajesModel save(LenguajesModel len);
    //Buscar
    Optional<LenguajesModel> findById(Long id);
    //Eliminar
    void deleteById(Long id);
}
