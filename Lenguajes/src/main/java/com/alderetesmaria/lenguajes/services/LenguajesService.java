package com.alderetesmaria.lenguajes.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alderetesmaria.lenguajes.models.LenguajesModel;
import com.alderetesmaria.lenguajes.repositories.LenguajesRepo;

@Service
public class LenguajesService {
	
	//inyeccion dependencia
	
    private final LenguajesRepo lengrepo;

	public LenguajesService(LenguajesRepo lengrepo) {
		this.lengrepo = lengrepo;
	}

	public List<LenguajesModel> findAll() {
		return lengrepo.findAll();
	}

	public LenguajesModel save(LenguajesModel len) {
		return lengrepo.save(len);
	}
	
	public LenguajesModel findById(Long id) {
		return lengrepo.findById(id).orElse(null);
	}
	public void deleteById(Long id) {
		lengrepo.deleteById(id);
	}
}
