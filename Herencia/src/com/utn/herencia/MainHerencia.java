package com.utn.herencia;

public class MainHerencia {

	public static void main(String[] args) {

		Instrumento miGuitarra = new Guitarra();
		Instrumento miViolin = new Violin();
		Instrumento miPiano = new Piano();
		
		System.out.println("Instrumento: "+ miGuitarra.tipo);
		System.out.println("Instrumento: "+ miViolin.tipo);
		System.out.println("Instrumento: "+ miPiano.tipo);
		System.out.println();
		
		miGuitarra.tocar();
		miViolin.tocar();
		miPiano.tocar();

	}

}
