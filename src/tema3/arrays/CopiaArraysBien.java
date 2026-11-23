package tema3.arrays;

import java.util.Arrays;

public class CopiaArraysBien {
    static void main() {

        int[] numeros = { 1, 2, 3, 5, 8 };
        int[] copiado = new int[numeros.length]; //Crea 5 posiciones a 0
        int[] copiado2 = new int[numeros.length];

        //No podemos hacer  -->  copiado = numeros;

        //Copiar a mano
        for(int i=0; i < copiado.length; i++) {
            copiado[i] = numeros[i]; //copiado[0] = numeros[0],copiado[1] = numeros[1],...
        }

        //Pintar array
        IO.print("[");
        for(int i=0; i < copiado.length; i++) {
            if (i == copiado.length-1) {
                IO.print(copiado[i]);
            } else {
                IO.print(copiado[i] + ", ");
            }
        }
        IO.println("]");

        //Copiar arrays usando la clase Arrays.
        copiado2 = Arrays.copyOf(copiado, copiado.length);

        //Pintar un array: lo convertimos a String y lo pintamos
        IO.println(Arrays.toString(copiado2));





    }
}
