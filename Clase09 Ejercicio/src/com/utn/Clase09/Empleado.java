package com.utn.Clase09;

import java.util.Scanner;

public class Empleado {

	private int sueldoXhora;
	double impuesto, sueldoPorMes,horasTrabajadas;
	private String tipoDeTrabajador;

	public Empleado() {
		this.horasTrabajadas = 0;
		this.sueldoXhora = 0;
		this.impuesto = 0;
		this.tipoDeTrabajador = "";
		this.sueldoPorMes = 0;
	}

	public Empleado(double horasTrabajadas, int sueldoXhora, double impuesto, String tipoDeTrabajador,
			double sueldoPorMes) {
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoXhora = sueldoXhora;
		this.impuesto = impuesto;
		this.tipoDeTrabajador = tipoDeTrabajador;
		this.sueldoPorMes = sueldoPorMes;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getSueldoXhora() {
		return sueldoXhora;
	}

	public void setSueldoXhora(int sueldoXhora) {
		this.sueldoXhora = sueldoXhora;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public String getTipoDeTrabajador() {
		return tipoDeTrabajador;
	}

	public void setTipoDeTrabajador(String tipoDeTrabajador) {
		this.tipoDeTrabajador = tipoDeTrabajador;
	}

	public double getSueldoPorMes() {
		return sueldoPorMes;
	}

	public void setSueldoPorMes(double sueldoPorMes) {
		this.sueldoPorMes = sueldoPorMes;
	}

	@Override
	public String toString() {
		return "Tipo De Trabajador= " + tipoDeTrabajador + ", Horas Trabajadas= " + horasTrabajadas
				+ ", Sueldo por hora= " + sueldoXhora + ", Impuesto= " + impuesto + ", Sueldo por mes= " + sueldoPorMes;
	}
	
	public boolean validarPositivo(double num)
	{
		boolean retorno=false;
		
		if(num>0)
		{
			retorno=true;
		}
		
		return retorno;
	}

	public void solicitarDatos() {

		Scanner sc = new Scanner(System.in);
		int opcion = 0,flag=0;
		double sueldoXhoraAux,horasTrabajadasAux, horasAlMes = 0;

		do
		{
			System.out.println("1 - Administrativo");
			System.out.println("2 - inspector");
			System.out.println();
			System.out.print("Ingrese opcion: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				this.setTipoDeTrabajador("Administrativo");
				break;

			case 2:
				this.setTipoDeTrabajador("Inspector");
				break;

			default:
				break;
			}
		}while(opcion != 1 && opcion != 2);
		
		do
		{
		System.out.print("Ingrese sueldo por hora: ");
		horasTrabajadasAux=sc.nextDouble();
		
		if(flag==1)
		{
			System.out.println("Ingrese de nuevo: ");
		}
		else
		{
			this.setHorasTrabajadas(horasTrabajadasAux);
		}
		flag=1;
		}while(validarPositivo(horasTrabajadasAux));
		
		
		System.out.print("Ingrese Horas trabajadas: ");
		this.setHorasTrabajadas(sc.nextInt());
		System.out.println();

		horasAlMes = this.getHorasTrabajadas() * 20;
		this.setSueldoPorMes(horasAlMes * this.getSueldoXhora());

		if (this.getSueldoPorMes() > 99999 && this.getSueldoPorMes() <= 150000) {
			this.setImpuesto(this.getSueldoPorMes() * 0.15);
		}

		else if (this.getSueldoPorMes() > 150000) {
			this.setImpuesto(this.getSueldoPorMes() * 0.20);
		}
	}

}
