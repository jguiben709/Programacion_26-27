package tema2.bucles;

public class EjemploWhile3 {
    public static void main(String[] args) {
        
        //Pinta los números pares del -20 al 20
        int numero = -20;
        while (numero <= 20) {
            if (numero % 2 == 0) {
                IO.println(numero);
            }
            numero += 1;
        }

        /*
        numero = 20;
        while (numero >= -20) {
            IO.println(numero);
            numero = numero - 2;
        }
        */

    }
}
