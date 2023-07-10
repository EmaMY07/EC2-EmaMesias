package com.examen.ec2;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "carreras",path = "carreras")
public interface CarreraRepository extends CrudRepository<Carrera,Integer>,PagingAndSortingRepository<Carrera,Integer>{
    List<Curso>findByNombre(@Param("nombre") String nombre);
}
