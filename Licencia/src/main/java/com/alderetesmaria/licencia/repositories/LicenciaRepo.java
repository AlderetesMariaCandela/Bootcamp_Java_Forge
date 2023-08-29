package com.alderetesmaria.licencia.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alderetesmaria.licencia.models.Licencia;


@Repository
public interface LicenciaRepo extends CrudRepository<Licencia, Long> {

	public Licencia findTopByOrderByNumberDesc();
	
}
