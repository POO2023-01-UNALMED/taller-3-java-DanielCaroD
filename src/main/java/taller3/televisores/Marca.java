package taller3.televisores;

public class Marca {
	String nombre;
	
	public void NombreMarca(String marca) {
	nombre = marca;
	}
	
	public String getnombre() {
		return nombre;
	}
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
}