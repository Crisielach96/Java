package com.utn.clase05_intermedio;

public class SerieNumericaDeDosEnDos implements ISeriesNumericas {

	int iniciar;
	int valor;
	int anterior;

	public SerieNumericaDeDosEnDos() {
		valor = 0;
		iniciar = 0;
	}

	@Override
	public int getSiguiente() {
		anterior=valor;
		return valor += 2;
	}

	@Override
	public void reiniciar() {
		valor = iniciar;
		anterior=valor;

	}

	@Override
	public void setComenzar(int x) {
		iniciar = x;
		valor = x;
		anterior=x-2;
	}
	
	int getAnterior() {
		return anterior;
	}

}
