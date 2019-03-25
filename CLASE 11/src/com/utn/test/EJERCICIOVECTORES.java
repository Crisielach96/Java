package com.utn.test; 						

public class EJERCICIOVECTORES {

	public static void main(String[] args) {
	
int contC= 0,contP=0;
int contI= 0;
int sumI= 0;
int sumP= 0;
int promI = 0;
int promP = 0;

	
	int vec[] = new int [100]; 
		
	for (int i = 0; i < vec.length; i++) {
		vec[i] = (int) (Math.random() * 100);
			
	System.out.println(vec[i]);
	if (vec[i] ==0) {
		contC++;
	}
		
	if (vec[i]%2 ==0) {
		contP++;
		sumP += vec[i];
	} else { contI ++;
			sumI += vec[i];
		
		
	}
}
	if(contP != 0) {
		System.out.println("La cantidad de numeros impares es:" + contI + " y su promedio es " + sumI/contI);
		if(contP != 0) {
			System.out.println("La cantidad de numeros pares es:" + contP + " y su promedio es " + sumP/contP);
	}
	
}

}

}












/* 
1 llenar un vector con 100 valores random 
2 contar cantidad de numeros pares 
3 contar cantidad de numeros impares 
4 calcular el promedio de pares
5 calcular promedio de impares 
6 utilizar for each para mostrar los valores generadores en UNA SOLA linea.
7 contar los numeros "0", PARA ESTE EJERCICIO EL 0 NO TIENE PARIDAD. */

