package T037;

public class T037 {
	int turno = 0;
	
	private void cambiar_turno() {
		if (turno == 0) {
			turno = 1;
		} else {
			turno = 0;
		}
	}
}
