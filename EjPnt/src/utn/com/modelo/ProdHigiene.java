package utn.com.modelo;

public class ProdHigiene {

	private String nombre;
	private String contenido;
	private int precio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public ProdHigiene(String nombre, String contenido, int precio) {
		super();
		this.nombre = nombre;
		this.contenido = contenido;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Nombre: " + nombre + " /// Contenido= " + contenido + " /// Precio = " + "$" + precio ;
	}
	
	
}
