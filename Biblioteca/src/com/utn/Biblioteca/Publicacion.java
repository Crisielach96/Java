package com.utn.Biblioteca;

public class Publicacion {
	private String codigo;
	private String titulo;
	private int anioPublicacion;

	public Publicacion() {
		super();
	}

	public Publicacion(String codigo, String titulo, int anioPublicacion) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	@Override
	public String toString() {
		return "Codigo= " + codigo + ", titulo= " + titulo + ", Anio de Publicacion= " + anioPublicacion;
	}

}
