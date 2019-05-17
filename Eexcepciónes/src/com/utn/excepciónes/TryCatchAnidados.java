package com.utn.excepciónes;

public class TryCatchAnidados {

	public static void main(String[] args) {

		int num[] = { 1, 4, 6, 8, 9, 234, 256, 512 };
		int denominador[] = { 2, 0, 6, 4, 0, 8 };

		try {
			for (int i = 0; i < num.length; i++) {
				try {
					System.out.println(num[i] + " / " + denominador[i] + " es " + num[i] / denominador[i]);
				} catch (ArithmeticException e) {
					System.out.println("No se puede dividir por cero pedaso de forro");
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ocurrio un error");
			System.out.println("Error: Programa terminado");
		}
	}
}
