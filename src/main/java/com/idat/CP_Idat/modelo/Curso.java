package com.idat.CP_Idat.modelo;

import java.io.Serializable;

public class Curso implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8947726407049057244L;
	private Integer	idCurso;
	private String curso;
	private String descripcion;
	private Integer	idMalla;
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public Curso(Integer idCurso, String curso, String descripcion, Integer idMalla) {
		super();
		this.idCurso = idCurso;
		this.curso = curso;
		this.descripcion = descripcion;
		this.idMalla = idMalla;
	}
	
	

}
