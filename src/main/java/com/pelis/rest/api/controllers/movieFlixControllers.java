package com.pelis.rest.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pelis.rest.api.models.dto.Pelicula;
import com.pelis.rest.api.service.PeliculaServiceImpl;


@CrossOrigin(origins = "*",methods = {RequestMethod.POST,RequestMethod.GET} )
@RestController
@RequestMapping("/")
public class movieFlixControllers {

	
	@Autowired
	private PeliculaServiceImpl peliDao;
	
	

	// http://localhost:8080/clientes/listar (GET)
	@GetMapping("peliculas")
	public List<Pelicula> listarPeliculas() {

		return peliDao.findAllPeliculas();
	}
	//ok
	// http://localhost:8080/clientes/buscar/{nombreUsuario} (GET)
	@GetMapping(value = "peliculas/buscar/{codigoPelicula}")
	public Pelicula buscarPelicula(@PathVariable("codigoPelicula") Integer codigoPelicula) {

		return peliDao.findPeliculaById(codigoPelicula);

	}
	
	
	
	// http://localhost:8080/clientes/crear (ADD)
	@PostMapping(value = "peliculas/crear")
//	@ResponseStatus(HttpStatus.CREATED)
	public Pelicula crear(@RequestBody Pelicula peli) {

//		cli.setPassword(encoder.encode(cli.getPassword()));
		return peliDao.savePelicula(peli);

	}
	
	// http://localhost:8080/modificar/nombreUsuario (put)
	@PutMapping(value = "/modificar/{codigoPelicula}")
//	@ResponseStatus(HttpStatus.CREATED)
	public Pelicula modificar(@RequestBody Pelicula peli,@PathVariable("codigoPelicula") Integer codigoPelicula) {
		Pelicula peliculaActual = peliDao.findPeliculaById(codigoPelicula);

		peliculaActual.setCodigopelicula(peli.getCodigopelicula());
		peliculaActual.setImagen(peli.getImagen());
		peliculaActual.setTitulo(peli.getTitulo());
		peliculaActual.setUrl(peli.getUrl());
	
		return 	peliDao.savePelicula(peliculaActual);	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
