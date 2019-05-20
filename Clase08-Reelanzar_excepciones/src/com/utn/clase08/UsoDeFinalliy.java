package com.utn.clase08;

public class UsoDeFinalliy {

	public static void generoError(int rec) {
		int t;
		int nums[] = new int[2];

		System.out.println("Recibiendo " + rec);

		try {
			switch (rec) {
			case 0:
				t = 10 / rec;
				break;
			case 1:
				nums[4] = 4;
				break;
			case 2:
				return;
			}
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por cero");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No se encontraron elementos en el array");
		} finally {
			System.out.println("Estoy saliento del try.");
		}
	}
}
