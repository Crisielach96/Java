package com.utn.herencia;

/*Clase concreta Piano, hija de Instrumento*/

public class Piano extends Instrumento {

	public Piano() {
		tipo = "Piano";
	}

	@Override
	public void tocar() {
		System.out.println("Estoy tocando el piano");

	}

}
