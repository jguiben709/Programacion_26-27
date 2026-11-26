package tema3.matrices;

public class MoverFicha {

    static int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    /**
     * Pinta el tablero.
     * Ceros donde no hay nada
     * Un uno donde está el juador
     * Un cinco el objetivo a donde ir
     * @param m
     * @param ficha_i
     * @param ficha_j
     * @param obj_i
     * @param obj_j
     */
    static void pintar(int[][] m, int ficha_i, int ficha_j, int obj_i, int obj_j) {
        for(int i=0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i == ficha_i && j == ficha_j) {
                    System.out.printf("%1d ", 1);
                } else if (i == obj_i && j == obj_j) {
                    System.out.printf("%1d ", 5);
                } else {
                    System.out.printf("%1d ", m[i][j]);
                }
            }
            IO.println();
        }
    }

    static void main() {

        //CONTROLAR QUE NO SE SALGA DEL TABLERO Pista: try-catch
        //CONTROLAR CONDICIÓN DE VICTORIA: si llegas al objetivo "GANAS" y fin.
        final int NUM_FILAS = 11;
        final int NUM_COLUMNAS = 11;
        final int POS_I_INICIO = generarAleatorio(0, NUM_FILAS - 1);
        final int POS_J_INICIO = generarAleatorio(0, NUM_COLUMNAS - 1);

        int[][] tablero = new int[NUM_FILAS][NUM_COLUMNAS];
        int opcion=0;
        int obj_i = generarAleatorio(0, NUM_FILAS - 1); //Posición donde llegar
        int obj_j = generarAleatorio(0, NUM_FILAS - 1); //Posición donde llegar
        int pos_i = POS_I_INICIO, pos_j = POS_J_INICIO; //Posición del jugador

        pintar(tablero, pos_i, pos_j, obj_i, obj_j);

        do {
            //Comprobar que has ganado
            if (pos_i == obj_i && pos_j == obj_j) {
                IO.println("Llegaste al objetivo. VICTORIA!!!");
                break;
            }

            IO.println("1. Derecha");
            IO.println("2. Izquierda");
            IO.println("3. Abajo");
            IO.println("4. Arriba");
            IO.println("5. Salir");

            opcion = Integer.parseInt(IO.readln("Dime opción: "));
            switch (opcion) {
                case 1 -> {
                    pos_j++; //Una columna a la derecha
                }
                case 2 -> {
                    pos_j--; //Una columna a la izquierda
                }
                case 3 -> {
                    pos_i++; //Una fila hacia abajo
                }
                case 4 -> {
                    pos_i--; //Una fila hacia arriba
                }
                case 5 -> {
                    IO.println("Espero te lo hayas pasado bien");
                    break;
                }
            }
            //Comprobar que nos salimos del tablero
            try {
                tablero[pos_i][pos_j] = 0;
            } catch (ArrayIndexOutOfBoundsException ex) {
                IO.println("Te has salido del tablero. Empiezas de nuevo!");
                pos_i = POS_I_INICIO;
                pos_j = POS_J_INICIO;
            }

            //Pintamos de nuevo el tablero con la posición modificada
            pintar(tablero, pos_i, pos_j, obj_i, obj_j);

            //Comprobar que has ganado si no coincidiera inicio y objetivo

        } while (opcion != 5);

    }
}
