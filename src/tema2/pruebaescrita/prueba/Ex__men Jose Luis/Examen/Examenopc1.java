package Examen;

public class Examenopc1 {

    static int numero() {
        return (int) (Math.random() * (50 - (1) + 1)) + 1;
    }

    static void main() {
        /*
         * El programa genera un número aleatorio entre 1 y 50. El usuario tiene un
         * máximo de 7 intentos para adivinarlo. Después de cada intento, el programa
         * indicará:
         * – Si el número es mayor o menor
         * – Si está "frío" (diferencia > 10), "tibio" (dif. entre 5 y 10) o "caliente"
         * (dif. < 5)
         * Al finalizar, mostrará si ganó o perdió y el número de intentos utilizados.
         */

        int numeroJugador;
        int turnos = 7;

        numeroJugador = Integer.parseInt(IO.readln("Dime un número: "));

        for (int i = turnos; i > 0; i--) {

            do {
                int numAleatorio = numero();

                if (numeroJugador > 10) {
                    IO.println("Frío");
                } else if (numeroJugador < 5 && numeroJugador > 10) {
                    IO.println("Tibio");
                } else if (numeroJugador < 5) {
                    IO.println("Caliente");
                } else {
                    IO.println("Número fuera de rango");
                }

                if (numeroJugador == numAleatorio) {
                    IO.println("Muy bien, ese era el número.");
                    break;
                }

            } while (turnos < 0);
        }
    }
}
