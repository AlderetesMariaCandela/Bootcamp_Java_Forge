package com.alderetesmaria.listaestudiantes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alderetesmaria.listaestudiantes.models.ContactModel;
import com.alderetesmaria.listaestudiantes.models.StudentModel;
import com.alderetesmaria.listaestudiantes.repositories.ContactRepo;
import com.alderetesmaria.listaestudiantes.repositories.StudentRepo;

@Service
public class ApiService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private ContactRepo contactRepo;
	
	public List<StudentModel> listStudents(){
		return studentRepo.findAll();
	}
	
	
	public StudentModel createStudent(StudentModel s) {
		return studentRepo.save(s);
	}
	
	public ContactModel createContact(ContactModel c) {
		return contactRepo.save(c);
	}
}
