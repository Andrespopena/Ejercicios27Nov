package T108y109;

public class test {
	static char[] vocales = new char[] {'a','e','i','o','u'};
	public static void main(String[] args) {
		rotarderecha(vocales, 3);
		toString(vocales);
	}
	
	static void rotarderecha(char[] cadena, int i) {
		char aux;
		for (int j = 0; j<=i; j++) {
			aux = cadena[j];
			for (int j2 = cadena.length; j2>0; j2--) {
				cadena[j2] = cadena[j2-1];
			}
			cadena[0] = aux;
		}
	}
	
	private static String toString(char[] cadena) {
		String palabra ="{" ;
		for (int i = 0; i<cadena.length ; i++) {
			palabra +="'"+cadena[i]+"'";
		}
		palabra += "}";
		return palabra;
	}
}
