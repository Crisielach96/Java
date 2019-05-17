package com.utn.Biblioteca;

public class Libro extends Publicacion implements IPrestable {

	private boolean prestado;

	public Libro(String codigo, String titulo, int anio) {
		super(codigo, titulo, anio);
		this.prestado = false;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public void prestar() {
		System.out.println("Se presto");
		prestado = true;

	}

	@Override
	public void devolver() {
		System.out.println("Se devolvio");
		prestado = false;

	}

	@Override
	public boolean prestado() {
		return prestado;

	}

	@Override
	public String toString() {
		return super.toString() + ", Prestado= " + prestado;
	}

}
