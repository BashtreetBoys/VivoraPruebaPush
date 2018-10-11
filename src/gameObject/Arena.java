package gameObject;

import java.util.ArrayList;

public class Arena {
	private int tamaño;
	private ArrayList<Vibora> viboras;
	private ArrayList<Obstaculo> obstaculos;
	private Fruta frutaActual;
	
	void agregarVibora(Vibora v) {
		viboras.add(v);
		int n;
		 n = viboras.indexOf(v);
		
		switch(n) {
		case 0:
			v.setVibora(5, 95, 2);
		break;
		case 1:
			v.setVibora(50, 95, 3);
		break;
		case 2:
			v.setVibora(95, 95, 4);
		break;
		case 3:
			v.setVibora(95, 50, 4);
		break;
		case 4:
			v.setVibora(95, 5, 4);
		break;
		case 5:
			v.setVibora(50, 5, 1);
		break;
		case 6:
			v.setVibora(5, 5, 2);
		break;
		case 7:
			v.setVibora(5, 50, 2);
		break;
		}
				
	}
}
