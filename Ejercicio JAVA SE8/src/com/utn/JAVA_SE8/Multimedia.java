package com.utn.JAVA_SE8;

public class Multimedia {

	private String titulo, autor;
	private EFormato formato;
	private double duracion;

	public Multimedia() {
		super();
	}

	public Multimedia(String titulo, String autor, EFormato formato, double duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public EFormato getFormato() {
		return formato;
	}

	public void setFormato(EFormato formato) {
		this.formato = formato;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Titulo= " + titulo + ", Autor= " + autor + ", Formato= " + formato + ", Duracion= " + duracion;
	}

	public boolean equals(Multimedia m1) {
		return titulo.equals(m1.getTitulo()) && autor.equals(m1.getAutor());
	}

}
