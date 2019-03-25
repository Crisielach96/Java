package utn.com.vista;

import utn.com.modelo.Alimentos;
import utn.com.modelo.Bebida;
import utn.com.modelo.ProdHigiene;

public class Test {
	
	public static void main (String [] args) {
		
		Producto p1 = new Bebida("Coca-Cola Zero" , 1.5, 20);
		System.out.println(p1);
		
		Producto p2 = new Bebida("Coca Cola", 1.5, 18);
		System.out.println(p2);
	
	    Producto p3 = new ProdHigiene(" Shampoo Sedal", "500ml", 19);
	    System.out.println(p3);
	    
	    Producto p4 = new Alimentos ("Frutillas" , 64 ,"Kilo");
	    System.out.println(p4);
	    
	    
	   
	    System.out.println("===========================");
	    
	    
	}
	
	

}
