package com.utn.JAVA_SE8;

public class ListaMultimedia extends Multimedia {

	private int contador;
	private Multimedia lista[];

	public ListaMultimedia(int cantDeObjMultimedia) {
		lista = new Multimedia[cantDeObjMultimedia];
		contador = 0;
	}

	int size() {
		return contador;
	}

	boolean add(Multimedia m) {
		boolean retorno = false;

		if (contador < lista.length) {
			lista[contador] = m;
			contador++;
		}
		return retorno;
	}

	Multimedia get(int position) {
		if (position > contador) {
			throw new IndexOutOfBoundsException();
		}
		return lista[position];
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < contador; i++) {
			s += lista[i].toString() + "\n";
		}
		return s;
	}

}
