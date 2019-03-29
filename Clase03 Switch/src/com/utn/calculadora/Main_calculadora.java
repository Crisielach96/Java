package com.utn.calculadora;

import java.util.Scanner;

public class Main_calculadora {

	public static void main(String[] args) {

		double num1 = 0, num2 = 0, resultado = 0;
		int opcion = 0, flag = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("1-Suma");
		System.out.println("2-Resta");
		System.out.println("3-Multiplicacion");
		System.out.println("4-Division");
		System.out.println("5-Cambiar los numeros");
		System.out.println("6-Salir");

		System.out.println("Ingrese el primer numero: ");
		num1 = sc.nextDouble();
		System.out.println("Ingrese el segundo numero: ");
		num2 = sc.nextDouble();

		do {
			System.out.println("Ingrese opcion: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				resultado = num1 + num2;
				System.out.println("La suma es. " + resultado);
				break;
			case 2:
				resultado = num1 - num2;
				System.out.println("La resta es. " + resultado);
				break;
			case 3:
				resultado = num1 * num2;
				System.out.println("La multiplicacion es. " + resultado);
				break;
			case 4:
				resultado = num1 / num2;
				System.out.println("La division es. " + resultado);
				break;
			case 5:
				System.out.println("Ingrese el primer numero: ");
				num1 = sc.nextDouble();
				System.out.println("Ingrese el segundo numero: ");
				num2 = sc.nextDouble();
				break;
			case 6:
				flag = 1;
				break;

			default:
				System.out.println("Opcion incorrecta!");
			}
		} while (flag == 0);
	}

}
