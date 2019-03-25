package com.utn.vista;

public class Test {

	public static void main(String[] args) {
	
	boolean usuario = true ; 	
	   String nombreusuario = "alejandro";	
	
	boolean mandoemail= false ;
	
	if(usuario == true ) {
	   System.out.println("el usuario esta registrado ");	
	
    if(nombreusuario =="alejandro");
	   System.out.println("bienvenido" + nombreusuario);
	
	} else {
	   System.out.println("el usuario no registro su nombre");
	
	} else if (mandoemail) {
	   System.out.println("se envio el correo ...");
	
	} else {
	   System.out.println("el usuario no esta registrado");
	}	

	}

   public static boolean comparomayores(int num1 , int num2) {	
   return num1 > num2 ; 
    }
  }