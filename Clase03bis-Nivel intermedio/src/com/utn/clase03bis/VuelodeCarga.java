package com.utn.clase03bis;

public class VuelodeCarga extends Vuelo {

	public int asientos = 12;
	public float espacioDeCarga = 1000;
	public float espacioDeCargaUsado;

	public void AgregarPaquete(float altura, float ancho, float profundidad) {
		double size = altura * ancho * profundidad;

		if (EspacioDeCargaDisponible(size)) {
			espacioDeCargaUsado += size;
			System.out.println("Se agrego el paquete con exito");
		} else {
			FaltaEspacio();
		}
	}

	private boolean EspacioDeCargaDisponible(double tamanio) {
		return espacioDeCargaUsado + tamanio <= espacioDeCarga;
	}

	private void FaltaEspacio() {
		System.out.println("No hay espacio disponible.");
	}

	@Override
	public int getAsiento() {
		return 12;
	}
}
