package tema3.arrays;

import java.util.Arrays;

public class OrdenarArrays {
    static int generarNumero(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    static void main() {
        int[] numeros = new int[100];

        for(int i=0; i < numeros.length; i++) {
            numeros[i] = generarNumero(1, 1000);
        }

        IO.println(Arrays.toString(numeros));

        //Ordenar un arrays
        Arrays.sort(numeros);

        IO.println(Arrays.toString(numeros));

    }
}
