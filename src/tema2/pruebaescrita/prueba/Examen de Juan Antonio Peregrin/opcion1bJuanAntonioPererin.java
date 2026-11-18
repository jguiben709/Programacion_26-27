package tema2.pruebaescrita.prueba.Examen;

public class opcion1bJuanAntonioPererin {
    static void main() {
        int numTurnos = 0;
        int carasMer = 8 ;
        int carasGand = 12;

        int totTurnoMer = 0;
        int totTurnoGand = 0;

        int totMer = 0;
        int totGand = 0;

        int totalAhoraMer = 0;
        int totalAhoraGand = 0;

        int puntosMer = 0;
        int puntosGand = 0;


        try {
            numTurnos = Integer.parseInt(IO.readln("cuantos turnos vais a jugar "));
        }catch (NumberFormatException ex) {
            IO.println("dime un numero");
            return;
        }
        for (int i = 1 ; i <=numTurnos ; i++) {
            for (int m =3 ; m >= 0 ; m-- ){
                IO.println("turno de Merlinus");
                totTurnoMer = (int) (Math.random() * (carasMer - (1) + 1)) + 1;
                IO.println(totTurnoMer);
                if (totTurnoMer > 4){
                    totMer = totMer + totTurnoMer;
                }
            }
            totalAhoraMer = totTurnoMer - totalAhoraMer ;
            for (int g = 3; g >= 0 ; g-- ){
                IO.println("turno de Gandolfus");
                totTurnoGand = (int) (Math.random() * (carasGand - (1) + 1)) + 1;
                IO.println(totTurnoGand);
                if (totTurnoGand <= 6){
                    totGand = totGand + totTurnoGand;
                }
            }
            totalAhoraGand = totTurnoGand - totalAhoraGand ;

            if (totalAhoraGand>totalAhoraMer){
                IO.println("esta ronda la gana Gandolfus");
                puntosGand = puntosGand + 1;
            } else if (totalAhoraGand<totalAhoraMer) {
                IO.println("esta ronda la gana Merlinus");
                puntosMer = puntosMer + 1;
            }else {
                IO.println("empate esta ronda");
            }
            IO.println("--------");
        }
        if(puntosGand>puntosMer){
            IO.println("gano Gandolfus");
        } else if (puntosGand<puntosMer) {
            IO.println("gano Merlinus");
        }else {
            if (totGand>totMer){
                IO.println("gano Gandolfus");
            }
            else if (totGand<totMer){
                IO.println("gano Merlinus");
            }else{
                IO.println("empate definitivo");
            }
        }
        //aqui compruebo quien gana mas veces pongo que jueguen 1000 rondas y veo cuantas sales pa cada lao 

        IO.println("puntos gand" + puntosGand);
        IO.println("puntos mer" + puntosMer);

        //mer gana de cada 10 veces 4,85 y gand gana de cada 10 veces 5,02 el resto son empates


    }
}
