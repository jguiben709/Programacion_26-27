package tema2.bucles;

public class EjemploForDentroFor {
    static void main() {
        /*
        Dime cuántos números primos hay entre el 1 y el 100
         */
        boolean esPrimo;
        int numPrimos=0;

        for(int contador=1; contador <= 100; contador++) {
            esPrimo = true;
            for(int i=2; i < contador; i++) {
                IO.println(contador + " % " + i);
                if (contador % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                numPrimos++;
                IO.println("El número " + contador + " es primo");
            } else {
                IO.println("El número " + contador + " NO es primo");
            }
        }

        IO.println("El número de primos entre 1 y 100 es: " + numPrimos);




    }
}
