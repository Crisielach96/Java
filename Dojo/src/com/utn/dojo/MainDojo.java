package com.utn.dojo;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDojo {

	public static void main(String[] args) {

		ArrayList<Pizza> microondas = new ArrayList<Pizza>();

		int opcion = 0,cantMu=0,cantPro=0,cantTom=0,cantJam=0,cantSalsa=0,cantQueso=0, cantAce=0,tiempoTotal=0;

		do {
			System.out.println("1-Pizza Grande de muzzarela.");
			System.out.println("2-Pizza doble queso con jamon.");
			System.out.println("3-Pizza vagetariana.");
			System.out.println("4-Desenchufar.");

			Scanner sc = new Scanner(System.in);

			System.out.print("Ingrese opcion: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				Pizza p1 = new Pizza("Grande de muzzarela", "Muzzarela", "Tomate", "Ninguno", "Ninguno", 5);
				microondas.add(p1);
				cantMu++;
				cantTom++;
				tiempoTotal+=5;
				break;

			case 2:
				Pizza p2 = new Pizza("Doble queso con jamon", "Muzzarella", "Provolone", "Tomate", "jamon", 10);
				microondas.add(p2);
				cantMu++;
				cantPro++;
				cantTom++;
				cantJam++;
				tiempoTotal+=10;
				break;
			case 3:
				Pizza p3 = new Pizza("La vegetariana", "Acelga", "Muzarella", "Salsa blanca", "queso rayado", 15);
				microondas.add(p3);
				cantMu++;
				cantSalsa++;
				cantQueso++;
				cantAce++;
				tiempoTotal+=15;
				break;

			default:
				break;
			}

		} while (opcion != 4);

		for (Pizza pizza : microondas) {
			System.out.println(pizza.toString());
		}

		System.out.println("Cantidad de pizzas: "+microondas.size());
		System.out.println("Cantidad de tiempo de coccion total: "+tiempoTotal);
		System.out.println("Cantidad de Muzza = "+cantMu + " Cantidad Tomate = "+cantTom + " Cantidad de Provolone ="+ cantPro + " Cantidad Jamon = " + cantJam + " Cantidad Salsa Blanca =" + cantSalsa + " Cantidad de Acelga =" + cantAce );
		

	}

}
