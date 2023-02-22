package taller3.televisores;

public class TV {
	Marca marca;
	int canal;
	int precio;
	boolean estado;
	int volumen;
	Control control;
	
	public void TVConstructor(Marca Nmarca, boolean EoN) {
		marca = Nmarca;
		estado = EoN;
	}
	
	public Marca getmarca() {
		return marca;
	}
	
	public void setmarca(Marca marca) {
		this.marca = marca;
	}
	
	public Control getcontrol() {
		return control;
	}
	
	public void setcontrol(Control control) {
		this.control = control;
	}
	
	public int getprecio() {
		return precio;
	}
	
	public void setprecio(int precio) {
		this.precio = precio;
	}
	
	public int getvolumen() {
		return marca;
	}
	
	public void setvolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public int getcanal() {
		return marca;
	}
	
	public void setcanal(int canal) {
		this.canal = canal;
	}
}