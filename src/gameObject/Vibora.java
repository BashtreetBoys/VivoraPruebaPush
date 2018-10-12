package gameObject;

public class Vibora {
	private int posX;
	private int posY;
	private int direccion;
	private boolean estado;
	
	public Vibora() {
		this.estado = true;
	}
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void setVibora(int posX, int posY, int direccion) {
		this.posX = posX;
		this.posY = posY;
		this.direccion = direccion;
	}
}
