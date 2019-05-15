package com.utn.JAVA_SE8;

public class Main {

	public static void main(String[] args) {

		ListaMultimedia lista = new ListaMultimedia(10);

		Multimedia m1 = new Pelicula("Avengers: Endgame", "Hermanos Russo", EFormato.AVI, 181, "Robert Downey Jr",
				"Scarlett Johansson");
		Multimedia m2 = new Pelicula("Halloween", "John carpenter", EFormato.MP4, 91, "Donald Pleasence",
				"Jamie Lee Curtis");
		Multimedia m3 = new Pelicula("Avengers: Endgame", "Hermanos Russo", EFormato.AVI, 181, "Robert Downey Jr",
				"Scarlett Johansson");

		lista.add(m1);
		lista.add(m2);
		lista.add(m3);

		System.out.println(m1.toString());
		System.out.println(m2.toString());

		if (m1.equals(m2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}

		if (m1.equals(m3)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}

		System.out.println();
		System.out.println();

		System.out.println(lista.toString());

	}

}
