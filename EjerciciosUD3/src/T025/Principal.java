package T025;

public class Principal {
	public static void main(String[] args) {
		a();
		d();
	}
	
	private static void a() {
		b(9);
	}
	
	private static void b(int x) {
		x--;
		System.out.println(c(x));
	}
	
	private static int c(int x) {
		x--;
		return x;
	}
	
	private static void d() {
		
	}
	
}
