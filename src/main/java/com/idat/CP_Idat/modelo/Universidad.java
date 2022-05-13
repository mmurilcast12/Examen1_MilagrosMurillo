package com.idat.CP_Idat.modelo;

import java.io.Serializable;

public class Universidad implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9125450564400372670L;
	private Integer	idUniversidad;
	private String	universidad;
	public Integer getIdUniversidad() {
		return idUniversidad;
	}
	public void setIdUniversidad(Integer idUniversidad) {
		this.idUniversidad = idUniversidad;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	public Universidad(Integer idUniversidad, String universidad) {
		super();
		this.idUniversidad = idUniversidad;
		this.universidad = universidad;
	}
	
	

}
