package tema2.pruebaescrita.opcion2;

public class CarreraTractores {

    public static int tirarDado(int numCaras) {
        return (int) (Math.random() * numCaras) + 1;
    }

    static void pintar(int valor) {
        for(int i=0; i < 30; i++) {
            if (i == valor) {
                IO.print("I");
            } else {
                IO.print("-");
            }
        }
        IO.println();
    }

    /**
     * Según la opcion
     * - 1 -> devuelve el número 2, 2 casillas
     * - 2 -> genera un número aleatorio entre 1 y 6 y lo devuelve. Pero si es uno devuelve -3,
     *        retroceder 3 casillas
     * @param opcion
     * @return
     */
    static int mover(int opcion) {
        int casillas=0;
        int dado=0;

        switch (opcion) {
            case 1 -> {
                casillas = 2;
            }
            case 2 -> {
                dado = tirarDado(6);
                if (dado == 1) {
                    casillas = -3;
                } else {
                    casillas = dado;
                }
            }
        }

        //IO.println("Mueves " + casillas + " casillas");
        return casillas;
    }

    static void main() {
        int jugador1=0, jugador2=0;
        int opcion=0;

        while (jugador1 < 30 && jugador2 < 30) {

            //LEER OPCION
            IO.println("1. AVANCE SEGURO");
            IO.println("2. ARRIESGARTE");
            try {
                opcion = Integer.parseInt(IO.readln("Dime un opción: "));
            } catch (NumberFormatException ex) {
                IO.println("No me has dicho un número, lo siento");
            }

            //Vemos si la opción está entre 1 y 2
            if (opcion != 1 && opcion != 2) {
                IO.println("Opción incorrecta (1 - 2)");
            } else {
                //MOVER JUGADOR, sumamos casillas según opción elegida
                jugador1 += mover(opcion);
                IO.print("JUGADOR: ");
                pintar(jugador1);
                //MOVER PC, sumamos casillas según opción generada aleatoria
                jugador2 += mover(tirarDado(2));
                IO.print("PC:      ");
                pintar(jugador2);
            }
        }

        //COMPROBAR GANADOR
        if (jugador1 > jugador2) {
            IO.println("Gana el jugador");
        } else if (jugador2 > jugador1) {
            IO.println("Gana el PC");
        } else {
            IO.println("Empate, llegan a la vez");
        }
    }
}
