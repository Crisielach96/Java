package com.utn.clase03bis;

public class Passenger {

	private int maletas;
	private int maletasPagas;
	private int totalDeEquipaje;
	private double tarifaPorMaleta;
	private double totalAPagar;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Passenger() {
	}

	public Passenger(int bolsos, String name) {
		this(bolsos > 1 ? 25.0d : 50.0d);
		this.maletas = bolsos;
		totalAPagar = bolsos * tarifaPorMaleta;
		totalDeEquipaje = bolsos;
		this.name = name;

	}

	public Passenger(int maletas) {
		this(maletas > 1 ? 25.0d : 50.0d);
		this.totalDeEquipaje = maletas;
		totalAPagar = totalDeEquipaje * tarifaPorMaleta;
	}

	public Passenger(int maletas, int maletasPagas) {
		this(maletas);
		this.maletasPagas = maletasPagas;
		totalDeEquipaje = maletas + maletasPagas;
		totalAPagar = maletas * tarifaPorMaleta;
	}

	private Passenger(double tarifaPorMaleta) {
		this.tarifaPorMaleta = tarifaPorMaleta;
	}

	public int getMaletas() {
		return maletas;
	}

	public void setMaletas(int maletas) {
		this.maletas = maletas;
	}

	public int getMaletasPagas() {
		return maletasPagas;
	}

	public void setMaletasPagas(int maletasPagas) {
		this.maletasPagas = maletasPagas;
	}

	public int getTotalDeEquipaje() {
		return totalDeEquipaje;
	}

	public void setTotalDeEquipaje(int totalDeEquipaje) {
		this.totalDeEquipaje = totalDeEquipaje;
	}

	public double getTarifaPorMaleta() {
		return tarifaPorMaleta;
	}

	public void setTarifaPorMaleta(double tarifaPorMaleta) {
		this.tarifaPorMaleta = tarifaPorMaleta;
	}

	public double getTotalAPagar() {
		return totalAPagar;
	}

	public void setTotalAPagar(double totalAPagar) {
		this.totalAPagar = totalAPagar;
	}

	public static void mostrarListadoPasajeros(Passenger listaPasajeros[]) {
		int i = 0;
		for (Passenger x : listaPasajeros) {
			System.out.println("Pasagero " + i + " Tarifa por maleta " + x.getTarifaPorMaleta());
			System.out.println("Pasagero " + i + " Total a pagar " + x.getTotalAPagar());
			System.out.println("Pasagero " + i + " Total de maletas que lleva " + x.getTotalDeEquipaje());
			System.out.println();
			i++;
		}

	}
}
