package com.utn.clase03bis;

public class MainClase03bis {

	public static void main(String[] args) {

		VuelodeCarga vueloCarga = new VuelodeCarga();
		Passenger pasajero = new Passenger(1, "Alex");
		Passenger pasajero1 = new Passenger(2, "Cristian");
		Passenger pasajero2 = new Passenger(3, "Kratos");

		vueloCarga.AgregarPaquete(10000, 10000, 10000);
		vueloCarga.AgregarPaquete(10, 10, 10);

		Vuelo[] vuelo = new Vuelo[4];

		vuelo[0] = new Vuelo();
		vuelo[1] = new VuelodeCarga();
		vuelo[2] = new Vuelo();
		vuelo[3] = new VuelodeCarga();

		System.out.println(vuelo[2].getAsiento());
		System.out.println(vuelo[3].getAsiento());
		vuelo[2].AgregarPasajero(pasajero);
		vuelo[2].AgregarPasajero(pasajero1);
		vuelo[2].AgregarPasajero(pasajero2);

		Object[] o1 = new Object[3];

		o1[0] = new Vuelo();
		o1[1] = new Passenger();
		o1[2] = new VuelodeCarga();
	}

}
