package com.utn.controler;

import java.util.Scanner;

import com.utn.modelo.conexion.PersonaVO;

public class Controlador {

	PersonaVO miPersona = new PersonaVO();
	Scanner sc = new Scanner(System.in);

	public PersonaVO dios(int id) {

		miPersona.setIdP(id);
		System.out.print("Ingrese nombre: ");
		sc.nextLine();
		miPersona.setNombreP(sc.nextLine());
		System.out.print("Ingrese edad: ");
		miPersona.setEdadP(sc.nextInt());
		System.out.print("Ingrese profesion: ");
		sc.nextLine();
		miPersona.setProfesionP(sc.nextLine());
		System.out.print("Ingrese telefono: ");
		miPersona.setTelefonoP(sc.nextInt());

		return miPersona;
	}

	public PersonaVO dios() {

		System.out.print("Ingrese ID: ");
		miPersona.setIdP(sc.nextInt());
		System.out.print("Ingrese nombre: ");
		sc.nextLine();
		miPersona.setNombreP(sc.nextLine());
		System.out.print("Ingrese edad: ");
		miPersona.setEdadP(sc.nextInt());
		System.out.print("Ingrese profesion: ");
		sc.nextLine();
		miPersona.setProfesionP(sc.nextLine());
		System.out.print("Ingrese telefono: ");
		miPersona.setTelefonoP(sc.nextInt());
		return miPersona;
	}

	public int solicitarID() {
		System.out.print("Ingrese ID: ");
		int id = sc.nextInt();
		return id;
	}
}
