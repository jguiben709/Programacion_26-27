package tema2.ejerciciosprueba;

public class Ejercicio3 {
    static int lanzarDados(int numCaras) {
        return (int) (Math.random() * (numCaras - (1) + 1)) + 1;
    }

    static int tiradas() {
        int d1,d2,d3,d4,d5;
        int suma=0;

        d1 = lanzarDados(6);
        d2 = lanzarDados(6);
        d3 = lanzarDados(6);
        d4 = lanzarDados(6);
        d5 = lanzarDados(6);

        IO.println("TIRADA: " + d1 + ", " + d2 + ", " + d3 + ", " + d4 + ", " + d5);

        suma = d1 + d2 + d3 + d4 + d5;

        //Penaliza si es menor que 8
        if (suma < 8) {
            IO.println("Penalización de 5");
            IO.readln("Pulsa para continuar");
            suma -= 5;
        }

        //Bonus si son iguales
        if (d1 == d2 && d1 == d3 && d1 == d4 && d1 == d5) {
            IO.println("Bonus de 20");
            IO.readln("Pulsa para continuar");
            suma += 20;
        }

        //Bonus escalera
        if ( (d1 == 1 && d2 == 2 && d3 == 3 && d4 == 4 && d5 == 5) ||
                (d1 == 2 && d2 == 3 && d3 == 4 && d4 == 5 && d5 == 6)) {
            IO.println("Bonus de 10");
            IO.readln("Pulsa para continuar");
            suma += 10;
        }

        return suma;
    }


    static void main() {
        int numTurnos=0;
        int puntuacionCubitus=0, puntuacionHumerus=0;
        int ganaCubitus=0, ganaHumerus=0;

        numTurnos = Integer.parseInt(IO.readln("Cuántos turnos quieres jugar "));

        for(int i=1; i <= numTurnos; i++) {
            puntuacionCubitus = tiradas();
            puntuacionHumerus = tiradas();

            if (puntuacionCubitus > puntuacionHumerus) {
                IO.println("Esta ronda la gana Cubitus");
                ganaCubitus++;
            } else if (puntuacionHumerus > puntuacionCubitus) {
                IO.println("Esta ronda la gana Humerus");
                ganaHumerus++;
            }
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
