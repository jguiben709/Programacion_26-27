package tema3.matrices;

import java.util.Arrays;

public class OrdenarMatrices {

    /**
     * Devuelve la matriz traspuesta
     * @param m
     * @return
     */
    static double[][] trasponer(double[][] m) {
        int nfilas = m.length;
        int ncolumnas = m[0].length;

        double[][] traspuesta = new double[ncolumnas][nfilas];

        for (int j = 0; j < m[0].length; j++) {
            for(int i=0; i < m.length; i++) {
                traspuesta[j][i] = m[i][j];
            }
        }

        return traspuesta;
    }

    static void pintar(double[][] m) {
        for(int i=0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf("%3.1f ", m[i][j]);
            }
            IO.println();
        }
    }

    static void main() {

        //Ordenar las filas de una matriz
        double[][] numeros = {
                { 5.0, 6.5, 7.5, 9.0, 6.0 },
                { 4.0, 4.5, 2.5, 9.0, 4.0 },
                { 6.0, 6.5, 3.5, 9.0, 6.0 },
                { 7.5, 7.5, 7.5, 9.0, 3.0 },
                { 4.0, 8.5, 8.5, 9.0, 6.5 },
                { 3.0, 6.5, 7.0, 9.0, 5.0 },
        };

        /*
        //ORDENAR POR FILAS
        //Arrays.sort(numeros)
        for(int i=0; i < numeros.length; i++) {
            Arrays.sort(numeros[i]);
        }
        pintar(numeros);
        */

        //ORDENAR POR COLUMNAS
        double[][] tras = trasponer(numeros);
        for(int i=0; i < tras.length; i++) {
            Arrays.sort(tras[i]);
        }

        numeros = trasponer(tras);
        pintar(numeros);

    }
}
