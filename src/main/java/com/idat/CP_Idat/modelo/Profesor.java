package com.idat.CP_Idat.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Table(name = "Profesor")
@Entity
public class Profesor implements Serializable{
	
	private static final long serialVersionUID = 1763392395553564772L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer	idProfesor;
	private String profesor;
	
	
	public Integer getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	public Profesor(Integer idProfesor, String profesor) {
		super();
		this.idProfesor = idProfesor;
		this.profesor = profesor;	
	}
	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
