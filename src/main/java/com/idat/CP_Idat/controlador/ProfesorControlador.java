package com.idat.CP_Idat.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.CP_Idat.dto.ProfesorDTORequest;
import com.idat.CP_Idat.dto.ProfesorDTOResponse;
import com.idat.CP_Idat.modelo.Profesor;
import com.idat.CP_Idat.servicio.ProfesorServicio;


@RestController
@RequestMapping("/profesor/v1")
public class ProfesorControlador {

	@Autowired
	private ProfesorServicio servicio;
	
	@RequestMapping(path = "/listar" , method = RequestMethod.GET)
	public ResponseEntity<List<ProfesorDTOResponse>>  listarProfesor(){
		return new ResponseEntity<List<ProfesorDTOResponse>>(servicio.listarProfesor(), HttpStatus.CREATED);
			
		}
	
	@RequestMapping(path="/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Profesor profesor){
		
		
		servicio.guardarProfesor(null);
		return new ResponseEntity<Void>(HttpStatus.CREATED); 	
	}
	
	@RequestMapping(path="/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<ProfesorDTOResponse>listarPorId(@PathVariable Integer id){
		
		ProfesorDTOResponse p = servicio.obtenerProfesorId(id);
		if(p != null)
			return new ResponseEntity<ProfesorDTOResponse>(p,HttpStatus.OK);
					
		return new ResponseEntity<ProfesorDTOResponse>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path="/editar",method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody ProfesorDTORequest profesor){
		
		ProfesorDTOResponse p = servicio.obtenerProfesorId(profesor.getIdProfesorDTO());
		
		if(p !=null) {
			servicio.editarProfesor(profesor);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
		}
	
	@RequestMapping(path="/eliminar/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		ProfesorDTOResponse p = servicio.obtenerProfesorId(id);
		
		if(p !=null) {
			servicio.eliminarProfesor(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
		}
		
	}

