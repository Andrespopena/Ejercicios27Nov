package T86;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = sc.next();
		System.out.println("Introduce un caracter");
		String a = sc.next();
		char h = a.charAt(0);
		
		System.out.println(sus2(frase, h));
//		if(esVocal(a.charAt(0))) {
//			System.out.println("Es vocal");
//		} else {
//			System.out.println("No es vocal");
//		}
		
		
		
	}
	
	static String sus2(String f, char t) {
		ArrayList<Character> palabra = new ArrayList<>();
		for (int i = 0; i < f.length(); i++) {
			palabra.add(f.charAt(i));
		}
		
		for (int i = 1; i< palabra.size(); i++) {
			if (palabra.get(i) == palabra.get(0)) {
				palabra.set(i, t);
			}
		}
		
		String palabraCompleta = "";
		for (Character character : palabra) {
			palabraCompleta = palabraCompleta+character;
		}
		
		return palabraCompleta;
	}
	
	static boolean esVocal(char c) {
		char[] vocales = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		for (char d : vocales) {
			if ( c == d) {
				return true;
			}
		}
		return false;
	}
}
