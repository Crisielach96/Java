package com.utn.clase02;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		/*
		int horasTrabajadas = 0;
		int horasTrabajadasAux = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese las horas trabajadas: ");
		horasTrabajadas = sc.nextInt();

		if (horasTrabajadas <= 40) {
			horasTrabajadas = horasTrabajadas * 16;
			System.out.println("Paga: " + horasTrabajadas);
		} else {
			horasTrabajadasAux = horasTrabajadas - 40;
			horasTrabajadasAux = (horasTrabajadasAux * 20) + 40 * 16;
			System.out.println("Paga: " + horasTrabajadasAux);

		}*/
		
		int i=0;
		int num=0,num2=9;
		for(i=0;i<11;i++) 
		{ 
			System.out.println(num);
			num++;
		}
		
		for(i=10;i>0;i--) 
		{ 
			System.out.println(num2);
			num2--;
		}
	}

}
