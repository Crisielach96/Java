package com.utn.arrayDeObjetos;

import java.util.Scanner;

public class Empleado {

	private String nombre;
	private String apellido;
	private int edad;
	private double salario;

	public Empleado(String nombre, int edad, String apellido, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.apellido = apellido;
		this.salario = salario;
	}

	public Empleado(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Empleado(int salario) {
		this.salario = salario;
	}

	public Empleado(String nombre, int edad, String apellido) {
		this.nombre = nombre;
		this.edad = edad;
		this.apellido = apellido;
	}

	public Empleado() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Edad: " + getEdad() + ", Salario: "
				+ getSalario();
	}

	public void solicitarDatos() {
		Scanner sc = new Scanner(System.in);

		int edad = 0;

		System.out.print("Ingrese nombre: ");
		this.nombre = sc.nextLine();

		System.out.print("Ingrese apellipo: ");
		this.apellido = sc.nextLine();

		do {
			System.out.print("Ingrese edad: ");
			edad = sc.nextInt();

			if (edad > 0) {
				this.edad = edad;
			} else {
				System.out.println("Error!!");
			}
		} while (edad <= 0);

		System.out.print("Ingrese salario: ");
		this.salario = sc.nextDouble();
	}
}
