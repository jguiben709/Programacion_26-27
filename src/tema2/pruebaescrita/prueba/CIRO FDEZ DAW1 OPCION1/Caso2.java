package tema2.pruebaescrita.prueba.CIRO

public class Caso2 {
    static int lanzarDados(int numCaras) {
        return (int) (Math.random() * (numCaras - (1) + 1)) + 1;
    }

    static int turnoMerlin() {
        int total = 0;
        int dado;

        IO.println("MERLINUS");
        for (int i = 1; i <= 3; i++) {
            dado = lanzarDados(8);
            IO.print(dado + " ");
            if (dado > 4) {
                total += dado;
            }
        }
        IO.println();
        return total;
    }

    static int turnoGandalf() {
        int total = 0;
        int dado;

        IO.println("GANDOLFUS");
        for (int i = 1; i <= 2; i++) {
            dado = lanzarDados(12);
            IO.print(dado + " ");
            if (dado <= 6) {
                total += dado;
            }
        }
        IO.println();
        return total;
    }

    public static void main(String[] args) {
        int numTurnos = 0;
        int puntuacionMerlin;
        int puntuacionGandalf;
        int empates = 0;
        int ganaM = 0;
        int ganaG = 0;
        int acumuladorG = 0;
        int acumuladorM = 0;

        try {
            numTurnos = Integer.parseInt(IO.readln("Cuántos turnos van a jugar: "));
        } catch (NumberFormatException e) {
            IO.println("Eso no es un número.");
        }

        for (int i = numTurnos; i > 0; i--) {
            // Turno de Cubitus
            puntuacionMerlin = turnoMerlin();
            puntuacionGandalf = turnoGandalf();

            acumuladorG = acumuladorG + puntuacionGandalf;
            acumuladorM = acumuladorM + puntuacionMerlin;

            if (puntuacionMerlin > puntuacionGandalf) {
                IO.println("Esta ronda la gana Merlinus");
                ganaM++;

            } else if (puntuacionGandalf > puntuacionMerlin) {
                IO.println("Esta ronda la gana Gandolfus");
                ganaG++;
            } else {
                IO.println("EMPATE");
                empates++;
            }

        }

        IO.println("Merlinus gana " + ganaM + " rondas");
        IO.println("Gandolfus gana " + ganaG + " rondas");
        IO.println("Han empatado " + empates + " rondas");

        if (ganaM > ganaG) {
            IO.println("El vencedor final por rondas es Merlinus");
        } else if (ganaG > ganaM) {
            IO.println("El vencedor final por rondas Gandolfus");
        } else if (acumuladorM > acumuladorG) {
            IO.println("El vencedor final por puntos es Merlinus");
        } else {
            IO.println("El vencedor final por puntos Gandolfus");
        }

        /* ¿Es un duelo equitativo? ¿Cómo lo comprobarías mediante simulación?

            No es un duelo equitativo ya que al probar con una cantidad mayor de números siempre acaba ganando Merlinus.
            Se puede ver en los primeros digitos de las rondas multiplos de 10 (100,1000,10000...)
            Aproximadamente el 80% de las rondas las gana Melinus y el 15% Gandolfus, siendo un 5% empates.

         */
    }
}
