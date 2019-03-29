package com.utn.clase03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mesesTrabajados = 0;
		double salario = 0;

		final double MENOSDEUNA = 0.05;
		final double MENOSDEDOSA = 0.07;
		final double MENOSDECINCOA = 0.10;
		final double MENOSDEDIEZA = 0.15;
		final double MASDEDIEZA = 0.20;

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese los meses trabajados: ");
		mesesTrabajados = sc.nextInt();

		System.out.print("Ingrese salario anual: ");
		salario = sc.nextDouble();

		if (mesesTrabajados < 12) {
			System.out.println("Su porcentaje sera del %5");
			salario = salario * MENOSDEUNA;
		} else if (mesesTrabajados >= 12 && mesesTrabajados < 24) {
			System.out.println("Su porcentaje sera del %7");
			salario = salario * MENOSDEDOSA;
		} else if (mesesTrabajados >= 24 && mesesTrabajados < 60) {
			System.out.println("Su porcentaje sera del %10");
			salario = salario * MENOSDECINCOA;
		} else if (mesesTrabajados >= 60 && mesesTrabajados < 120) {
			System.out.println("Su porcentaje sera del %15");
			salario = salario * MENOSDEDIEZA;
		} else {
			System.out.println("Su porcentaje sera del %20");
			salario = salario * MASDEDIEZA;
		}
		System.out.println("Su utilidad sera: " + salario);
	}

}
