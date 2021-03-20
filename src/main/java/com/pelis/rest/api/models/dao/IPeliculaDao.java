package com.pelis.rest.api.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pelis.rest.api.models.dto.Pelicula;

public interface IPeliculaDao extends JpaRepository<Pelicula, Integer>{

}
