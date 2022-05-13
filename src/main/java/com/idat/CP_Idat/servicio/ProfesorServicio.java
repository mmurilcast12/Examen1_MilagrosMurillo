package com.idat.CP_Idat.servicio;

import java.util.List;

import com.idat.CP_Idat.dto.ProfesorDTORequest;
import com.idat.CP_Idat.dto.ProfesorDTOResponse;

public interface ProfesorServicio {
	
	public void guardarProfesor(ProfesorDTORequest producto);
	public void editarProfesor(ProfesorDTORequest producto);
	
	public void eliminarProfesor(Integer id);
	
	public List<ProfesorDTOResponse> listarProfesor();
	public ProfesorDTOResponse obtenerProfesorId(Integer id);

}
	