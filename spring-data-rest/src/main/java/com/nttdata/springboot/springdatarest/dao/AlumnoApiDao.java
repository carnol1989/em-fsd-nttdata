package com.nttdata.springboot.springdatarest.dao;

import com.nttdata.springboot.springdatarest.model.Alumno;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "alumno", collectionResourceRel = "alumnoApi")
public interface AlumnoApiDao extends PagingAndSortingRepository<Alumno, Integer> {

}
