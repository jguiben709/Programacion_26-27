package tema3.matrices;

import java.util.Arrays;

public class RellenarMatriz {

    static int generarNumero(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    static void pintarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%2d|", matriz[i][j]);
            }
            IO.println();
        }
    }

    /**
     * Busca un número en una matriz
     * @param numero
     * @param matriz
     * @return true si encuentra el número, false si no lo encuentra
     */
    static boolean buscarNumero(int numero, int[][] matriz) {
        boolean encontrado=false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (numero == matriz[i][j]) {
                    //IO.println("Repetido");
                    encontrado=true;
                    break;
                }
            }
        }
        return encontrado;
    }

    static void main() {

        int[][] carton = new int[5][5];
        int aux;

        //Rellenar
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[0].length; j++) {
                //Genera mientras el número que has generado esté repetido
                do {
                    aux = generarNumero(1, 99);
                } while (buscarNumero(aux, carton));
                carton[i][j] = aux;
            }
        }

        //Pintar
        pintarMatriz(carton);
        IO.println();

        //Ordenar cada fila
        for (int i = 0; i < carton.length; i++) {
            Arrays.sort(carton[i]);
        }

        //Pintar
        pintarMatriz(carton);

    }
}
