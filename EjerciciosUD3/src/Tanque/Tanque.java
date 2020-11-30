package Tanque;

/*
Tanque 0.3

La unica forma de que un tanque cambie de direccion sera girando.

Un tanque puede girar en el sentido de las agujas del reloj.
Si el tanque esta en la orientacion NORTE al girar cambiara a 
la direccion ESTE.
NORTE -> ESTE -> SUR -> OESTE -> NORTE

Es posible indicarle al tanque que gire o bien que gire un 
numero de veces (>=1)
girar()      -> 1 giro
girar(n)     -> n giros

Controlar los limites del tablero virtual. 
1) No pueden existir tanques
en posiciones con filas negativas ni columnas negativas.
2) El tablero virtual tiene las dimensiones 4 filas x 5 columnas.
La primera fila es la 0 (idem columna)

Dos tanques son iguales si tienen la misma posicion (fila, columna) y direccion
*/
public class Tanque
{
    private static final String DIRECCIONES = "NESO";
    
    private int fila;       // >=0
    private int columna;    // >=0
    private char direccion; // 'N' {DIRECCIONES}
    
    public Tanque() {
        setFila(0);     // Fila aleatoria PTE
        setColumna(0);  // Columna aleatoria PTE
        setDireccion('N');
    }
    
    public Tanque(int fila, int columna, char direccion) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.direccion = direccion;
	}

	private void setFila(int fila) {
        assert (fila >= 0) : 
            String.format("Error: fila %d no valida (fila>=0)", 
                fila);
        this.fila = fila;
    }
    
    private void setColumna(int columna) {
        assert (columna >= 0) : 
            String.format("Error: columna %d no valida (columna>=0)", 
                columna);
        this.columna = columna;
    }  
    
    private void setDireccion(char direccion) {
        assert (DIRECCIONES.indexOf(direccion) >= 0 ) : 
                String.format("Error: direccion %c no valida (direcciones = %s)", 
                    direccion, DIRECCIONES);
        this.direccion = direccion;
    }

    public void avanzar(int distancia) {
        assert (distancia >= 0):
            String.format("Error: %d ...", distancia);
        if (direccion=='N')
            setFila(fila-distancia);
        else if (direccion=='S')
            setFila(fila+distancia);
        else if (direccion=='E')
            setColumna(columna+distancia);
        else if (direccion=='O')
            setColumna(columna-distancia);
        else    // direccion inesperada
            assert false: String.format("Error: direccion %c no valida (direcciones = %s)", DIRECCIONES);
            
    }
    
    
    public void girar() {
        int i = DIRECCIONES.indexOf(direccion);
        setDireccion(DIRECCIONES.charAt((i+1)%4));
    }
    
    
    /* public boolean equals(Object o) {
        
    } */
    
    public void girar(int n) {
        assert n>=1 : 
            String.format("Error: el numero de giros debe ser >=1 (n=%d)", n);
        for (int i=1; i<=n; i++)
            girar();
    }

    
    public String toString() {
        return String.format("Tanque en (%d,%d) con direccion %c",
                fila, columna, direccion);
    }
}