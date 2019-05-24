package com.utn.modelo.conexion;

/**
 * PATRON VALUE OBJECT - DTO
 * 
 * Anteriormente conocido como DTO(Data Transfer Object) en el vamos a
 * representar las entidades (Tablas dentro de la DB)
 * 
 */

public class PersonaVO {

	private int idP, edadP;
	private String nombreP, profesionP;
	private int telefonoP;

	public int getIdP() {
		return idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	public int getEdadP() {
		return edadP;
	}

	public void setEdadP(int edadP) {
		this.edadP = edadP;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public String getProfesionP() {
		return profesionP;
	}

	public void setProfesionP(String profesionP) {
		this.profesionP = profesionP;
	}

	public int getTelefonoP() {
		return telefonoP;
	}

	public void setTelefonoP(int telefonoP) {
		this.telefonoP = telefonoP;
	}

	@Override
	public String toString() {
		return "ID= " + idP + ", Edad= " + edadP + ", Nombre= " + nombreP + ", Profesion= " + profesionP
				+ ", Telefono= " + telefonoP;
	}

}
