package com.utn.Biblioteca;

public class MainBiblioteca {

	public static void main(String[] args) {

		Libro harryPotter = new Libro("112233", "Harry Popoter", 2005);
		Revista life = new Revista("445566", "Life", 2005, 4);

		System.out.println(harryPotter.toString());
		System.out.println();
		harryPotter.prestar();
		System.out.println(harryPotter.toString());
		System.out.println();
		harryPotter.devolver();
		System.out.println(harryPotter.toString());
		System.out.println();
		System.out.println(life.toString());
		System.out.println();
		System.out.println("Numero de vista: " + life.getNumRevista());
	}

}
