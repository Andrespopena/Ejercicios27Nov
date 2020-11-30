package Tanque;

public class Principal
{
    public static void main(String[] args) {
        Tanque t1 = new Tanque();
        Tanque t2 = new Tanque();        
        System.out.println(t1.equals(t2));

        /* t1.girar(2);                 // Giro al SUR
        System.out.println(t1);
        t1.avanzar(2);
        System.out.println(t1);
        t1.girar();                 // Giro final al OESTE        
        */
    }
}