package com.utn.ejercicio.persona;

import java.util.Scanner;

public class MainEjercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nombre = "";
		int edad = 0;
		double altura = 0.0f;
		double peso = 0.0f;
		char sexo = 'h';

		int miArray[] = new int[3];

		System.out.println(miArray[0]);
		System.out.println(miArray[1]);
		System.out.println(miArray[2]);

		miArray[0] = 1;
		miArray[1] = 2;
		miArray[2] = 3;

		System.out.println();
		System.out.println(miArray[0]);
		System.out.println(miArray[1]);
		System.out.println(miArray[2]);

		Persona p2 = new Persona("Maria", 25, 'm', 65.4, 1.64);
		Persona p3 = new Persona();

		System.out.print("Ingrese nombre: ");
		nombre = sc.nextLine();
		System.out.print("Ingrese edad: ");
		edad = sc.nextInt();
		System.out.print("Ingrese sexo: ");
		sexo = sc.next().charAt(0);
		System.out.print("Ingrese altura: ");
		altura = sc.nextDouble();
		System.out.print("Ingrese peso: ");
		peso = sc.nextDouble();
		System.out.println();

		Persona p1 = new Persona(nombre, edad, sexo, peso, altura);

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

	}

}
