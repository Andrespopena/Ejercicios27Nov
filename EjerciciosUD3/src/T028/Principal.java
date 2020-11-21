package T028;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca un númmero");
		System.out.println(metodo(sc.nextInt()));
	}
	
	private static String metodo(int x) {
		if (x >= 0) {
			return "("+x+">=0)";
		} else {
			return "("+x+"<0)";
		}
	}
}
