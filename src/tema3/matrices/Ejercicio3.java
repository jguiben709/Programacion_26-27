package tema3.matrices;

import java.util.Arrays;

public class Ejercicio3 {

    static void main() {

        int[][] matriz = {
                { 22, 33, 9, 44, 99 },
                { 41, 51, 78, 12, 7 },
                { 66, 1, 39, 10, 47 }
        };
        int[] sumaFilas = new int[matriz.length];
        int suma=0;
        int columna=0;

        //Suma de cada fila
        for(int i=0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaFilas[i] = sumaFilas[i] +  matriz[i][j];
                suma = suma + matriz[i][j];
            }
            suma = 0;
        }

        IO.println("Suma de las filas: " + Arrays.toString(sumaFilas));

        //Suma cada columna versión 1
        for(int i=0; i < matriz[0].length; i++) {
            for(int j=0; j < matriz.length; j++) {
                 columna = columna + matriz[j][i];
            }
            IO.println("Columna " + i + " es: " + columna);
            columna = 0;
        }

        //Suma de columnas versión 2
        for (int j = 0; j < matriz[0].length; j++) {
            for(int i=0; i < matriz.length; i++) {
                columna = columna + matriz[i][j];
            }
            IO.println("Columna " + j + " es: " + columna);
            columna = 0;
        }

    }
}
