package com.alderetesmaria.lenguajes.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="lenguajes")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class LenguajesModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Por favor agrega una d...")
	@Size(min = 5, max = 200, message="Agrega un lenguaje por favor")
	@Column(name="nombre")
	private String nameL;

	@NotBlank(message = "Por favor agrega una n..")
	@Size(min = 5, message="Minimo 5 caracteres")
	@Column(name= "creador")
	private String creatorL;
	
	@NotBlank(message = "Por favor agrega una ...")
	@Size(min = 1, max = 40)
	@Column(name="version")
	private String versionL;


	// Esto no permitirá que el campo createdAt sea modificado después de su
	// creación.
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
	public Long getId() {
		return id;
	}
	
	public LenguajesModel() {
		
	}
	public LenguajesModel(Long id,
			 String nameL,
			String creatorL,
			String versionL,
			Date createdAt,
			Date updatedAt) {
		
		this.id = id;
		this.nameL = nameL;
		this.creatorL = creatorL;
		this.versionL = versionL;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}


	public void setId(Long id) {
		this.id = id;
	}
	public String getNameL() {
		return nameL;
	}
	public void setNameL(String nameL) {
		this.nameL = nameL;
	}
	public String getCreatorL() {
		return creatorL;
	}
	public void setCreatorL(String creatorL) {
		this.creatorL = creatorL;
	}
	public String getVersionL() {
		return versionL;
	}
	public void setVersionL(String versionL) {
		this.versionL = versionL;
	}
	
	

}
