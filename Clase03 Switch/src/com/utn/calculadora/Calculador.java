package com.utn.calculadora;

import java.util.*;

public class Calculador {

	double a, b;

	public double suma() {
		return a + b;
	}

	public double resta() {
		return a - b;
	}

	public double mulriplicacion() {
		return a * b;
	}

	public double division() {

		double resultado=0;
		
		if (b != 0) {
			resultado=a / b;
			return resultado;
			
		} else {
			mostrarError("no se puede dividir por 0");
			return 0;
		}
	}

	private void mostrarError(String mensajeDeError) {
		System.err.println("##################################################################\n#################### " + mensajeDeError + " ###################\n##################################################################");
	}

	public void pedirValores() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		a = sc.nextDouble();
		System.out.println("Ingrese el segundo numero: ");
		b = sc.nextDouble();

	}
}
