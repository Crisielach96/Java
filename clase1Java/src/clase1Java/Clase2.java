	package clase1Java; 
	import java.util.Scanner;
	public class Clase2 {
		public static void main(String[] args) {
			double salario;
			double a = 0;
			double total;
			double total2;
			Scanner S = new Scanner(System.in);
			System.out.println("Ingresar Salario ");
			salario = S.nextDouble();
			System.out.println("Ingrasar antidad de años");
			a = S.nextDouble();
			if (a == 0 && a < 1) {
				total = (salario * 0.05);
				total2 = total + salario;
				System.out.println("El salario es: " + total2);
			} else {
				if (a == 1) {
					total = (salario * 0.07);
					total2 = total + salario;
					System.out.println("El salario total es: " + total2);
				} else {
					if (a == 2 && a < 5) {
						total = (salario * 0.10);
						total2 = total + salario;
						System.out.println("El salario total es: " + total2);
					}
	
					else {
						if (a == 5 && a < 10) {
							total = (salario * 0.15);
							total2 = total + salario;
							System.out.println("El salario es: " + total2);
						} else {
							total = (salario * 0.20);
							total2 = total + salario;
							System.out.println("El salario es: " + total2);
						}
					}
				}
	
			}
		}
	
	}
//