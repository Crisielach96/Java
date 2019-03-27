package com.utn.proyecto.funcionalidades;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		// System.out.println("Hello World");

		// Comentario de linea

		/**
		 * java DOC
		 */

		/*
		 * 
		 * 
		 * 
		 * comentario de bloque
		 * 
		 * 
		 */

		/*
		 * int dni=40080375;
		 * 
		 * System.out.println("DNI: "+dni+"\n");//imprime variable
		 * 
		 * System.err.println("Error"); //Imprime errores
		 * 
		 * int i=0;
		 * 
		 * for(i=0;i<10;i++) { System.out.println("Hello World"); }
		 * 
		 * i=0;
		 * 
		 * while(i<10) { System.out.println("DNI: "+dni); i++; }
		 */

		/*
		 * int a=10,b=12,c=13,d=10;
		 * 
		 * if(((a>b) || (a<c)) && ((a==c) || (a>=b))) { System.out.println("Verdadero");
		 * } else { System.out.println("Falso"); }
		 * 
		 * if(((a>=b) || (a<d)) && ((a>=c) && (c>d))) { System.out.println("Verdadero");
		 * } else { System.out.println("Falso"); }
		 * 
		 * if((!(a==c) && (c>d))) { System.out.println("Verdadero"); } else {
		 * System.out.println("Falso"); }
		 */

		float nota1=0, nota2 = 0, nota3 = 0, promedio = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("ingrese nota 1: ");
		nota1 = sc.nextFloat();

		System.out.print("ingrese nota 2: ");
		nota2 = sc.nextFloat();
		
		System.out.print("ingrese nota 3: ");
		nota3 = sc.nextFloat();
		
		promedio = (nota1 + nota2 + nota3) / 3;

		if (promedio >= 7) {
			System.out.println("Aprobado - Su promedio es: " + promedio);
		} else {
			System.out.println("Reprobado - Su promedio es: " + promedio);
		}

		

		

	}

}
