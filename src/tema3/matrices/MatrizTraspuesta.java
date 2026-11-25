package tema3.matrices;

public class MatrizTraspuesta {
    static void pintar(double[][] m) {
        for(int i=0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf("%3.1f ", m[i][j]);
            }
            IO.println();
        }
    }

    static void main() {

        //6x5
        double[][] numeros = {
                { 5.0, 6.5, 7.5, 9.0, 6.0 },
                { 4.0, 4.5, 2.5, 9.0, 4.0 },
                { 6.0, 6.5, 3.5, 9.0, 6.0 },
                { 7.5, 7.5, 7.5, 9.0, 3.0 },
                { 4.0, 8.5, 8.5, 9.0, 6.5 },
                { 3.0, 6.5, 7.0, 9.0, 5.0 },
        };

        pintar(numeros);

        int nfilas = numeros.length;
        int ncolumnas = numeros[0].length;

        //5x6
        double[][] traspuesta = new double[ncolumnas][nfilas];


        for (int j = 0; j < numeros[0].length; j++) {
            for(int i=0; i < numeros.length; i++) {
                traspuesta[j][i] = numeros[i][j];
            }
        }

        IO.println("-----------------");
        pintar(traspuesta);

    }
}
