package com.utn.ejercicio.persona;

public class Persona {

	static final char HOMBRE = 'H';
	static final char MUJER = 'M';
	static final int POCO_PESO = 1;
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

	int calularIMC(float peso, float altura) {
		double imc = 0;
		int retorno = 0;
		this.peso = peso;
		this.altura = altura;

		imc = peso / (Math.pow(altura, 2));
		if (imc < 20) {
			retorno = FLACO;
		} else if (imc > 19 && imc < 26) {
			retorno = POCO_PESO;
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

}
