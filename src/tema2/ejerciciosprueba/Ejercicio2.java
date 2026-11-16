package tema2.ejerciciosprueba;

public class Ejercicio2 {

    static int lanzarDados(int numCaras) {
        return (int) (Math.random() * (numCaras - (1) + 1)) + 1;
    }

    /**
     * Tiro el dado cuatro veces, si es impar lo sumo a un total
     * @return
     */
    static int turnoCubitus() {
        int total=0, dado;
        IO.println("CUBITUS");
        for(int i=1; i <= 4; i++) {
            dado = lanzarDados(10);
            IO.print(dado + " ");
            if (dado % 2 != 0) {
                total += dado;
            }
        }
        IO.println();
        return total;
    }

    static int turnoHumerus() {
        int total=0, dado;
        IO.println("HUMERUS");
        for(int i=1; i <= 3; i++) {
            dado = lanzarDados(15);
            IO.print(dado + " ");
            if (dado % 2 == 0) {
                total += dado;
            }
        }
        IO.println();
        return total;
    }

    static void main() {

        int numTurnos=0;
        int dado1,dado2,dado3,dado4;
        int puntuacionCubitus=0, puntuacionHumerus=0;
        int ganaCubitus=0, ganaHumerus=0;

        numTurnos = Integer.parseInt(IO.readln("Cuántos turnos quieres jugar"));

        //for(int i=0; i < numTurnos; i++)  también vale
        for(int i=numTurnos; i > 0; i--) {
            //Turno de Cubitus
            puntuacionCubitus = turnoCubitus();
            puntuacionHumerus = turnoHumerus();

            if (puntuacionCubitus > puntuacionHumerus) {
                IO.println("Esta ronda la gana Cubitus");
                ganaCubitus++;
            } else if (puntuacionHumerus > puntuacionCubitus) {
                IO.println("Esta ronda la gana Humerus");
                ganaHumerus++;
            }

            IO.readln("Pulsa cualquier tecla para continuar ronda");
        }

        //Pintar puntuaciones
        IO.println("Cubitus gana " + ganaCubitus + " rondas");
        IO.println("Humerus gana " + ganaHumerus + " rondas");

        //Comprobar ganador
        if (ganaCubitus > ganaHumerus) {
            IO.println("El vencedor final es CUBITUS");
        } else if (ganaHumerus > ganaCubitus) {
            IO.println("El vencedor final es HUMERUS");
        } else {
            IO.println("EMPATE");
        }

    }
}
