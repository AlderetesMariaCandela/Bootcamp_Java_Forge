package com.alderetesmaria.listaestudiantes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alderetesmaria.listaestudiantes.models.ContactModel;

@Repository
public interface ContactRepo extends CrudRepository<ContactModel, Long>{

}
