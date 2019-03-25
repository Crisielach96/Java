package utn.com.modelo;

public class Bebida extends Producto {

	private String nombre;
	private double litros;
	private int precio;
	
	
	
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;

	}
	public Bebida(String nombre, double litros, int precio) {
		super(nombre, precio);
		this.litros = litros;
		
	}
	@Override
	public String toString() {
		return "Nombre: " + super.getNombre() + " /// Litros: " + this.litros + " /// Precio: $" + super.getPrecio();
		
	}
	
	
}
