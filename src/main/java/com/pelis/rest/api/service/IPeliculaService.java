package com.pelis.rest.api.service;

import java.util.List;

import com.pelis.rest.api.models.dto.Pelicula;

public interface IPeliculaService {
	public List<Pelicula> findAllPeliculas();	
	public Pelicula findPeliculaById(Integer codigoPelicula);	
	public Pelicula savePelicula(Pelicula pelicula);	
	public void deletePelicula(Integer codigoPelicula);
}
