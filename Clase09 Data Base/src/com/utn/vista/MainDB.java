package com.utn.vista;

import java.util.Scanner;

import com.utn.modelo.conexion.Conexion;
import com.utn.modelo.conexion.PersonaVO;
import com.utn.modelo.DAO.PersonaDAO;

public class MainDB {

	public static void main(String[] args) {

		Conexion c1 = new Conexion();
		PersonaVO p1 = new PersonaVO();
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.print("Ingrese ID: "); p1.setIdP(sc.nextInt());
		 * System.out.print("Ingrese nombre: "); sc.nextLine();
		 * p1.setNombreP(sc.nextLine()); System.out.print("Ingrese edad: ");
		 * p1.setEdadP(sc.nextInt()); System.out.print("Ingrese profesion: ");
		 * sc.nextLine(); p1.setProfesionP(sc.nextLine());
		 * System.out.print("Ingrese telefono: "); p1.setTelefonoP(sc.nextInt());
		 * 
		 * System.out.println(p1.toString());
		 */

		PersonaDAO pd = new PersonaDAO();

		// pd.registrarPersona(p1);

		System.out.println(pd.buscarPersona(1));
		System.out.println(pd.buscarPersona(2));
		pd.eliminarPersona(1);
	}

}
