package com.utn.adivina_el_numero;

import java.io.IOException;
import java.util.Scanner;

public class Juego {

	Scanner sc = new Scanner(System.in);
	int numero = (int) (Math.random() * 500) + 1;
	int numeroIngresado = 0, intentos = 0;

	public void Adivinar() throws IOException {
		//System.out.println(numero);
		do {
			try {
				System.out.print("Ingrese un numero entre 1 y 500: ");
				numeroIngresado = sc.nextInt();
				if (numeroIngresado < numero) {
					System.out.println("El nuemro es mas grande");
				} else if (numeroIngresado > numero) {
					System.out.println("El nuemro es mas bajo");
				}

			} catch (Exception e) {
				System.out.println("Ingresó una letra, ingrese un numero");
				sc.nextLine();
			} finally {
				intentos++;
			}

		} while (numeroIngresado != numero);
		System.out.println("VICTORIA! Intentos: " + intentos);
	}
}
