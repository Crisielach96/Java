package com.utn.excepciónes;

public class MainExcepciónes {

	public static void main(String[] args) {
		int[] array = new int[20];

		try {
			array[-3] = 24;
			int b = 0;
			int resultado = 50 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error de indice de array");
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por cero forro, volve a la primaria");
		}

	}

}
