package com.utn.herencia_bis;

public class Triangulo extends Figura {

	private double base;
	private double altura;

	public Triangulo(String color, double base, double altura) {
		super(color);
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}

}
