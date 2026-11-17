package tema2.practicagrupo;

public class Ejercicio3 {

    static int lanzarDados(int numCaras) {
        return (int) (Math.random() * (numCaras - (1) + 1)) + 1;
    }

    static void main() {
        int numTurnos=0;
        int d1, d2;
        int puntuacionC, puntuacionH;
        int acumuladoC=0, acumuladoH=0;

        try {
            numTurnos = Integer.parseInt(IO.readln("Cuántos turnos quieres jugar "));
        } catch (Exception ex) {
            IO.println("Error escribiendo número de turnos, hasta otra");
        }

        for(int i=0; i < numTurnos; i++) {
            d1 = lanzarDados(6);
            d2 = lanzarDados(6);

            IO.println("Dado1: " + d1 + " Dado2: " + d2);

            if ( ((d1 % 2 == 0) && (d2 % 2 == 0)) || ((d1 % 2 == 1) && (d2 % 2 == 1)) ) {
                acumuladoC += (d1 + d2);
                IO.println("GANA CUBITUS");
            } else {
                acumuladoH += (d1 + d2);
                IO.println("GANA HUMERUS");
            }
        }

        if (acumuladoC > acumuladoH) {
            IO.println("GANA CUBITUS " + acumuladoC + " FRENTE A HUMERUS " + acumuladoH);
        } else if (acumuladoH > acumuladoC) {
            IO.println("GANA HUMERUS " + acumuladoH + " FRENTE A CUBITUS " + acumuladoC);
        } else {
            if (acumuladoC > 0 || acumuladoH > 0) {
                IO.println("EMPATAN A ACUMULADO");
                }
        }
    }

}
