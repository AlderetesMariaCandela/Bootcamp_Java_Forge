package com.alderetesmaria.licencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alderetesmaria.licencia.models.Licencia;
import com.alderetesmaria.licencia.models.Persona;
import com.alderetesmaria.licencia.repositories.LicenciaRepo;
import com.alderetesmaria.licencia.repositories.PersonaRepo;

@Service
public class MainService {

	@Autowired
	private LicenciaRepo licenciaRepo;
	
	@Autowired
	private PersonaRepo personaRepo;
	
	//servicio personas
	public Persona crearPersona(Persona persona) {
		return personaRepo.save(persona);
	}
	public List<Persona> todasPersonas(){
		return personaRepo.findAll();
	}
	public List<Persona> obtenerPersonaSinLic(){
		return personaRepo.findByLicenseIdIsNull();
	}
	
	//servicio licencias
	public Licencia crearLicencia(Licencia licencia) {
		licencia.setNumber(this.generarNumeroLic());
		return licenciaRepo.save(licencia);
	}
	//metodo para generar nro de licencia 
	public int generarNumeroLic() {
		Licencia lic = licenciaRepo.findTopByOrderByNumberDesc();
		if(lic == null) {
			return 1;
		}
		int numMayorLicencia = lic.getNumber();
		numMayorLicencia ++;
		return numMayorLicencia;
	}
}
