package T028;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca un númmero");
		System.out.println(metodo(sc.nextInt()));
		sc.close();
	}
	
	private static int metodo(int x) {
		if ((x>=0) || (x<0)) {
			return x;
		} else {
			return 0;
		}
	}
}

//T028 siempre va a mostrar el 0 porque nunca va ser mayor igual y menor que 0 a la vez
//T029 Siempre mostrará el numero puesto que siempre va a ser igual menor o igual al cero.