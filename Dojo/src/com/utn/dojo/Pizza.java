package com.utn.dojo;

public class Pizza {

	private String nombre, ingrediente1, ingrediente2, ingrediente3, ingrediente4;
	int tiempoDeCoccion;

	public void mostrarMenu() {
		System.out.println("1-Pizza Grande de muzzarela.");
		System.out.println("2-Pizza doble queso con jamon.");
		System.out.println("3-Pizza vagetariana.");
		System.out.println("4-Salir.");
	}

	public Pizza(String nombre, String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4,
			int tiempoCoccion) {

		this.nombre = nombre;
		this.ingrediente1 = ingrediente1;
		this.ingrediente2 = ingrediente2;
		this.ingrediente3 = ingrediente3;
		this.ingrediente4 = ingrediente4;
		this.tiempoDeCoccion = tiempoCoccion;
	}

	public Pizza() {

		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIngrediente1() {
		return ingrediente1;
	}

	public void setIngrediente1(String ingrediente1) {
		this.ingrediente1 = ingrediente1;
	}

	public String getIngrediente2() {
		return ingrediente2;
	}

	public void setIngrediente2(String ingrediente2) {
		this.ingrediente2 = ingrediente2;
	}

	public String getIngrediente3() {
		return ingrediente3;
	}

	public void setIngrediente3(String ingrediente3) {
		this.ingrediente3 = ingrediente3;
	}

	public String getIngrediente4() {
		return ingrediente4;
	}

	public void setIngrediente4(String ingrediente4) {
		this.ingrediente4 = ingrediente4;
	}

	public int getTiempoDeCoccion() {
		return tiempoDeCoccion;
	}

	public void setTiempoDeCoccion(int tiempoDeCoccion) {
		this.tiempoDeCoccion = tiempoDeCoccion;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Ingrediente 1=" + ingrediente1 + ", ingrediente 2=" + ingrediente2
				+ ", ingrediente 3=" + ingrediente3 + ", ingrediente 4=" + ingrediente4 + ", Tiempo de coccion="
				+ tiempoDeCoccion;
	}

}
