package com.utn.herencia;

/*Clase concreta Guitarra, hija de Instrumento*/

public class Guitarra extends Instrumento {

	public Guitarra() {
		tipo = "Guitarra";
	}

	@Override
	public void tocar() {
		System.out.println("Estoy tocando la guitarra");
	}

}
