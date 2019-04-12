package com.utn.Clase09;

import java.util.ArrayList;

public class Main_Clase09 {

	public static void main(String[] args) {

		ArrayList<Empleado> empleados = new ArrayList<Empleado>();

		int i;
		Empleado emp = new Empleado();
		empleados.add(emp);

		for (i = 0; i < empleados.size(); i++) {
			empleados.get(i).solicitarDatos();
		}

		for (i = 0; i < empleados.size(); i++) {
			System.out.println("Empleado Nº: " + (i + 1) + ", " + empleados.get(i).toString());
		}
	}

}
