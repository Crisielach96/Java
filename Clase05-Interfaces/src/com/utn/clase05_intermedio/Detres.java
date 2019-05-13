package com.utn.clase05_intermedio;

public class Detres implements ISeriesNumericas {

	int iniciar;
	int valor;
	int anterior;

	public Detres() {
		valor = 0;
		iniciar = 0;
	}

	@Override
	public int getSiguiente() {
		anterior = valor;
		return valor += 3;
	}

	@Override
	public void reiniciar() {
		valor = iniciar;
		anterior = valor;

	}

	@Override
	public void setComenzar(int x) {
		iniciar = x;
		valor = x;
		anterior = x - 3;

	}

	int getAnterior() {
		return anterior;
	}

}
