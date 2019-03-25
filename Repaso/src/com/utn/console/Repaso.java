package com.utn.console;

public class Repaso {

	/*
	 * Creo un metodo ( funcion ) El metodo devolvera un String ( cadena de
	 * caracteres) parametro de entrada es un entero en el parametro se declara la
	 * variable que sera utilizada dentro del metodo, es lo que va entre parentesis
	 * EJ: metodo(int variable, String variable2, etc.....)
	 * 
	 */
	public static String calculoEdad(int fechaNacimiento) { // inicio

		// dentro de un metodo me puedo crear variables
		// internas para este metodo

		// Opcion 1 (declarando dos variables int edad y String mensaje
		// int edad = 2018 - fechaNacimiento;
		// String mensaje = "La edad de la persona es: " + edad;
		// return mensaje; //Aqui esta el valor a devolver por el metodo

		// Opcion 2 realizando misma opracion en el return ( separado por terminos)
		return "La edad de la persona es: " + (2018 - fechaNacimiento);
	}// fin

	/*
	 * Creo un metodo de tipo procedimiento recibe como parametro un entero EL
	 * PROCEDIMENTO (void) nunca pero nunca tiene return con un valor excepto el
	 * return; ( vacio)
	 */
	public static void calculoEdadPerruna(int edadHumana) {

		System.out.println("El perro tiene " + (edadHumana * 7));

		return;
		/* <--- ESTO NO SE EJECUTA ---> */}

	/*
	 * Creo una funcion que devuelva distintos resultado dependiendo el parametro de
	 * entrada
	 * 
	 */

	public static void pasaArgentinaAOctavos(String resultadoIcelandNigeria) {

		switch (resultadoIcelandNigeria) {
		case "GANA_ISLANDIA":
			System.out.println("Desempate entre Argentina y Nigeria para ver quien pasa a octavos");
			break;
		case "GANA_NIGERIA":
			System.out.println("Argentina se toma el avion con peru a latinoamerica");
			break;
		case "EMPATE":
			System.out.println("Nigeria queda con el mismo puntaje que argentina y van al repechaje");
			break;
		default:
			System.out.println("Cayo una bomba y destruyo el mundial");
			break;
		}
	}

	public static void resultadoPartidoNigeriaIslandia(int resIslandia, int resNigeria) {

		if (resIslandia > resNigeria) {
			System.out.println("GANO ISLANDIA");
			pasaArgentinaAOctavos("GANA_ISLANDIA");
		} else if (resIslandia < resNigeria) {
			System.out.println("GANO NIGERIA");
			pasaArgentinaAOctavos("GANA_NIGERIA");
		} else if (resIslandia == resNigeria) {
			System.out.println("EMPATE");
			pasaArgentinaAOctavos("EMPATE");
		}
	}

	public static void main(String[] args) {

		// Opcion 1 generando una variable de tipo string para que
		// guarde el resultado del metodo calculoEdad
		System.out.println("=========EJERCICIO 1 CON FUNCIONES ===========");
		int fechaDeNacimientoDeLaPersona = 1980;
		String edadPepito = calculoEdad(fechaDeNacimientoDeLaPersona);
		System.out.println(edadPepito);
		// Opcion 2
		// System.out.println(calculoEdad(1930));
		System.out.println("===================================");
		System.out.println("=========EJERCICIO 2 CON PROCEDIMIENTOS ===========");

		// Ejecuto el metodo de tipo void
		calculoEdadPerruna(10); // este metodo se ejecuta a secas
								// directamente en el metodo
								// que see requiera

		System.out.println("===================================");
		System.out.println("================EJERCICIO 3 ==========");
		int resultadoIslandia = 1;
		int resultadoNigeria = 1;
		resultadoPartidoNigeriaIslandia(resultadoIslandia, resultadoNigeria);

		System.out.println("=========================================");
		// pasaArgentinaAOctavos("lugar erroneo donde se llama a este medoto");
	}

}
