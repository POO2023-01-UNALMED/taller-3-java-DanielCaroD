package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Marca getMarca() {
		return marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	public int getPrecio() {
		return precio;
	}
	public void setVolumen(int volumen) {
		if (volumen >= 0 && volumen <= 7) {
				this.volumen = volumen;
			}
		}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setCanal(int canal) {
		if (canal >= 1 && canal <=120) {
			this.canal = canal;
		}
	}
	
	public int getCanal() {
		return canal;
	}
	class numTV {
		}
	
	public static void setNumTV(int num) {
		numTV = num;
	}
	
	public static Object getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	
	public void canalUp() {
		if (this.estado == true && this.canal >= 1 && this.canal <120) {
			this.canal += 1;
		}
	}
	
	public void canalDown() {
		if (this.estado == true && this.canal > 1 && this.canal <= 120) {
			this.canal -= 1;
		}
	}
	
	public void volumenUp() {
		if (this.estado == true && this.volumen >= 0 && this.volumen < 7) {
					this.volumen += 1;
		}
	}
	
	public void volumenDown() {
		if (this.estado == true && this.volumen > 0 && this.volumen <= 7) {
					this.volumen -= 1;
		}
	}
}