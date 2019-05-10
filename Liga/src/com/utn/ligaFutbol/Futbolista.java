package com.utn.ligaFutbol;

public class Futbolista {

	public String nombre;
	public Equipos equipo;
	public int numeroRemera;
	public Posicion posicion;

	public Futbolista() {
		super();
	}

	public Futbolista(String nombre, Equipos equipo, int numeroRemera, Posicion posicion) {
		super();
		this.nombre = nombre;
		this.equipo = equipo;
		this.numeroRemera = numeroRemera;
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Nombre= " + nombre + "\nEquipo= " + equipo.getNombre_club() + "\nNumero de remera= " + numeroRemera + "\nposicion= "
				+ posicion + "\n";
	}

}
