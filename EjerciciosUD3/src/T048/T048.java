package T048;

import java.util.Random;

public class T048 {
	int id;
	String alias;
	static int cont = 0;
	
	public T048() {
		if (cont <5) {
		Random rdn = new Random();
		id = rdn.nextInt();
		cont++;
		} else {
			System.err.println("Número maximo alcanzado");
		}
	}
}
