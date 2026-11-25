package tema3.matrices;

public class Ejercicio1 {

    static void main() {
        //Dada una matriz, di la posición (i, j) del elemento mayor y del menor

        int[][] numeros = {
                { 22, 33, 9, 44, 99 },
                { 41, 51, 78, 12, 7 },
                { 66, 1, 39, 10, 47 }
        };

        int maximo = Integer.MIN_VALUE;
        int max_i=0, max_j=0;
        int minimo = Integer.MAX_VALUE;
        int min_i=0, min_j=0;

        for(int i=0; i < numeros.length; i++) {
            for(int j=0; j < numeros[0].length; j++) {
                //Máximo
                if (numeros[i][j] > maximo) {
                    maximo = numeros[i][j];
                    max_i = i;
                    max_j = j;
                }
                //Mínimo
                if (numeros[i][j] < minimo) {
                    minimo = numeros[i][j];
                    min_i = i;
                    min_j = j;
                }
            }
        }

        IO.println("El máximo es: " + maximo + " y está en (" + max_i + ", " + max_j + ")");
        IO.println("El mínimo es: " + minimo + " y está en (" + min_i + ", " + min_j + ")");


    }
}
