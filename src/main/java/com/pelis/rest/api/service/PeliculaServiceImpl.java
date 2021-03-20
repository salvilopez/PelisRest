package com.pelis.rest.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pelis.rest.api.models.dao.IPeliculaDao;
import com.pelis.rest.api.models.dto.Pelicula;
@Service
public class PeliculaServiceImpl implements IPeliculaService{

	
	@Autowired
	private IPeliculaDao peliDao;
	
	@Override
	public List<Pelicula> findAllPeliculas() {
		return peliDao.findAll();
	}

	@Override
	public Pelicula findPeliculaById(Integer codigoPelicula) {
		return peliDao.findById(codigoPelicula).get();
	}

	@Override
	public Pelicula savePelicula(Pelicula pelicula) {
		return peliDao.save(pelicula);
	}

	@Override
	public void deletePelicula(Integer codigoPelicula) {
		peliDao.deleteById(codigoPelicula);
	}

}
