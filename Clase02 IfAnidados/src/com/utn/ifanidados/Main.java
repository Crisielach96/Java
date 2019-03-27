package com.utn.ifanidados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n1=0,n2=0,n3=0,mayor=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ingrese nota 1: ");
		n1 = sc.nextInt();

		System.out.print("ingrese nota 2: ");
		n2 = sc.nextInt();
		
		System.out.print("ingrese nota 3: ");
		n3 = sc.nextInt();

		
		if((n1>n2)&&(n1>n3))
		{
			mayor=n1;
		}
		else if((n2>n1)&&(n2>n3))
		{
			mayor=n2;
		}
		else
		{
			mayor=n3;
		}
		
		System.out.println("El mayor es "+mayor);
		
	}

}
