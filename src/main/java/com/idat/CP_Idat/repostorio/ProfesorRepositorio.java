package com.idat.CP_Idat.repostorio;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.CP_Idat.modelo.Profesor;

@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor, Id>{

}
