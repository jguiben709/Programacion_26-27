package tema3.matrices;

public class VictoriaConecta4 {

    /**
     *     Dada una matriz de 6 filas x 7 columnas (char) que representa un tablero
     *     parcialmente lleno de fichas 'X' y 'O' (y '.' para vacío).
     *     Escribe un metodo que reciba esta matriz y un jugador ('X' o 'O') y devuelva
     *     true si ese jugador tiene 4 fichas en línea (horizontal, vertical o diagonal).
     *     Es un excelente reto de lógica para buscar patrones de forma eficiente.
     */

    static final int NUM_FILAS = 6;
    static final int NUM_COLUMNAS = 7;

    /**
     * Poner todas las piezas con el caracter '.'
     * @param tablero
     */
    static void inicializarTablero(char[][] tablero) {
        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[0].length; j++) {
                tablero[i][j] = '.';
            }
        }
    }

    /**
     * Pinta el tablero
     * @param tablero
     */
    static void pintarTablero(char[][] tablero) {
        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[0].length; j++) {
                IO.print((char)tablero[i][j] + " ");
            }
            IO.println();
        }
    }

    /**
     * Pide la columna donde soltar la ficha
     * @return Un número del 1 al 7
     */
    static int pedirColumna() {
        int columna=0;

        do {
            try {
                columna = Integer.parseInt(IO.readln("Dime columna para soltar ficha (1-" + NUM_COLUMNAS + ") " ));
            } catch (NumberFormatException ex) {
                IO.println("No seas listo, dime un número ");
                continue; //Para que no pinte dos veces el mensaje
            }
            if (columna < 1 || columna > 7) {
                IO.println("No seas listo, dime un número del 1 al " + NUM_COLUMNAS);
            }
        } while(columna < 1 || columna > 7);

        return columna;
    }

    /**
     * Coloca la ficha correspondiente en el tablero, en la posición que corresponda.
     * @param columna
     * @param tablero
     * @param ficha
     */
    static void soltarFicha(int columna, char[][] tablero, char ficha) {
        int i=0;
        while (tablero[i][columna] == '.' && i < NUM_FILAS-1) {
            i++;
        }

        if (tablero[i][columna] == '.') {
            tablero[i][columna] = ficha;
        } else {
            try {
                tablero[i - 1][columna] = ficha;
            } catch(ArrayIndexOutOfBoundsException ex) {
                IO.println("Esta columna está llena :(");
            }
        }
    }



    static void main() {

        char[][] tablero = new char[NUM_FILAS][NUM_COLUMNAS];
        int columnaJ1=0, columnaJ2=0;
        boolean victoriaJ1=false, victoriaJ2=false;

        inicializarTablero(tablero);
        pintarTablero(tablero);

        do {
            IO.println("JUGADOR 1");
            columnaJ1 = pedirColumna();
            IO.println("Columna seleccionada: " + columnaJ1);
            columnaJ1--; //Resto uno para acceder al tablero 0-6
            soltarFicha(columnaJ1, tablero, 'X');
            pintarTablero(tablero);
            victoriaJ1 = condicionVictoria('X');

            IO.println("JUGADOR 2");
            columnaJ2 = pedirColumna();
            IO.println("Columna seleccionada: " + columnaJ2);
            columnaJ2--; //Resto uno para acceder al tablero 0-6
            soltarFicha(columnaJ2, tablero, 'O');
            pintarTablero(tablero);
            victoriaJ2 = condicionVictoria('X');
        } while(!victoriaJ1 && !victoriaJ2);

        if (victoriaJ1) {
            IO.println("Ha ganado el jugador 1");
        } else if (victoriaJ2) {
            IO.println("Ha ganado el jugador 2");
        } else {
            //No hemos tenido en cuenta el empate
        }



    }








}
