package com.utn.controlador;

import com.utn.modelo.persona;

public class PersonaControlador {

	public void creoPersona(String nombre,String apellido,int edad) {
	
	
	persona p1 = new persona();
		p1.nombre = nombre;
		p1.apellido = apellido;
		p1.edad = edad;
		
		System.out.println("imprimo la variable p1 ");
		System.out.println(p1);
		System.out.println("imprimo por pantalla el objeto p1");
		System.out.println(p1.nombre);
		System.out.println(p1.apellido);
		System.out.println(p1.edad);
		System.out.println(formatresultado(p1.nombre,p1.apellido,p1.edad));
	persona p3 = new persona();
	p3.nombre = "Gabriel";
	p3.apellido = "Farji";
	p3.edad =18;
	
	System.out.println("imprimo por pantalla el objeto p3");
	System.out.println(p3);
	System.out.println(p3.nombre);
	System.out.println(p3.apellido);
	System.out.println(p3.edad);
	System.out.println(formatresultado(p3.nombre,p3.apellido,p3.edad));
	
	
	
}

	public String formatresultado (String nombre, String apellido, int edad) {
		return "La persona se llama: " + nombre + ", el apellido es " + apellido + ", y la edad es " + edad;
		
				
	} 
	






}
