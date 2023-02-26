package taller3.televisores;

public class Control {
	TV tv;
	
	public void turnOn() {
		this.tv.estado = true;
	}
	
	public void turnOff() {
		this.tv.estado = false;
	}
	
	public void canalUp() {
		if (this.tv.estado == true && this.tv.canal >= 1 && this.tv.canal <120) {
			this.tv.canal += 1; }
	}
	
	public void canalDown() {
		if (this.tv.estado == true && this.tv.canal > 1 && this.tv.canal <=120) {
			this.tv.canal -= 1; }
	}
	
	public void volumenUp() {
		if (this.tv.estado == true && this.tv.volumen >= 0 && this.tv.volumen < 7) {
					this.tv.volumen += 1;
		}
	}
	
	public void volumenDown() {
		if (this.tv.estado == true && this.tv.volumen > 0 && this.tv.volumen <= 7) {
					this.tv.volumen -= 1;
		}
	}
	
	public void setCanal(int canal) {
		if (canal >= 1 && canal <=120) {
			this.tv.canal = canal;
		}
	}
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public TV getTv() {
		return tv;
	}
}