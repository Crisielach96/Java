package com.utn.excepciónes;

public class NewException {

	static void forzarExcepcion() {
		int num[] = new int[4];

		System.out.println("Antes del error de array");

		num[12] = 23;

		System.out.println("Estoy despues de romper todo");
	}
}
