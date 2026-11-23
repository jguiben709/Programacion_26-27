package tema3.arrays;

import java.util.Arrays;

public class RellenarArray {
    public static int tirarDado(int numCaras) {
        return (int) (Math.random() * numCaras) + 1;
    }

    static void main() {

        //Rellena un array de 10 elementos con valores aleatorios del 1 al 20
        int[] tiradas = new int[10];
        int[] otro = new int[10];

        for(int i=0; i < tiradas.length; i++) {
            tiradas[i] = tirarDado(20);
        }

        IO.println(Arrays.toString(tiradas));

        //Rellenar un array con el mismo número
        Arrays.fill(tiradas, tirarDado(20));
        Arrays.fill(otro, tirarDado(20));

        IO.println(Arrays.toString(tiradas));
        IO.println(Arrays.toString(otro));

        //Arrays.equals te dice si los valores de dos arrays son iguales
        IO.println("Son iguales? " + Arrays.equals(tiradas,otro));

    }
}
