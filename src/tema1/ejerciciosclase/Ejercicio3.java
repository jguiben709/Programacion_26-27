package tema1.ejerciciosclase;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        /*
            Tienes dos variables numeroA y numeroB, y debes intercambiar sus valores
        */

        int numeroA = 15, numeroB = 55, aux;

        aux = numeroA;
        numeroA = numeroB;
        numeroB = aux;

        IO.println("NumeroA " + numeroA + " NumeroB " + numeroB);



            
    }
}
