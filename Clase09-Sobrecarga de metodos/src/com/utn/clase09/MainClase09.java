package com.utn.clase09;

import javax.swing.JOptionPane;

public class MainClase09 {

	public static void main(String[] args) {

		int d, m, a;

		d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia: "));
		m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
		a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el anio: "));

		Fecha fecha = new Fecha(d, m, a);

		System.out.println(fecha.toString());

		fecha.asignarFecha();

		System.out.println(fecha.toString());

		fecha.asignarFecha(1);

		System.out.println(fecha.toString());

		fecha.asignarFecha(1, 1);

		System.out.println(fecha.toString());

		fecha.asignarFecha(1, 1, 1);

		System.out.println(fecha.toString());
	}

}
