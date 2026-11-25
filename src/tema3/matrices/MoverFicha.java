package tema3.matrices;

public class MoverFicha {
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

        int[][] tablero = new int[10][10];
        int opcion=0;
        int obj_i = 6, obj_j = 8;
        int pos_i = 2, pos_j = 2;

        pintar(tablero, pos_i, pos_j, obj_i, obj_j);

        do {
            IO.println("1. Derecha");
            IO.println("2. Izquierda");
            IO.println("3. Abajo");
            IO.println("4. Arriba");
            IO.println("5. Salir");

            opcion = Integer.parseInt(IO.readln("Dime opción: "));
            switch (opcion) {
                case 1 -> {
                    pos_j++;
                }
                case 2 -> {
                    pos_j--;
                }
                case 3 -> {
                    pos_i++;
                }
                case 4 -> {
                    pos_i--;
                }
                case 5 -> {
                    IO.println("Espero te lo hayas pasado bien");
                    break;
                }
            }
            pintar(tablero, pos_i, pos_j, obj_i, obj_j);
        } while (opcion != 5);

    }
}
