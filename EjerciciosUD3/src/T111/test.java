package T111;

public class test {
	static char[] vocales = new char[] {'a','e','i','o','u'};
	
	public static void main(String[] args) {
		System.out.println(desplazarizquierda(vocales, 3, '-'));
	}
	
	private static String toString(char[] cadena) {
		String palabra ="{" ;
		for (int i = 0; i<cadena.length ; i++) {
			palabra +="'"+cadena[i]+"'";
		}
		palabra += "}";
		return palabra;
	}
	
	private static String desplazarizquierda(char[] cadena, int i, char c) {
		
		for (int j = cadena.length; j>=i; j--) {
			cadena[j-1] = c;
		}
		
		return toString(cadena);
	}
}
