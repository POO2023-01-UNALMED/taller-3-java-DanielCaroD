package taller3.televisores;

public class Marca {
	String nombre;
	
	Marca(String marca) {
	nombre = marca;
	}
	
	public void setnombre(String marca) {
		nombre = marca;
	}
	
	public String getnombre() {
		return nombre;
	}
}