package com.utn.ejercicio.persona;

import java.util.Scanner;

public class Persona {

	static final char HOMBRE = 'H';
	static final char MUJER = 'M';
	static final int BIEN = 1;
	static final int FLACO = -1;
	static final int SOBREPESO = 0;

	private String nombre;
	private int edad;
	private long dni;
	private char sexo;
	private double peso;
	private double altura;

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.dni = this.generarDNI();
	}

	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = HOMBRE;
		this.peso = 0.0f;
		this.altura = 0.0f;
		this.dni = this.generarDNI();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	int calularIMC() {
		double imc = 0;
		int retorno = 0;

		imc = this.peso / (Math.pow(this.altura, 2));
		if (imc < 20) {
			retorno = FLACO;
		} else if (imc > 19 && imc < 26) {
			retorno = BIEN;
		} else {
			retorno = SOBREPESO;
		}
		return retorno;
	}

	boolean esMayorDeEdad() {
		boolean retorno = false;
		if (edad > 17) {
			retorno = true;
		}

		return retorno;
	}

	void comprobarSexo(char sexo) {

		if (sexo != 'h' && sexo != 'm') {
			this.sexo = HOMBRE;
		} else {
			this.sexo = sexo;
		}
	}

	@Override
	public String toString() {

		return "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nSexo: " + this.sexo + "\nDNI: " + this.dni
				+ "\nAltura: " + this.altura + "\nPeso: " + this.peso + "\n";
	}

	private int generarDNI() {
		return (int) Math.floor(Math.random() * (99999999 - 10000000 + 1) + 10000000);
	}

	public void solicitarDatos() {
		Scanner sc = new Scanner(System.in);
		int edad = 0;

		System.out.print("Ingrese nombre: ");
		this.nombre = sc.nextLine();

		do {
			System.out.print("Ingrese edad: ");
			edad = sc.nextInt();
			if (edad > 0) {
				this.edad = edad;
			} else {
				System.out.println("Error!!");
			}
		} while (edad <= 0);

		System.out.print("Ingrese sexo: ");
		this.sexo = sc.next().charAt(0);

		System.out.print("Ingrese peso: ");
		this.peso = sc.nextDouble();

		System.out.print("Ingrese altura: ");
		this.altura = sc.nextDouble();

	}

}
