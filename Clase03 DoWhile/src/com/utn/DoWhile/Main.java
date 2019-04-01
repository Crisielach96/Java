package com.utn.DoWhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int suma = 0;
		int flag = 1;
		char opcion;

		while (flag == 1) {
			System.out.print("Ingrese el primer numero: ");
			num1 = sc.nextInt();
			System.out.print("Ingrese el segundo numero: ");
			num2 = sc.nextInt();
			suma = suma + num1 + num2;
			System.out.print("Quiere seguir? S/N ");
			opcion = sc.next().charAt(0);
			if (opcion == 'n') {
				flag = 0;
			}
		}
		System.out.println("La suma es: " + suma);

		int contrasenia = 123456;
		int contraseniaIngresada = 0;
		int flag1 = 0;

		do {
			if (flag1 == 1) {
				System.out.println("Ingreso mal la contraseña");
			}
			System.out.print("Ingrese la contraseña: ");
			contraseniaIngresada = sc.nextInt();
			flag1 = 1;

		} while (contrasenia != contraseniaIngresada);
		
		sc.close();

	}

}
