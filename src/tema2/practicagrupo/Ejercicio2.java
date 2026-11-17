package tema2.practicagrupo;

public class Ejercicio2 {

    /**
     * Simula lanzar un dado de n caras
     * @param numCaras
     * @return
     */
    static int lanzarDados(int numCaras) {
        return (int) (Math.random() * (numCaras - (1) + 1)) + 1;
    }

    /**
     * Devuelve el máximo de 5 números
     * @param d1
     * @param d2
     * @param d3
     * @param d4
     * @param d5
     * @return
     */
    static int maximoDe5(int d1, int d2, int d3, int d4, int d5) {
        return Math.max(d1, Math.max(d2, Math.max(d3, Math.max(d4,d5))));
    }

    /**
     * Devuellve el mínimo de 5 números
     * @param d1
     * @param d2
     * @param d3
     * @param d4
     * @param d5
     * @return
     */
    static int minimoDe5(int d1, int d2, int d3, int d4, int d5) {
        return Math.min(d1, Math.min(d2, Math.min(d3, Math.min(d4,d5))));
    }

    /**
     * Simula la tirada de cinco dados de 6 caras, y suma sus valores quitando los que coincidan con mínimo y máximo
     * @return
     */
    static int tirada() {
        int d1,d2,d3,d4,d5;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int acumulado = 0;

        d1 = lanzarDados(6);
        d2 = lanzarDados(6);
        d3 = lanzarDados(6);
        d4 = lanzarDados(6);
        d5 = lanzarDados(6);

        IO.println("TIRADA: " + d1 + ", " + d2 + ", " + d3 + ", " + d4 + ", " + d5);

        maximo = maximoDe5(d1,d2,d3,d4,d5);
        minimo = minimoDe5(d1,d2,d3,d4,d5);

        if (d1 != maximo && d1 != minimo) {
            acumulado += d1;
        }
        if (d2 != maximo && d2 != minimo) {
            acumulado += d2;
        }
        if (d3 != maximo && d3 != minimo) {
            acumulado += d3;
        }
        if (d4 != maximo && d4 != minimo) {
            acumulado += d4;
        }
        if (d5 != maximo && d5 != minimo) {
            acumulado += d5;
        }

        return acumulado;
    }


    static void main() {

        int numTurnos=0;
        int puntuacionC, puntuacionH;
        int partidasC=0, partidasH=0;

        try {
            numTurnos = Integer.parseInt(IO.readln("Cuántos turnos quieres jugar "));
        } catch (Exception ex) {
            IO.println("Error escribiendo número de turnos, hasta otra");
        }

        for(int i=0; i < numTurnos; i++) {
            IO.print("CUBITUS ---- ");
            puntuacionC = tirada();
            IO.print("HUMERUS ---- ");
            puntuacionH = tirada();

            IO.println("Total Cubitus: " + puntuacionC);
            IO.println("Total Humerus: " + puntuacionH);

            if (puntuacionC > puntuacionH) {
                IO.println("Gana Cubitus");
                partidasC++;
            } else if (puntuacionH > puntuacionC) {
                IO.println("Gana Humerus");
                partidasH++;
            } else {
                IO.println("Empate");
            }
        }

        if (partidasC > partidasH) {
            IO.println("GANA MÁS PARTIDAS CUBITUS " + partidasC + " FRENTE A HUMERUS " + partidasH);
        } else if (partidasH > partidasC) {
            IO.println("GANA MÁS PARTIDAS HUMERUS " + partidasH + " FRENTE A CUBITUS " + partidasC);
        } else {
            if (numTurnos > 0)
                IO.println("EMPATAN A PARTIDAS");
        }

    }
}
