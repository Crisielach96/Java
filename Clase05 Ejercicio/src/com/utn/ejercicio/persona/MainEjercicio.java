package com.utn.ejercicio.persona;

public class MainEjercicio {

	public static void main(String[] args) {

		/*
		 * int miArray[] = new int[3];
		 * 
		 * System.out.println(miArray[0]); System.out.println(miArray[1]);
		 * System.out.println(miArray[2]);
		 * 
		 * miArray[0] = 1; miArray[1] = 2; miArray[2] = 3;
		 * 
		 * System.out.println(); System.out.println(miArray[0]);
		 * System.out.println(miArray[1]); System.out.println(miArray[2]);
		 */

		Persona arrayP[] = new Persona[2];

		for (int i = 0; i < arrayP.length; i++) {
			arrayP[i] = new Persona();
			arrayP[i].solicitarDatos();
		}

		System.out.println();

		for (int i = 0; i < arrayP.length; i++) {
			System.out.println(arrayP[i].toString());
		}

		for (int i = 0; i < arrayP.length; i++) {
			if (arrayP[i].esMayorDeEdad()) {
				System.out.println("Mayor de edad");
			} else {
				System.out.println("Es menor de edad");
			}
		}

		for (int i = 0; i < arrayP.length; i++) {
			if (arrayP[i].calularIMC() == -1) {
				System.out.println("Es flaco.");
			} else if (arrayP[i].calularIMC() == 1) {
				System.out.println("Esta bien.");
			} else if (arrayP[i].calularIMC() == 0) {
				System.out.println("Tiene sobrepeso.");
			}
		}

	}

}
