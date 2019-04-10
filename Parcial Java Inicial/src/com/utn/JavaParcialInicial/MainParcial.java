package com.utn.JavaParcialInicial;

import java.util.Scanner;

public class MainParcial {

	public static void main(String[] args) {

		int caja1 = 0, caja2 = 0, caja3 = 0;

		Scanner sc = new Scanner(System.in);

		int opcion = 0;

		do {
			System.out.println("1 - Caja 1");
			System.out.println("2 - Caja 2");
			System.out.println("3 - Caja 3");
			System.out.println("4 - Salir");

			System.out.println("Elija una caja: ");

			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				if (caja1 <= 5) {

					Helado helado = new Helado();

					System.out.println("1 - Cono");
					System.out.println("2 - Vaso de 1/4");
					System.out.println("3 - 1 Kilo");

					System.out.println("Ingrese el tamaño de helado: ");
					opcion = sc.nextInt();

					switch (opcion) {
					case 1:
						helado.setTipo("Cono");
						break;

					case 2:
						helado.setTipo("Vaso de 1/4");
						break;
					case 3:
						helado.setTipo("1 Kilo");
						break;

					default:
						break;
					}
					if (helado.getTipo() == "Cono") {

						for (int i = 0; i < 2; i++) {

							System.out.println("Gustos");

							System.out.println("1 - Chocolate");
							System.out.println("2 - Dulce de leche");
							System.out.println("3 - Vainilla");
							System.out.println("4 - Limon");
							System.out.println("5 - Frutilla");

							System.out.println("Ingrese los gustos: ");
							opcion = sc.nextInt();

							switch (opcion) {
							case 1:
								helado.setSabor1("Chocolate");
								break;
							case 2:
								helado.setSabor2("Dulce de leche");
								break;
							case 3:
								helado.setSabor3("Vainilla");
								break;
							case 4:
								helado.setSabor4("Limon");
								break;
							case 5:
								helado.setSabor5("Frutilla");
								break;
							default:
								break;
							}
						}
					}
					if (helado.getTipo() == "Vaso de 1/4") {

						for (int i = 0; i < 3; i++) {

							System.out.println("Gustos");

							System.out.println("1 - Chocolate");
							System.out.println("2 - Dulce de leche");
							System.out.println("3 - Vainilla");
							System.out.println("4 - Limon");
							System.out.println("5 - Frutilla");

							System.out.println("Ingrese los gustos: ");
							opcion = sc.nextInt();

							switch (opcion) {
							case 1:
								helado.setSabor1("Chocolate");
								break;
							case 2:
								helado.setSabor2("Dulce de leche");
								break;
							case 3:
								helado.setSabor3("Vainilla");
								break;
							case 4:
								helado.setSabor4("Limon");
								break;
							case 5:
								helado.setSabor5("Frutilla");
								break;
							default:
								break;
							}
						}

						System.out.println("Agregar plus");
						System.out.println("1 - Nada");
						System.out.println("2 - Crema de vainilla");
						System.out.println("3 - Chocolate fundido");

						System.out.println("Ingrese opcion: ");
						opcion = sc.nextInt();

						switch (opcion) {
						case 1:
							helado.setOpcional("Nada");
							break;
						case 2:
							helado.setOpcional("Crema de vainilla");
							break;
						case 3:
							helado.setOpcional("Chocolate Fundido");
							break;
						default:
							break;
						}

					}

					if (helado.getTipo() == "1 Kilo") {

						for (int i = 0; i < 4; i++) {

							System.out.println("Gustos");

							System.out.println("1 - Chocolate");
							System.out.println("2 - Dulce de leche");
							System.out.println("3 - Vainilla");
							System.out.println("4 - Limon");
							System.out.println("5 - Frutilla");

							System.out.println("Ingrese los gustos: ");
							opcion = sc.nextInt();

							switch (opcion) {
							case 1:
								helado.setSabor1("Chocolate");
								break;
							case 2:
								helado.setSabor2("Dulce de leche");
								break;
							case 3:
								helado.setSabor3("Vainilla");
								break;
							case 4:
								helado.setSabor4("Limon");
								break;
							case 5:
								helado.setSabor5("Frutilla");
								break;
							default:
								break;
							}
						}
						System.out.println("Agregar plus");
						System.out.println("1 - Nada");
						System.out.println("2 - Almendras");
						System.out.println("3 - Chocolate fundido");
						System.out.println("4 - Crema de vainilla");

						System.out.println("Ingrese opcion: ");
						opcion = sc.nextInt();

						switch (opcion) {
						case 1:
							helado.setOpcional("Nada");
							break;
						case 2:
							helado.setOpcional("Almendras");
							break;
						case 3:
							helado.setOpcional("Crema de vainilla");
							break;
						case 4:
							helado.setOpcional("Chocolate Fundido");
							break;
						default:
							break;
						}
					}
					System.out.println(helado.toString());
				} else {
					System.out.println("La caja no puede tomar mas pedidos en el dia");
				}
				caja1++;
				break;

			case 2:
				if (caja1 <= 10) {

					Helado helado = new Helado();

					System.out.println("1 - Cono");
					System.out.println("2 - Vaso de 1/4");
					System.out.println("3 - 1 Kilo");

					System.out.println("Ingrese el tamaño de helado: ");
					opcion = sc.nextInt();

					switch (opcion) {
					case 1:
						helado.setTipo("Cono");
						break;

					case 2:
						helado.setTipo("Vaso de 1/4");
						break;
					case 3:
						helado.setTipo("1 Kilo");
						break;

					default:
						break;
					}
					if (helado.getTipo() == "Cono") {

						for (int i = 0; i < 2; i++) {

							System.out.println("Gustos");

							System.out.println("1 - Chocolate");
							System.out.println("2 - Dulce de leche");
							System.out.println("3 - Vainilla");
							System.out.println("4 - Limon");
							System.out.println("5 - Frutilla");

							System.out.println("Ingrese los gustos: ");
							opcion = sc.nextInt();

							switch (opcion) {
							case 1:
								helado.setSabor1("Chocolate");
								break;
							case 2:
								helado.setSabor2("Dulce de leche");
								break;
							case 3:
								helado.setSabor3("Vainilla");
								break;
							case 4:
								helado.setSabor4("Limon");
								break;
							case 5:
								helado.setSabor5("Frutilla");
								break;
							default:
								break;
							}
						}
					}
					if (helado.getTipo() == "Vaso de 1/4") {

						for (int i = 0; i < 3; i++) {

							System.out.println("Gustos");

							System.out.println("1 - Chocolate");
							System.out.println("2 - Dulce de leche");
							System.out.println("3 - Vainilla");
							System.out.println("4 - Limon");
							System.out.println("5 - Frutilla");

							System.out.println("Ingrese los gustos: ");
							opcion = sc.nextInt();

							switch (opcion) {
							case 1:
								helado.setSabor1("Chocolate");
								break;
							case 2:
								helado.setSabor2("Dulce de leche");
								break;
							case 3:
								helado.setSabor3("Vainilla");
								break;
							case 4:
								helado.setSabor4("Limon");
								break;
							case 5:
								helado.setSabor5("Frutilla");
								break;
							default:
								break;
							}
						}

						System.out.println("Agregar plus");
						System.out.println("1 - Nada");
						System.out.println("2 - Crema de vainilla");
						System.out.println("3 - Chocolate fundido");

						System.out.println("Ingrese opcion: ");
						opcion = sc.nextInt();

						switch (opcion) {
						case 1:
							helado.setOpcional("Nada");
							break;
						case 2:
							helado.setOpcional("Crema de vainilla");
							break;
						case 3:
							helado.setOpcional("Chocolate Fundido");
							break;
						default:
							break;
						}

					}

					if (helado.getTipo() == "1 Kilo") {

						for (int i = 0; i < 4; i++) {

							System.out.println("Gustos");

							System.out.println("1 - Chocolate");
							System.out.println("2 - Dulce de leche");
							System.out.println("3 - Vainilla");
							System.out.println("4 - Limon");
							System.out.println("5 - Frutilla");

							System.out.println("Ingrese los gustos: ");
							opcion = sc.nextInt();

							switch (opcion) {
							case 1:
								helado.setSabor1("Chocolate");
								break;
							case 2:
								helado.setSabor2("Dulce de leche");
								break;
							case 3:
								helado.setSabor3("Vainilla");
								break;
							case 4:
								helado.setSabor4("Limon");
								break;
							case 5:
								helado.setSabor5("Frutilla");
								break;
							default:
								break;
							}
						}
						System.out.println("Agregar plus");
						System.out.println("1 - Nada");
						System.out.println("2 - Almendras");
						System.out.println("3 - Chocolate fundido");
						System.out.println("4 - Crema de vainilla");

						System.out.println("Ingrese opcion: ");
						opcion = sc.nextInt();

						switch (opcion) {
						case 1:
							helado.setOpcional("Nada");
							break;
						case 2:
							helado.setOpcional("Almendras");
							break;
						case 3:
							helado.setOpcional("Crema de vainilla");
							break;
						case 4:
							helado.setOpcional("Chocolate Fundido");
							break;
						default:
							break;
						}
					}

					System.out.println(helado.toString());
				}
				caja2++;
				break;

			case 3:
				if (caja1 <= 15) {

					Helado helado = new Helado();

					System.out.println("1 - Cono");
					System.out.println("2 - Vaso de 1/4");
					System.out.println("3 - 1 Kilo");

					System.out.println("Ingrese el tamaño de helado: ");
					opcion = sc.nextInt();

					switch (opcion) {
					case 1:
						helado.setTipo("Cono");
						break;

					case 2:
						helado.setTipo("Vaso de 1/4");
						break;
					case 3:
						helado.setTipo("1 Kilo");
						break;

					default:
						break;
					}
					if (helado.getTipo() == "Cono") {

						for (int i = 0; i < 2; i++) {

							System.out.println("Gustos");

							System.out.println("1 - Chocolate");
							System.out.println("2 - Dulce de leche");
							System.out.println("3 - Vainilla");
							System.out.println("4 - Limon");
							System.out.println("5 - Frutilla");

							System.out.println("Ingrese los gustos: ");
							opcion = sc.nextInt();

							switch (opcion) {
							case 1:
								helado.setSabor1("Chocolate");
								break;
							case 2:
								helado.setSabor2("Dulce de leche");
								break;
							case 3:
								helado.setSabor3("Vainilla");
								break;
							case 4:
								helado.setSabor4("Limon");
								break;
							case 5:
								helado.setSabor5("Frutilla");
								break;
							default:
								break;
							}
						}
					}
					if (helado.getTipo() == "Vaso de 1/4") {

						for (int i = 0; i < 3; i++) {

							System.out.println("Gustos");

							System.out.println("1 - Chocolate");
							System.out.println("2 - Dulce de leche");
							System.out.println("3 - Vainilla");
							System.out.println("4 - Limon");
							System.out.println("5 - Frutilla");

							System.out.println("Ingrese los gustos: ");
							opcion = sc.nextInt();

							switch (opcion) {
							case 1:
								helado.setSabor1("Chocolate");
								break;
							case 2:
								helado.setSabor2("Dulce de leche");
								break;
							case 3:
								helado.setSabor3("Vainilla");
								break;
							case 4:
								helado.setSabor4("Limon");
								break;
							case 5:
								helado.setSabor5("Frutilla");
								break;
							default:
								break;
							}
						}

						System.out.println("Agregar plus");
						System.out.println("1 - Nada");
						System.out.println("2 - Crema de vainilla");
						System.out.println("3 - Chocolate fundido");

						System.out.println("Ingrese opcion: ");
						opcion = sc.nextInt();

						switch (opcion) {
						case 1:
							helado.setOpcional("Nada");
							break;
						case 2:
							helado.setOpcional("Crema de vainilla");
							break;
						case 3:
							helado.setOpcional("Chocolate Fundido");
							break;
						default:
							break;
						}

					}

					if (helado.getTipo() == "1 Kilo") {

						for (int i = 0; i < 4; i++) {

							System.out.println("Gustos");

							System.out.println("1 - Chocolate");
							System.out.println("2 - Dulce de leche");
							System.out.println("3 - Vainilla");
							System.out.println("4 - Limon");
							System.out.println("5 - Frutilla");

							System.out.println("Ingrese los gustos: ");
							opcion = sc.nextInt();

							switch (opcion) {
							case 1:
								helado.setSabor1("Chocolate");
								break;
							case 2:
								helado.setSabor2("Dulce de leche");
								break;
							case 3:
								helado.setSabor3("Vainilla");
								break;
							case 4:
								helado.setSabor4("Limon");
								break;
							case 5:
								helado.setSabor5("Frutilla");
								break;
							default:
								break;
							}
						}
						System.out.println("Agregar plus");
						System.out.println("1 - Nada");
						System.out.println("2 - Almendras");
						System.out.println("3 - Chocolate fundido");
						System.out.println("4 - Crema de vainilla");

						System.out.println("Ingrese opcion: ");
						opcion = sc.nextInt();

						switch (opcion) {
						case 1:
							helado.setOpcional("Nada");
							break;
						case 2:
							helado.setOpcional("Almendras");
							break;
						case 3:
							helado.setOpcional("Crema de vainilla");
							break;
						case 4:
							helado.setOpcional("Chocolate Fundido");
							break;
						default:
							break;
						}
					}

				}
				caja3++;
				break;

			default:
				break;
			}
		} while (opcion != 4);

		System.out.println("Pedidos de la caja 1: " + caja1);
		System.out.println("Pedidos de la caja 2: " + caja2);
		System.out.println("Pedidos de la caja 3: " + caja3);

	}

}
