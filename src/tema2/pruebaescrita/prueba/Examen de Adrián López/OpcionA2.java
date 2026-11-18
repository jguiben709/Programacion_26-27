package tema2.pruebaescrita.prueba.Examen;

public class OpcionA2 {
    static void main() {
        int rondas = 0;
        int dadoGandolfus1 = 0, dadoGandolfus2 = 0;
        int dadoMerlinus1 = 0, dadoMerlinus2 = 0, dadoMerlinus3 = 0;
        int totalGandolfus = 0, totalMerlinus = 0;
        int rondasGanadasGandolfus = 0, rondasGanadasMerlinus = 0;
        try {
            rondas = Integer.parseInt(IO.readln("Dime un numero de rondas:  "));
        } catch (NumberFormatException ex) {
            IO.println("Dime un número");
            return;
        }
        if  (rondas <= 0){
            IO.println("NO ME DIGAS UN VALOR MENOR QUE 0");
            return;
        }

        for (int i = 1 ; i <=rondas ; i++) {
        dadoMerlinus1 =  (int) (Math.random() * (8 - (1) + 1)) + 1;
        dadoMerlinus2 =  (int) (Math.random() * (8 - (1) + 1)) + 1;
        dadoMerlinus3 =  (int) (Math.random() * (8 - (1) + 1)) + 1;

        int puntosrondaG = 0;
        int puntosrondaM = 0;

        if (dadoMerlinus1 >= 4 ) {
            totalMerlinus = dadoMerlinus1 + totalMerlinus;
            puntosrondaM = dadoMerlinus1 + puntosrondaM;
        }
        if (dadoMerlinus2 >= 5) {
            totalMerlinus = dadoMerlinus2 + totalMerlinus;
            puntosrondaM = dadoMerlinus2 + puntosrondaM;
        }
        if (dadoMerlinus3 >= 5) {
            totalMerlinus = dadoMerlinus3 + totalMerlinus;
            puntosrondaM = dadoMerlinus3 + puntosrondaM;
        }

        IO.println("Merlinus ha sacado en el primer dado: " + dadoMerlinus1);
        IO.println("Merlinus ha sacado en el segundo dado: " + dadoMerlinus2);
        IO.println("Merlinus ha sacado en el tercer dado: " + dadoMerlinus3);

        IO.println("Puntos de la ronda de Merlinus: " + puntosrondaM);
        IO.println("-------------------------------");

       dadoGandolfus1 =  (int) (Math.random() * (8 - (1) + 1)) + 1;
        dadoGandolfus2 =  (int) (Math.random() * (8 - (1) + 1)) + 1;

            if (dadoGandolfus1 <= 6) {
                totalGandolfus = dadoGandolfus1 + totalGandolfus;
                puntosrondaG = dadoGandolfus1 + puntosrondaG;
            }
            if (dadoGandolfus2 <= 6) {
                totalGandolfus = dadoGandolfus2 + totalGandolfus;
                puntosrondaG = dadoGandolfus2 + puntosrondaG;
            }

        IO.println("Gandolfus ha sacado en el primer dado: " + dadoGandolfus1);
        IO.println("Gandolfus ha sacado en el segundo dado: " + dadoGandolfus2);
        IO.println("Puntos de la ronda de Gandolfus: " + puntosrondaG);
        IO.println("-------------------------------");

        if (puntosrondaG > puntosrondaM){
            rondasGanadasGandolfus = rondasGanadasGandolfus + 1;
            IO.println("Gana gandolfus la ronda: " + rondasGanadasGandolfus);
        } else if (puntosrondaM > puntosrondaG){
            rondasGanadasMerlinus = rondasGanadasMerlinus + 1;
            IO.println("Gana la ronda Merlinus: " + rondasGanadasMerlinus );
            }


        IO.println("-----------FIN DE LA RONDA-----------");
        }
        if (rondasGanadasMerlinus > rondasGanadasGandolfus) {
            IO.println("Gana la partida Merlinus por tener mas rondas ganadas: " + rondasGanadasMerlinus + " rondas de Gandolfus: " + rondasGanadasGandolfus);
        } else if (rondasGanadasGandolfus > rondasGanadasMerlinus) {
            IO.println("Gana la partida Gandolfus por tener mas rondas ganadas: " + rondasGanadasGandolfus + " rondas de Merlinus: " + rondasGanadasMerlinus);
        } else if (rondasGanadasGandolfus == rondasGanadasMerlinus) {
            if (totalMerlinus > totalGandolfus){
                IO.println("Gana Merlinus por tener mas puntos: " + totalMerlinus + " puntos de Gandolfus: " + totalGandolfus);
            } if (totalGandolfus > totalMerlinus) {
                IO.println("Gana Gandolfus por tener mas puntos : " +totalGandolfus + " puntos de Merlinus: " + totalMerlinus);
            } if (totalGandolfus == totalMerlinus) {
                IO.println("Han quedado empate: " + totalGandolfus + " y " + totalMerlinus);
            }
        }
        /* No es equitativo, ya que casi siempre gana Merlinus,
           ya que tiene mas dados y su condicion de que tiene que ser mas de 4,
           es mas favorable para conseguir puntos.
           He hecho varios pruebas y gana casi siempre merlinus,
           de 10 rondas lo mas probable es que las gane todas.
           y encima si quedan empate seguramente Merlinus tenga mas puntos por tener mas dados y tener la condicion de mayor de 4.
        */

    }
}