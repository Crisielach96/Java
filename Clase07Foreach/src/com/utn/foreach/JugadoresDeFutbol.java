package com.utn.foreach;

import javax.swing.JOptionPane;

public class JugadoresDeFutbol {

	private String nombre;
	private int edad;
	private int categoria;

	public JugadoresDeFutbol() {
	}

	public JugadoresDeFutbol(String nombre, int edad, int categoria) {
		this.nombre = nombre;
		this.edad = edad;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public void SolicitarDatos() {
		int edadA;
		int categoriaA;
		boolean flag = false;

		this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador: ");
		do {
			if (flag) {
				edadA = Integer.parseInt(JOptionPane.showInputDialog("Error - Rengresar edad: "));
			} else {
				edadA = Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad: "));
				flag = true;
			}
		} while (edadA < 18);
		this.edad = edadA;
		flag = false;
		do {
			if (flag) {
				categoriaA = Integer.parseInt(JOptionPane.showInputDialog("Error - Reingresar categoria: "));
			} else {
				categoriaA = Integer.parseInt(JOptionPane.showInputDialog("Ingresar categoria: "));
				flag = true;
			}

		} while (categoriaA < 1 || categoriaA > 3);
		this.categoria = categoriaA;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Edad=" + edad + ", Categoria=" + categoria;
	}
	

}
