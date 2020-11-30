package T045;

public class Oraculo {
	
	int a1;
	static int e1;
	
	private static void estatico1() {
		estatico2();
		a1 = 0; //Error tiene que ser estatico
		e1 = 1;
	}

	private static void estatico2() {
		metodo1(); //Error, tiene que ser estatico
	}

	private void metodo1() {
		metodo2();
	}

	private void metodo2() {
		a1 = 0;
		e1= 0;
	}
	
	// No porque son privados
	//No se puede.
	//No y Si.
}
