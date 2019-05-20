package com.utn.clase08;

import java.io.IOException;

public class ThrowsDemostracion {

	public static int prompt(String args) throws ArithmeticException, IOException {
		System.out.println(args + ": ");
		int num = System.in.read();
		int resultado = num / 0;
		return resultado;
	}
}
