package tema2.practicagrupo;

public class Ejercicio4 {

    static int lanzarDados(int numCaras) {
        return (int) (Math.random() * (numCaras - (1) + 1)) + 1;
    }

    static void main() {
        int numTurnos=0;
        int dC1, dC2, dC3, dH1, dH2, dH3;
        int partidasC=0, partidasH=0;

        try {
            numTurnos = Integer.parseInt(IO.readln("Cuántos turnos quieres jugar "));
        } catch (Exception ex) {
            IO.println("Error escribiendo número de turnos, hasta otra");
        }

        if (numTurnos % 2 == 1) {
            for(int i=0; i < numTurnos; i++) {
                dC1 = lanzarDados(13);
                dC2 = lanzarDados(13);
                dC3 = lanzarDados(13);
                dH1 = lanzarDados(13);
                dH2 = lanzarDados(13);
                dH3 = lanzarDados(13);

                IO.println("Tirada Cubitus: " + dC1 + ", " + dC2 + ", " + dC3);
                IO.println("Tirada Humerus: " + dH1 + ", " + dH2 + ", " + dH3);

                if (dC1 == dH1 || dC1 == dH2 || dC1 == dH3 ||
                    dC2 == dH1 || dC2 == dH2 || dC2 == dH3 ||
                    dC3 == dH1 || dC3 == dH2 || dC3 == dH3 ) {
                    partidasC++;
                    IO.println("Gana Cubitus");
                } else {
                    partidasH++;
                    IO.println("Gana Humerus");
                }
            }

            if (partidasC > partidasH) {
                IO.println("GANA MÁS PARTIDAS CUBITUS " + partidasC + " FRENTE A HUMERUS " + partidasH);
            } else if (partidasH > partidasC) {
                IO.println("GANA MÁS PARTIDAS HUMERUS " + partidasH + " FRENTE A CUBITUS " + partidasC);
            }

        } else {
            IO.println("Tenías que haber elegido un número impar");
        }

    }
}
