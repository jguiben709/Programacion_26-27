package tema1;

public class EjemploConversionTipos {
    public static void main(String[] args) {
        
        long numeroGrande;
        int numeroPequenio = 1567;

        numeroGrande = numeroPequenio;

        IO.println("Número grande: " + numeroGrande);

        // AL REVÉS -----------------------

        numeroGrande =  4654L;
        numeroPequenio = (int) numeroGrande; //Casting

        IO.println("Número pequeño: " + numeroPequenio);



    }
}
