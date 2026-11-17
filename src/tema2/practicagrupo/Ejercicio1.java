package tema2.practicagrupo;

public class Ejercicio1 {

    static int lanzarDados(int numCaras) {
        return (int) (Math.random() * (numCaras - (1) + 1)) + 1;
    }


    static void main() {
        int numTurnos=0;
        int dadoC, dadoH;
        int acumuladoC=0, acumuladoH=0;
        int partidasC=0, partidasH=0;
        int acumulado=0;

        try {
            numTurnos = Integer.parseInt(IO.readln("Cuántos turnos quieres jugar "));
        } catch (Exception ex) {
            IO.println("Error escribiendo número de turnos, hasta otra");
        }

        for(int i=0; i < numTurnos; i++) {
            dadoC = lanzarDados(6);
            dadoH = lanzarDados(6);
            IO.println("Cubitus= " + dadoC + " Humerus= " + dadoH);

            if (dadoC > dadoH) {
                IO.println("Gana Cubitus -----");
                partidasC++;
                acumuladoC += (dadoC + dadoH) + acumulado;
                acumulado = 0;
            } else if (dadoH > dadoC) {
                IO.println("Gana Humerus -----");
                partidasH++;
                acumuladoH += (dadoC + dadoH) + acumulado;
                acumulado = 0;
            } else {
                IO.println("Empate -----------");
                acumulado += (dadoC + dadoH);
            }

            IO.println("Total Cubitus=  " + acumuladoC);
            IO.println("Total Humerus=  " + acumuladoH);
            IO.println();
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
