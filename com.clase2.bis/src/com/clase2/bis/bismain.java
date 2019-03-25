package com.clase2.bis;
import java.util.Scanner;
public class bismain {
	public static void main (String[] args) {
		int num1;
		int num2;
		Scanner S = new Scanner (System.in);
		System.out.println("ingrsar numero 1");
		num1 = S.nextInt();
		System.out.println("Ingresar numero 2");
		num2 = S.nextInt();
		while (num1 < 101) { System.out.println("El numero " +num1);
		//autoinecremente ++ autodecrementa --
		num1++; 
			
		}
	do {System.out.println("El numero" +num2);
			num2++;
	} while (num2 < 101);
	}

}
