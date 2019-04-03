package com.utn.calculadora;

import java.util.Scanner;

public class Main_calculadora {

	public static void main(String[] args) {

		int opcion = 0, flag = 0;
		Scanner sc = new Scanner(System.in);
		Calculador cal = new Calculador();

		System.out.println("1-Suma");
		System.out.println("2-Resta");
		System.out.println("3-Multiplicacion");
		System.out.println("4-Division");
		System.out.println("5-Cambiar los numeros");
		System.out.println("6-Salir");

		cal.pedirValores();

		do {
			System.out.println("Ingrese opcion: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("La suma es. " + cal.suma());
				break;
			case 2:
				System.out.println("La resta es. " + cal.resta());
				break;
			case 3:
				System.out.println("La multiplicacion es. " + cal.mulriplicacion());
				break;
			case 4:
				if(cal.division()!=0)
				{
					System.out.println("La division es. " + cal.division());
				}
				break;
			case 5:
				cal.pedirValores();
				break;
			case 6:
				flag = 1;
				break;

			default:
				System.out.println("Opcion incorrecta!");
			}
		} while (flag == 0);
		sc.close();
		
	}

}
