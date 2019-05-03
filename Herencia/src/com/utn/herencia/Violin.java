package com.utn.herencia;

/*Clase concreta Violin, hija de Instrumento*/

public class Violin extends Instrumento {

	public Violin() {
		tipo = "Violin";
	}

	@Override
	public void tocar() {
		System.out.println("Estoy tocando el violin");

	}

}
