package com.utn.JAVA_SE8;

public class Pelicula extends Multimedia {

	private String actor, actriz;

	public Pelicula(String titulo, String autor, EFormato formato, double duracion, String actor, String actriz) {
		super(titulo, autor, formato, duracion);

		try {
			if (actor == null && actriz == null) {
				throw new IllegalArgumentException("Error no puede haber dos actores ausentes");
			}
			this.actor = actor;
			this.actriz = actriz;

		} catch (NullPointerException e) {
			System.out.println("Error no puede haber dos actores ausentes");
		}
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActriz() {
		return actriz;
	}

	public void setActriz(String actriz) {
		this.actriz = actriz;
	}

	@Override
	public String toString() {
		return super.toString() + ", Actor= " + actor + ", Actriz= " + actriz;
	}

}
