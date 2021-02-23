package T92;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce una cadena");
		String cadena = sc.next();
		System.out.println("introduce un caracter");
		String a = sc.next();
		char h = a.charAt(0);
		
		if(en(h, cadena)) {
			System.out.println("Contiene la letra");
		} else {
			System.out.println("No contiene la letra");
		}
	}
	
	static Boolean en(char c, String cadena) {
		ArrayList<Character> palabra = new ArrayList<>();
		for (int i = 0; i < cadena.length(); i++) {
			palabra.add(cadena.charAt(i));
		}
		for (Character s : palabra) {
			if (c == s) {
				return true;
			}
		}
		return false;
	}
}
