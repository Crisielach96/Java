
public class Maraton {

	public static void main(String[] args) {
				
		String [] corredores = {"Elena", "Thomas", "Hamilton2", "Suzie", "Phil", "Matt", "Alex"} ;
		int [] tiempos = {341, 273, 378, 329, 445, 402, 388} ;
		
		int masrapido= tiempos[0];
		int porMin = 0;
		
		for (int i = 0; i < tiempos.length; i++ ) {
			if(masrapido < tiempos[i] ) {}
			
			 else {
				masrapido = tiempos[i];
				porMin = i ;}
				
			
			}
			
			

		System.out.println("El corredor mas rápido es " + corredores [porMin]+ " con " + masrapido + " minutos");
		
			
		}

	}


