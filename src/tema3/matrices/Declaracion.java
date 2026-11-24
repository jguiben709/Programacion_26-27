package tema3.matrices;

public class Declaracion {
    static void main() {

        int[][] matriz = new int[3][4];
        //3 filas de longitud 4
        // x x x x        (0,0) (0,1) (0,2) (0,3)
        // x x x x        (1,0) (1,1) (1,2) (1,3)
        // x x x x        (2,0) (2,1) (2,2) (2,3)
        // Primer índice me indica la fila
        // Segundo índice me indica la columna

        int[][] numeros = {
                {1, 2, 3},
                {4, 5, 6}
        };

        IO.println(numeros[1][1]); //Fila 1 Columna 1
        IO.println(numeros[0][2]); //Fila 0 Columna 2



    }
}
