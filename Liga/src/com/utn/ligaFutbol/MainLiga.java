package com.utn.ligaFutbol;

public class MainLiga {

	public static void main(String[] args) {

		Futbolista bale = new Futbolista("Garet Bale", Equipos.REAL_MADRID, 20, Posicion.DELANTERO);
		Futbolista messi = new Futbolista("Lionel D10S Messi", Equipos.BARCELONA, 10, Posicion.DELANTERO);

		System.out.println(messi.toString());
		System.out.println(bale.toString());

	}

}
