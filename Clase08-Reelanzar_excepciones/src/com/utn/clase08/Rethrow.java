package com.utn.clase08;

public class Rethrow {

	public static void generoEception() {
		int num[] = { 1, 4, 6, 8, 9, 234, 256, 512, 1024 };
		int denominador[] = { 2, 0, 6, 4, 0, 7 };

		for (int i = 0; i < num.length; i++) {
			try {
				System.out.println(num[i] + " / " + denominador[i] + " es: " + num[i] / denominador[i]);
			} catch (ArithmeticException e) {
				System.out.println("No se puede dividir por cero en los numeros reales");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("no se pudo encontrar elemento en el array");
				System.out.println(e);
				e.printStackTrace();
				throw e;
			}
		}
	}
}
