package com.utn.Biblioteca;

public class Revista extends Publicacion {

	private int numRevista;

	public Revista(String codigo, String titulo, int anio, int numRevista) {
		super(codigo, titulo, anio);
		this.numRevista = numRevista;
	}

	public int getNumRevista() {
		return numRevista;
	}

	public void setNumRevista(int numRevista) {
		this.numRevista = numRevista;
	}

	@Override
	public String toString() {
		return super.toString() + ", Numero de Revista= " + numRevista;
	}

	
	

}
