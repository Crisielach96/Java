package com.utn.operadorTernario;

import javax.swing.JOptionPane;

public class MainOperadorTernario {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		int resultado;

		x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));

		resultado = (x > y) ? x : y;

		System.out.println(resultado);
		
		JOptionPane.showMessageDialog(null,resultado,"Numero mayor",JOptionPane.INFORMATION_MESSAGE);

	}

}
