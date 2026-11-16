package tema2.ejerciciosprueba;

public class Ejercicio1 {

    /**
     * Método que pide por teclado un número entre 1 y 3
     * @return
     */
    static int pedirCerillas() {
        int numCerillas=0;

        do {
            try {
                numCerillas = Integer.parseInt(IO.readln("Cuántas cerillas quitas? (1 a 3) "));
            } catch (NumberFormatException e) {
                IO.println("Número incorrecto");
            }
            if (numCerillas < 1 || numCerillas > 3) {
                IO.println("Numero de cerillas incorrecto, elige entre 1 y 3");
            }
        } while (numCerillas < 1 || numCerillas > 3);

        return numCerillas;
    }

    /**
     * Método que genera un número aleatorio entre 1 y 3
     * @return
     */
    static int aleatorioCerillas() {
        return (int) (Math.random() * (3 - (1) + 1)) + 1;
    }


    static void main() {

        int cerillas = 21;
        int cerQuitadas;
        boolean ganadorPC=false, ganadorJugador=false;

        do {
            //QUITA EL JUGADOR
            cerQuitadas = pedirCerillas(); //1-3
            IO.println("El usuario ha quitado " + cerQuitadas + " cerillas");
            cerillas -= cerQuitadas;
            IO.println("Quedan " + cerillas + " cerillas");

            //Compruebas si queda 0 o menos en cuyo caso pierdo yo
            if (cerillas <= 0) {
                ganadorPC = true;
                break;
            }

            //QUITA EL PC
            cerQuitadas = aleatorioCerillas(); //1-3
            IO.println("El PC ha quitado " + cerQuitadas + " cerillas");
            cerillas -= cerQuitadas;
            IO.println("Quedan " + cerillas + " cerillas");

            //Comprueba si queda 0 o menos en cuyo caso pierde el pc
            if (cerillas <= 0) {
                ganadorJugador = true;
                break;
            }

        } while (cerillas > 0);

        if (ganadorJugador) {
            IO.println("GANA EL JUGADOR");
        } else if (ganadorPC) {
            IO.println("GANA EL PC");
        }

    }
}
