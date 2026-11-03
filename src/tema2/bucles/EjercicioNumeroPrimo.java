package tema2.bucles;

public class EjercicioNumeroPrimo {
    static void main() {

        //Supongo que el número sí es primo, y en bucle busco un divisor
        //Si hay un divisor esPrimo = false
        boolean esPrimo = true;
        int numero = 12; //11,10,....,2

        for(int i=2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
            }
        }

        if (esPrimo) {
            IO.println("El número " + numero + " es primo");
        } else {
            IO.println("El número " + numero + " NO es primo");
        }


    }
}
