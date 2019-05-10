package com.utn.controlador;

import com.utn.modelo.Cliente;
import com.utn.vista.Clienteview;

public class Cliente_controler {

	private Cliente modelo;
	private Clienteview vista;

	public Cliente_controler(Cliente model, Clienteview view) {
		this.modelo = model;
		this.vista = view;
	}

	public int getId() {
		return modelo.getId();
	}

	public void setId(int id) {
		this.modelo.setId(id);
	}

	public int getDni() {
		return modelo.getDni();
	}

	public void setDni(int dni) {
		this.modelo.setDni(dni);
		;
	}

	public String getNombre() {
		return modelo.getNombre();
	}

	public void setNombre(String nombre) {
		this.modelo.setNombre(nombre);
	}

	public String getApellido() {
		return modelo.getApellido();
	}

	public void setApellido(String apellido) {
		this.modelo.setApellido(apellido);
	}

	public void actualizarVista() {
		vista.imprimirDatos(modelo.getId(), modelo.getNombre(), modelo.getApellido(), modelo.getDni());
	}
}
