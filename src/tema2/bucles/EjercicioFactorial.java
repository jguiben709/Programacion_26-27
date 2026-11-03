package tema2.bucles;

public class EjercicioFactorial {
    static void main() {
        int numero = 100;
        double factorial = 1; //Al multiplicar en un acumulador iniciamos a 1, no a 0
        for(int i=1; i <= numero; i++) {
            factorial = factorial * i;
            IO.println("Factorial: " + factorial);
            IO.println("I: " + i);
        }

        IO.println("El factorial de " + numero + " es " + factorial);


    }

}
