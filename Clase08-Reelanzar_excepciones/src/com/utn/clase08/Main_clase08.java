package com.utn.clase08;

import java.io.IOException;

public class Main_clase08 {

	public static void main(String[] args) {

		try {
			Rethrow.generoEception();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error capturado en el main - FIN DEL PROGRAMA");
		}

		for (int i = 0; i < 3; i++) {
			UsoDeFinalliy.generoError(i);
		}

		int ch;

		try {
			ch = ThrowsDemostracion.prompt("ingresa un numero");
		} catch (ArithmeticException | IOException e) {
			System.out.println("Ocurrio un exception de E/S");
			ch = 4;
			e.printStackTrace();
		}

		System.out.println("Usted presiono la tecla " + ch);
	}

}
