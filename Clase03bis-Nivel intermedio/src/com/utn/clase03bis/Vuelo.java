package com.utn.clase03bis;

public class Vuelo {

	public int numVuelo;
	public int pasajeros;
	public char claseVuelo;
	public boolean[] asientosDisponibles;

	// Inicializador de Bloque
	// Es un bloque sin nombre
	// Se debe declarar antes de los constructores
	// Sera utilizado por todos lo contructores
	{
		asientosDisponibles = new boolean[150];
		for (int i = 0; i < getAsiento(); i++) {
			asientosDisponibles[i] = true;
		}
	}

	public int getAsiento() {
		return getAsientosDisponibles();
	}

	public int getAsientosDisponibles() {
		return 150;
	}

	public Vuelo() {
	}

	public Vuelo(char claseVuelo) {
		this.claseVuelo = claseVuelo;
	}

	public Vuelo(int numVuelo) {
		super();
		this.numVuelo = numVuelo;
	}

	private boolean AsientoDisponible() {
		return pasajeros < getAsiento();
	}

	private void FaltanAsientos() {
		System.out.println("No hay asientos disponibles.");
	}

	public void AgregarPasajero(Passenger p1) {
		if (AsientoDisponible() == true) {
			pasajeros++;
			System.out.println("Esta arriba de Fligth " + p1.getName());
		} else {
			FaltanAsientos();
		}
	}

}
