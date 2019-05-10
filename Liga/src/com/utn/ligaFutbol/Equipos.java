package com.utn.ligaFutbol;

public enum Equipos {
	BARCELONA("Barcelona", 1), VALENCIA("Valencia", 4), REAL_MADRID("Real Madrid", 2), PSG("Psg", 3);

	private String nombre_club;
	private int puesto;

	private Equipos(String nombre, int posicion) {
		this.nombre_club = nombre;
		this.puesto = posicion;
	}

	public String getNombre_club() {
		return nombre_club;
	}

	public int getPuesto() {
		return puesto;
	}

}
