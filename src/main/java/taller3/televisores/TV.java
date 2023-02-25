package taller3.televisores;

public class TV {
	Marca marca;
	public int canal = 1;
	public int precio = 500;
	public boolean estado;
	public int volumen = 1;
	Control control;
	int numTV;
	
	TV(Marca m, boolean oyf) {
		marca = m;
		estado = oyf;
	}
	
	public void setmarca(Marca m) {
		marca = m;
	}
	public Marca getmarca() {
		return marca;
	}
	
	public void setcontrol(Control oyf) {
		control = oyf;
	}
	public Control getcontrol() {
		return control;
	}
	
	public void setprecio (int price) {
		precio = price;
	}
	public int getprecio() {
		return precio;
	}
	
	public void setvolumen(int vol) {
		volumen = vol;
	}
	public int getvolumen() {
		return volumen;
	}
	public void setcanal(int chan) {
		canal = chan;
	}
	public int getcanal() {
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
}