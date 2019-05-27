package com.utn.vista;

import java.util.Scanner;
import com.utn.controler.Controlador;
import com.utn.modelo.DAO.PersonaDAO;

public class MainDB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PersonaDAO pd = new PersonaDAO();
		Controlador pc = new Controlador();
		int opcionMenu = 0;
		int idA, opcionE;

		do {
			System.out.println("1-Crear persona");
			System.out.println("2-Modificar persona");
			System.out.println("3-Eliminar persona");
			System.out.println("4-Buscar persona");
			System.out.println("5-Salir");

			System.out.print("Ingrese opcion: ");
			opcionMenu = sc.nextInt();

			switch (opcionMenu) {
			case 1:
				pd.registrarPersona(pc.dios());
				break;
			case 2:
				idA = pc.solicitarID();
				if (pd.buscarPersona(idA) != null) {
					System.out.println(pd.buscarPersona(idA));
					pd.modificarPersona(pc.dios(idA));
				}

				else {
					System.out.println("No se encontro ese ID, deses crear?");
					System.out.println("Ingrese 1 para crear o cualquier tecla para salir");
					int opcion = sc.nextInt();

					if (opcion == 1) {
						pd.registrarPersona(pc.dios(idA));
					} else {
					}
				}
				break;
			case 3:
				idA = pc.solicitarID();
				System.out.println(pd.buscarPersona(idA));
				System.out.println("Quiere eliminar? 1 si - !=1 no");
				opcionE = sc.nextInt();
				if (opcionE == 1) {
					pd.eliminarPersona(idA);
				} else {
					System.out.println("No se elimino");
				}
				break;
			case 4:
				System.out.print("Ingrese ID: ");
				idA = sc.nextInt();
				System.out.println(pd.buscarPersona(idA));
				break;

			case 5:
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcionMenu != 5);
	}

}
