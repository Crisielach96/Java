package com.utn.clase04_enumerados;

import java.security.cert.PolicyQualifierInfo;

public class MainClase04 {

	public static void main(String[] args) {
		
		Posicion delantero = Posicion.DELANTERO;
		
		delantero.name();
		
		System.out.println(delantero.ordinal());
		

	}

}
