package tema3.matrices;

public class RecorrerMatriz {
    static void main() {

        int[][] numeros = {
                {1, 2, 3, -1},
                {4, 5, 6, -1},
                {7, 8, 9, -1},
        };

        //numeros.length me indica el número de filas que hay -> 3
        //numeros[0] la primera fila
        //numeros[0].length me indica el número de columnas de la fila 0 -> 4

        for(int i=0; i < numeros.length; i++) { //Filas 0,1,2
            for(int j=0; j < numeros[0].length; j++) { //Columnas 0,1,2,3
                IO.print(numeros[i][j] + " ");
            }
            IO.println();
        }


    }
}
