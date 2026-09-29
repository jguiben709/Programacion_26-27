package tema1;

public class EjemploConstantes {

    //Una constante, no cambia en todo el main su valor
    public static final double IVA_GENERAL = 0.21;
    public static final int NUM_INTENTOS = 5;

    public static void main(String[] args) {
        
        double precio = 125.99;
        double precioConIVA = 0.0;

        precioConIVA = precio + (precio * IVA_GENERAL);
        IO.println(precioConIVA);

        

    }
    
}
