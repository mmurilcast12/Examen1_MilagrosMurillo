package com.idat.CP_Idat.modelo;

import java.io.Serializable;

public class Malla_Curricular implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3224410202304203642L;
	private Integer	idMalla;
	private String	año;
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	public Malla_Curricular(Integer idMalla, String año) {
		super();
		this.idMalla = idMalla;
		this.año = año;
	}
	
	

}
