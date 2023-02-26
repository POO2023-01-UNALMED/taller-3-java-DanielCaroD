package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	int numTV;
	
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
		static int Contador = 0;
		
		public numTV() {
			Contador++;
		}
		
		public int getContador() {
			return Contador;
		}
	}
	
	public void turnOn(boolean estado) {
		this.estado = true;
	}
	public void turnOff(boolean estado) {
		this.estado = false;
	}
	
	public void canalUp(int canal) {
		if (estado == true && canal >= 1 && canal <120) {
			this.canal += 1;
		}
	}
	
	public void canalDown(int canal) {
		if (estado == true && canal > 1 && canal <= 120) {
			this.canal -= 1;
		}
	}
	
	public void volumenUp(int volumen) {
		if (estado == true && volumen >= 0 && volumen < 7) {
					this.volumen += 1;
		}
	}
	
	public void volumenDown(int volumen) {
		if (estado == true && volumen > 0 && volumen <= 7) {
					this.volumen -= 1;
		}
	}
}