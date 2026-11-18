package tema2.pruebaescrita.opcion1;

public class BatallaMagos {

    /**
     * Función que simula tirar un dado de numCaras caras
     * @param numCaras
     * @return
     */
    public static int tirarDado(int numCaras) {
        int resultado;
        resultado = (int) (Math.random() * numCaras) + 1;
        return resultado;
    }

    public static void main(String[] args) {

        int numRondas=0;
        int dadoM1, dadoM2, dadoM3;
        int dadoG1, dadoG2;
        int totalRondaM=0;
        int totalRondaG=0;
        int totalM=0, totalG=0;
        int numRondasM=0, numRondasG=0;

        //Número de rondas mayor que 0
        do {
            try {
                numRondas = Integer.parseInt(IO.readln("Dime el número de rondas: "));
            } catch (Exception ex) {
                System.out.println("Número incorrecto");
            }
        } while(numRondas <= 0);

        //A jugar
        while(numRondas > 0) {
            //Juega Merlinus
            dadoM1 = tirarDado(8);
            dadoM2 = tirarDado(8);
            dadoM3 = tirarDado(8);
            if (dadoM1 > 4) {
                totalRondaM += dadoM1;
            }
            if (dadoM2 > 4) {
                totalRondaM += dadoM2;
            }
            if (dadoM3 > 4) {
                totalRondaM += dadoM3;
            }

            //Juega Gandolfus
            dadoG1 = tirarDado(12);
            dadoG2 = tirarDado(12);
            if (dadoG1 <= 6) {
                totalRondaG += dadoG1;
            }
            if (dadoG2 <= 6) {
                totalRondaG += dadoG2;
            }

            //Actualizar total acumulado
            totalM += totalRondaM;
            totalG += totalRondaG;

            //Mostrar ronda
            IO.println("Ronda " + numRondas);
            IO.println("Merlinus dado1: " + dadoM1 + " dado2: " + dadoM2 + " dado3: " + dadoM3);
            IO.println("Merlinus total: " + totalRondaM);
            IO.println("Gandolfus dado1: " + dadoG1 + " dado2: " + dadoG2);
            IO.println("Gandolfus total: " + totalRondaG);
            if (totalRondaM > totalRondaG) {
                IO.println("Merlinus gana");
                numRondasM++;
            } else if (totalRondaG > totalRondaM) {
                IO.println("Gandolfus gana");
                numRondasG++;
            } else {
                IO.println("Empate");
            }

            //Para sumar los dados en la siguiente ronda
            totalRondaM=0;
            totalRondaG=0;
            numRondas--;
        }

        //Recopilación de rondas
        IO.println("RESULTADO FINAL");
        IO.println("Total Merlinus: " + numRondasM);
        IO.println("Total Gandolfus: " + numRondasG);
        if (numRondasM > numRondasG) {
            IO.println("Merlinus gana");
        } else if (numRondasG > numRondasM) {
            IO.println("Gandolfus gana");
        } else {
            IO.println("Empate");
            if (totalM > totalG) {
                IO.println("Merlinus gana");
            } else if (totalG > totalM) {
                IO.println("Gandolfus gana");
            } else {
                IO.println("Empate a lo bestia");
            }
        }

    }

    //NO ES UN DUELO EQUITATIVO, ES MÁS FÁCIL SACAR EN TRES DADOS DE 8 CARAS ALGO MAYOR QUE 4
    //QUE SACAR EN DOS DADOS DE DOCE CARAS MENOR QUE 6, HAY UN DADO MENOS AUNQUE LA PROBABILIDAD
    //DE CADA DADO ES LA MISMA. CON OTRO DADO DE MERLINUS ESTARÍA IGUALADO

}
