package com.utn.herencia_bis;

public class Cuadrado extends Figura {

	private double lado;

	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {

		return this.lado * this.lado;
	}

}
