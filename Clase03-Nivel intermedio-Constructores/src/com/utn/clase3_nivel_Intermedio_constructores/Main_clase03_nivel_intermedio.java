package com.utn.clase3_nivel_Intermedio_constructores;

import java.util.ArrayList;

public class Main_clase03_nivel_intermedio {

	public static void main(String[] args) {

		/*
		 * Ejemplo Array
		 * 
		 * Passenger[] miArray = new Passenger[3];
		 * 
		 * miArray[0] = new Passenger(); miArray[1] = new Passenger(2); miArray[2] = new
		 * Passenger(2, 4);
		 * 
		 */

		// Ejemplo ArrayList
		ArrayList<Passenger> listaPasageros = new ArrayList<Passenger>();

		Passenger pasagero1 = new Passenger();
		Passenger pasagero2 = new Passenger(2);
		Passenger pasagero3 = new Passenger(2, 4);

		listaPasageros.add(pasagero1);
		listaPasageros.add(pasagero2);
		listaPasageros.add(pasagero3);

		int i = 0;

		for (Passenger x : listaPasageros) {
			System.out.println("Pasagero " + i + " Tarifa por maleta " + x.getTarifaPorMaleta());
			System.out.println("Pasagero " + i + " Total a pagar " + x.getTotalAPagar());
			System.out.println("Pasagero " + i + " Total de maletas que lleva " + x.getTotalDeEquipaje());
			System.out.println();

			i++;
		}
	}

}
