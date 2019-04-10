package com.utn.JavaParcialInicial;

public class Helado {

	private String tipo, sabor1, sabor2, sabor3, sabor4, sabor5, opcional;

	public Helado() {
		this.tipo = "";
		this.sabor1 = "";
		this.sabor2 = "";
		this.sabor3 = "";
		this.sabor4 = "";
		this.sabor5 = "";
		this.opcional = "";

	}

	public Helado(String tipo, String sabor1, String sabor2, String sabor3, String sabor4, String sabor5,
			String opcional) {
		this.tipo = tipo;
		this.sabor1 = sabor1;
		this.sabor2 = sabor2;
		this.sabor3 = sabor3;
		this.sabor4 = sabor4;
		this.sabor5 = sabor5;
		this.opcional = opcional;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSabor1() {
		return sabor1;
	}

	public void setSabor1(String sabor1) {
		this.sabor1 = sabor1;
	}

	public String getSabor2() {
		return sabor2;
	}

	public void setSabor2(String sabor2) {
		this.sabor2 = sabor2;
	}

	public String getSabor3() {
		return sabor3;
	}

	public void setSabor3(String sabor3) {
		this.sabor3 = sabor3;
	}

	public String getSabor4() {
		return sabor4;
	}

	public void setSabor4(String sabor4) {
		this.sabor4 = sabor4;
	}

	public String getSabor5() {
		return sabor5;
	}

	public void setSabor5(String sabor5) {
		this.sabor5 = sabor5;
	}

	public String getOpcional() {
		return opcional;
	}

	public void setOpcional(String opcional) {
		this.opcional = opcional;
	}

	@Override
	public String toString() {
		return "Tipo=" + tipo + ", Sabor1=" + sabor1 + ", Sabor2=" + sabor2 + ", Sabor3=" + sabor3 + ", Sabor4="
				+ sabor4 + ", Opcional=" + opcional;
	}

}
