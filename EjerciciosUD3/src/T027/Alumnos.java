package T027;


//Creamos la clase alumno
public class Alumnos {
	String Alias;
	String Nombre;
	String ape1;
	String ape2;
	int anionac;
	
	
	public Alumnos(String Alias,String Nombre, String ape1, String ape2, int anionac) {
		this.Alias = Alias;
		this.Nombre = Nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.anionac = controlAnionac(anionac);
	}


	@Override
	public String toString() {
		return "Alumnos [Alias=" + Alias + ", Nombre=" + Nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + ", anionac="
				+ anionac + "]";
	}

	private int controlAnionac(int anioNac){
		if (anioNac >= 1900 && anioNac <= 2020) {
			return anioNac;
		} else {
			return 1900;
		}
	}
}
