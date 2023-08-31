package com.alderetesmaria.listaestudiantes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alderetesmaria.listaestudiantes.models.ContactModel;
import com.alderetesmaria.listaestudiantes.models.StudentModel;
import com.alderetesmaria.listaestudiantes.services.ApiService;

import jakarta.validation.Valid;

@Controller
public class MainController {

	// inyeccion dependencia de servicio

	@Autowired
	private ApiService apiService;
	
	@GetMapping("/")
	public String inicio() {
		return "index.jsp";
	}

	@GetMapping("/students")
	public String index(Model model) {
		List<StudentModel> listaStudents = apiService.listStudents();
		model.addAttribute("students", listaStudents);
		return "/estudiantes.jsp";
	}

	@GetMapping("/students/create")
	public String showCreateStudent(@ModelAttribute("student") StudentModel student) {
		return "/newstudent.jsp";
	}

	@PostMapping("/students/create")
	public String creaateStudent(@Valid @ModelAttribute("student") StudentModel student, BindingResult result) {
		if (result.hasErrors()) {
			return "/newstudent.jsp";
		} else {
			apiService.createStudent(student);
			return "redirect:/students";
		}
	}

	@GetMapping("/contacts/create")
	public String showContact(@ModelAttribute("contact") ContactModel contact) {
		return "/newcontact.jsp";
	}

	@PostMapping("/contacts/create")
	public String createContact(@Valid @ModelAttribute("contact") ContactModel contact, BindingResult result) {
		if (result.hasErrors()) {
			return "/newcontact.jsp";
		} else {
			apiService.createContact(contact);
			return "redirect:/students";
		}
	}
}
