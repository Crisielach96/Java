package com.utn.clase05_intermedio;

public class MainClase05_Intermedio {

	public static void main(String[] args) {
		SerieNumericaDeDosEnDos sn = new SerieNumericaDeDosEnDos();
		Detres tres = new Detres();
		ISeriesNumericas ob;

		for (int j = 0; j < 5; j++) {
			ob = sn;
			System.out.println("Ref, siguiente valor de dos es: " + ob.getSiguiente());
			ob = tres;
			System.out.println("Ref, siguiente valor de tres es: " + ob.getSiguiente());
		}

		/*
		 * for (int i = 0; i < 5; i++) { System.out.println(sn.getSiguiente()); }
		 * 
		 * System.out.println("\nReiniciando la serie."); sn.reiniciar();
		 * 
		 * for (int i = 0; i < 5; i++) { System.out.println(sn.getSiguiente()); }
		 * System.out.println("\nReiniciando la serie."); sn.setComenzar(50);
		 * 
		 * for (int i = 0; i < 5; i++) { System.out.println(sn.getSiguiente()); }
		 * 
		 * System.out.println("\n***Reiniciando la serie pero con 3***");
		 * System.out.println();
		 * 
		 * for (int i = 0; i < 5; i++) { System.out.println(tres.getSiguiente()); }
		 * 
		 * System.out.println("\nReiniciando la serie."); tres.reiniciar();
		 * 
		 * for (int i = 0; i < 5; i++) { System.out.println(tres.getSiguiente()); }
		 * System.out.println("\nReiniciando la serie."); tres.setComenzar(50);
		 * 
		 * for (int i = 0; i < 5; i++) { System.out.println(tres.getSiguiente()); }
		 */
	}

}
