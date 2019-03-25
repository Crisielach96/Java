package utn.com.modelo;

public class Alimentos {

	private String nombre;
	private int precio;
	private String unidadDeVenta;
	@Override
	public String toString() {
		return "Nombre: " + nombre + " /// Precio= " + "$" + precio + " /// Unidad De Venta = " + unidadDeVenta;
	}
	public Alimentos(String nombre, int precio, String unidadDeVenta) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.unidadDeVenta = unidadDeVenta;
	
    }
	public String getUnidadDeVenta() {
		return unidadDeVenta;
	}
	public void setUnidadDeVenta(String unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}
	
	
	
	
}
