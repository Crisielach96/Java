package com.utn.herencia_bis;

import java.util.Scanner;

public class MainHerencia_Bis {

	public static void main(String[] args) {

		String ColorDelCuadrdo;
		double ladoCuadrado;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese lado del cuadrado: ");
		ladoCuadrado = teclado.nextDouble();
		System.out.print("Ingrese color del Cuadrado: ");
		teclado.nextLine();
		ColorDelCuadrdo = teclado.nextLine();

		Cuadrado cuadrado1 = new Cuadrado(ColorDelCuadrdo, ladoCuadrado);

		System.out.println("El cuadrado " + cuadrado1.getColor() + " tiene un area de: " + cuadrado1.calcularArea());

		String ColorDelTriangulo;
		double base, altura;

		System.out.print("Ingrese base: ");
		base = teclado.nextDouble();
		System.out.print("Ingrese altura: ");
		altura = teclado.nextDouble();
		System.out.print("Ingrese color: ");
		teclado.nextLine();
		ColorDelTriangulo = teclado.nextLine();

		Triangulo trinagulo1 = new Triangulo(ColorDelTriangulo, base, altura);

		System.out.println("El triangulo " + trinagulo1.getColor() + " tiene un area de: " + trinagulo1.calcularArea());

	}

}
