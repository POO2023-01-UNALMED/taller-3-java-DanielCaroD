package taller3.televisores;

public class Control {
	public boolean control;
	TV estado;
	TV canal;
	TV volumen;
	
	public void turnOn(boolean estado) {
		estado = true;
	}
	public void turnOff(boolean estado) {
		estado = false;
	}
	
	public void setestado(TV status) {
		estado = status;
	}
	public TV getnombre() {
		return estado;
	}
	
	public void canalUp(int canal) {
		if(estado == true);
		canal += 1;
	}
	public void canalDown(int canal) {
		canal -= 1;
	}
	
	public void volumenUp(int volumen) {
		volumen += 1;
	}
	public void volumenDown(int volumen) {
		volumen -= 1;
	}
}