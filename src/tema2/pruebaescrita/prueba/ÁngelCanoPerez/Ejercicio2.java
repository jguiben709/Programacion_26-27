package tema2.pruebaescrita.prueba.ÁngelCanoPerez;

public class Ejercicio2 {

    public static int lanzarDados(int numCaras){
        return (int)(Math.random() * (numCaras- 1 + 1)) + 1;}

    public static int tiradaMerlinus(){
        int d1,d2,d3;
        int suma=0;
        d1 = lanzarDados(8);
        d2 = lanzarDados(8);
        d3= lanzarDados(8);
        if (d1>4){
            suma += d1;
        }
        if (d2>4){
            suma += d2;
        }
        if (d3>4){
            suma+=d3;
        }
        return suma;
    }
    public static int tiradaGandolfus(){
        int d1,d2;
        int suma=0;
        d1 = lanzarDados(12);
        d2 = lanzarDados(12);
        if (d1<=6){
            suma+=d1;
        }
        if (d2<=6){
            suma+=d2;
        }
        return suma;
    }





    static void main(String[] args) {

    int rondas=0;
    int puntosG=0,puntosM=0,pTotalesG=0,pTotalesM=0;
    int rondasGanadasG=0,rondasGanadasM=0;
    try { rondas = Integer.parseInt(IO.readln("¿Cuantas rondas quereis jugar?: "));
        for (int i= 0;i<rondas;i++) {
            IO.println("-----------Ronda " + (i+1) + "----------------");
            puntosG = tiradaGandolfus();
            puntosM = tiradaMerlinus();
            IO.println("Puntos Gandolfus= " + puntosG);
            IO.println("Puntos Merlinus= " + puntosM);
            if (puntosG > puntosM) {
                rondasGanadasG += 1;

            } else if (puntosG < puntosM) {
                rondasGanadasM += 1;
            }


            pTotalesG += puntosG;
            pTotalesM += puntosM;


        }
        IO.println("--------------------------------------------------------");
        IO.println("Puntos totales de Merlinus= "+ pTotalesM);
        IO.println("Puntos totales de Gandolfus= "+ pTotalesG);
        IO.println("Rondas ganadas por Merlinus= "+rondasGanadasM);
        IO.println("Rondas ganadas por Gandolfus= " + rondasGanadasG);
        if (rondasGanadasG>rondasGanadasM){
            IO.println("La partida la ha Ganado Gandolfus ");
        } else if (rondasGanadasG<rondasGanadasM) {
            IO.println("La partida la ha ganado Merlinus ");

        }else{
            IO.println("Ha habido un empate. ");
            if (pTotalesG>pTotalesM){
                IO.println("Gana Gandolfus por los puntos. ");
            } else if (pTotalesG<pTotalesM) {
                IO.println("Gana Merlinus por los puntos. ");

            }else {
                IO.println("Ha habido un doble empate. ");
            }
        }
    } catch (NumberFormatException e) {
        IO.println("Error : " + e.getMessage());
    }

/*
No es justa porque casi siempre va a tener más puntuación Merlinus porque sus posibles dados a sumar son 5,6,7,8
y son 3 dados, y Gandolfus solo tendria 2 dados cuyos valores posibles son 6.5,4,3,2,1.
La probabilidad de que gane Merlinus es mayor.
 */


    }
}
