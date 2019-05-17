package com.utn.JAVA_SE8;

public class Disco extends Multimedia {

	private EGenero genero;

	public Disco(String titulo, String autor, EFormato formato, double duracion, EGenero genero) {
		super(titulo, autor, formato, duracion);
		this.genero = genero;
	}

	public EGenero getGenero() {
		return genero;
	}

	public void setGenero(EGenero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return super.toString() + ", Genero= " + genero;
	}
}
