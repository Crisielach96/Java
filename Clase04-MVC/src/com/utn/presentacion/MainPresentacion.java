package com.utn.presentacion;

import com.utn.controlador.Cliente_controler;
import com.utn.modelo.Cliente;
import com.utn.vista.Clienteview;

public class MainPresentacion {

	public static void main(String[] args) {

		Clienteview vista = new Clienteview();
		Cliente modelo = llenarDatos();
		
		Cliente_controler controller = new Cliente_controler(modelo, vista);
		
		controller.actualizarVista();
		
		controller.setNombre("Damian");
		controller.actualizarVista();
		
	}

	private static Cliente llenarDatos() {
		Cliente cliente1 = new Cliente();
		cliente1.setApellido("Sielach");
		cliente1.setNombre("Cristian");
		cliente1.setDni(40080375);
		cliente1.setId(0001);

		return cliente1;
	}

}
