package T036;

public class T036 {
	public static void main(String[] args) {
		System.out.println(metodo(2, 6, true));
		System.out.println(metodo(2, 6, false));
	}
	
	private static int metodo(int a, int b, boolean c) {
		if (c) {
			return a;
		} else {
			return b;
		}
	}
	
}
