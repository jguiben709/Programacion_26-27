package tema3.matrices;

public class Ejercicio2 {
    static void pintar(int[][] m) {
        for(int i=0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf("%3d ", m[i][j]);
            }
            IO.println();
        }
    }

    static void main() {

        int[][] m1 = {
                { 22, 33, 9, 44, 99 },
                { 41, 51, 78, 12, 7 },
                { 66, 1, 39, 10, 47 }
        };

        int[][] m2 = {
                { 11, 33, 9, 44, 99 },
                { 41, 61, 78, 12, 7 },
                { 66, 1, 49, 20, 77 }
        };

        int filas = m1.length;
        int columnas = m1[0].length;

        int[][] suma = new int[filas][columnas];

        for(int i=0; i < m1.length; i++) {
            for(int j=0; j < m1[0].length; j++) {
                suma[i][j] = m1[i][j] + m2[i][j];
            }
        }

        pintar(suma);
    }
}
