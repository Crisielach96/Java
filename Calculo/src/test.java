
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumoDosNumeros(2,2);
	    
		DatosP("Alejandro",23,"Lanus");
	    
		int resultado= RestoDosNumeros(4,2);
	    
		System.out.println(resultado);
	
}

	public static void SumoDosNumeros(int num1,int num2) {
	
	int resultado = num1 + num2;
	
	System.out.println(resultado);		
		
}
	
	public static void DatosP (String nombre, int edad , String barrio) {

	String DatosP = "nombre:"+ nombre + "edad:" + edad + "barrio donde vive:" + barrio;
 
	System.out.println(DatosP);
					
}		

 public static int RestoDosNumeros (int num1, int num2) {

 return num1 - num2;  

}

}


