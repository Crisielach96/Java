package com.utn.clase02.bucleFor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float sumaNotas=0,calificaciones=0,promedio=0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<7;i++)
		{
			System.out.print("Ingrese la nota "+(i+1)+":");
			calificaciones=sc.nextInt();
			sumaNotas+=calificaciones;
		}
		
		promedio=sumaNotas/7;
		System.out.println("su promedio es de: "+promedio);

	}

}
