package com.utn.clase09;

import java.util.Calendar;

public class Fecha {

	private int dia, mes, anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;

		if (!FechaCorrecta()) {
			Calendar fechaDelSistema = Calendar.getInstance();
			setDia(fechaDelSistema.get(Calendar.DAY_OF_MONTH));
			setMes(fechaDelSistema.get(Calendar.MONTH));
			setAnio(fechaDelSistema.get(Calendar.YEAR));
			this.mes++;
		}
	}

	public void asignarFecha() {
		Calendar fechaDelSistema = Calendar.getInstance();
		setDia(fechaDelSistema.get(Calendar.DAY_OF_MONTH));
		setMes(fechaDelSistema.get(Calendar.MONTH));
		this.mes++;
		setAnio(fechaDelSistema.get(Calendar.YEAR));
	}

	public void asignarFecha(int d) {
		Calendar fechaDelSistema = Calendar.getInstance();
		setDia(d);
		setMes(fechaDelSistema.get(Calendar.MONTH));
		this.mes++;
		setAnio(fechaDelSistema.get(Calendar.YEAR));
	}

	public void asignarFecha(int d, int m) {
		Calendar fechaDelSistema = Calendar.getInstance();
		setDia(d);
		setMes(m);
		setAnio(fechaDelSistema.get(Calendar.YEAR));
	}

	public void asignarFecha(int d, int m, int a) {
		setDia(d);
		setMes(m);
		setAnio(a);
	}

	boolean esBisiesto() {
		return ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0));
	}

	private boolean FechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		anioCorrecto = (anio > 0);
		mesCorrecto = (mes >= 1 && mes <= 12);

		switch (mes) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = (dia >= 1 && dia <= 29);
			} else {
				diaCorrecto = (dia >= 1 && dia <= 28);
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = (dia >= 1 && dia <= 30);
		default:
			diaCorrecto = (dia >= 1 && dia <= 31);
			break;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anio;
	}

}
