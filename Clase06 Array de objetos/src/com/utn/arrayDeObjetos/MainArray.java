package com.utn.arrayDeObjetos;

public class MainArray {

	public static void main(String[] args) {

		Empleado miArray[] = new Empleado[3];

		// miArray[2].setSalario(25000);

		for (int i = 0; i < 3; i++) {
			miArray[i] = new Empleado();
			miArray[i].solicitarDatos();
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Empleado Nº: " + (i + 1) + ", " + miArray[i].toString());
		}

		int suma = 0;

		for (int i = 0; i < 3; i++) {
			suma += miArray[i].getSalario();
		}

		System.out.println("La suma es de: " + suma);

	}

}
