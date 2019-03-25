package com.utn.vista;

import java.util.Scanner;

import com.utn.modelo.producto;

public class test {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	int suma = 0;
	int i = 0;
	
	
	producto prod1 = new producto ("alfajor",15);
	producto prod2 = new producto ("cocacola",25);
	producto prod3 = new producto ("caramelos",5);
	producto prod4 = new producto ("galletitas",20);
	
do {	
} while (i<=3);
	System.out.println("Ingrese que producto quiere comprar");
	
	
	
	switch (sc.nextInt()) {
	case 1:
		System.out.println("Se adquirió un: " + prod1.nombre + "que cuesta: " + prod1.precio);
		suma= suma + prod1.precio;
		break;
	case 2:
		System.out.println("se adquirió un: " + prod2.nombre + "que cuesta: " + prod2.precio);
		suma= suma + prod2.precio;
		break;
	case 3:
		System.out.println("se adquirió un: " + prod3.nombre + "que cuesta: " + prod3.precio);
		suma= suma + prod3.precio;
		break;
	case 4:
		System.out.println("se adquiri{o un: " + prod4.nombre + "que cuesta: " + prod4.precio);
		suma= suma + prod4.precio;
		break;
	 System.out.println("gastaste " + suma + " pesos");
	}
	
}

