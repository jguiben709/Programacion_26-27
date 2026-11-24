package tema3.arrays;

import java.util.Arrays;

public class Ejercicio3 {
    static void main() {

        //Posición        0  1  2  3  4  5  6  7  8  9
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] posPares = new int[numeros.length];
        int j=0;

        for(int i=0; i < numeros.length; i++) {
            //Si la posición es par (i es par) lo metemos en posPares
            if (i % 2 == 0) {
                posPares[j] = numeros[i];
                j++;
            }
        }

        IO.println(Arrays.toString(posPares));


    }
}
