package com.utn.vista;

public class Clienteview {
	
	

	public void imprimirDatos(int id, String nombre, String apellido, int dni) {
		System.out.println("Estoy en Cliente vista");
		System.out.println("Datos del Cliente");
		System.out.println("ID: " + id);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("DNI: " + dni);
	}
}
