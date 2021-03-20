package com.pelis.rest.api.models.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Pelicula implements Serializable{

	private static final long serialVersionUID = -2476292625646915564L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "codigopelicula",unique = true)
	private Integer codigopelicula;
	private String titulo; 
	private String url;
	private String imagen;
	public Pelicula(Integer codigopelicula, String titulo, String url, String imagen) {
		this.codigopelicula = codigopelicula;
		this.titulo = titulo;
		this.url = url;
		this.imagen = imagen;
	}
	public Pelicula() {
	}
	public Integer getCodigopelicula() {
		return codigopelicula;
	}
	public void setCodigopelicula(Integer codigopelicula) {
		this.codigopelicula = codigopelicula;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
