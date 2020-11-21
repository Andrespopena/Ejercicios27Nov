package T027;

public class Instituto {
	public static void main(String[] args) {
		//Creamos el alumno1 y el alumno2 si pone año menor a 1900 y mayor a 2020 pondrá por defecto 1900
		Alumnos Alumn1 = new Alumnos("Jaime", "Jaime", "Perez", "Garcia", 2000);
		Alumnos Alumn2 = new Alumnos("Pedro", "Pedro", "Suarez", "Zagal", 1800);
		
		//Imprimimos por pantalla los objetos alumno creados
		System.out.println(Alumn1.toString()+" y "+Alumn2.toString());
		
		//Si se cambiara la visibilidad de un contructor de la clase no se podria usar fuera de esa misma clase.
	}
}
