package tema2.pruebaescrita.prueba.examen;

public class examen2 {

    public static void main(String[] args) {


        int NumeroCombates = 0;
        int TiradaM = 0;
        int TiradaG = 0;
        int aleatorio = 0;

        NumeroCombates = (int) Integer.parseInt(IO.readln("Dime el numero de combates -> "));
        IO.println("--- COMBATE ---");

        do{


            aleatorio = (int) ( Math.random() * (8 - 1 + 1)) + 1;
            TiradaM++;
            IO.println(aleatorio);

        }
        while(TiradaM <= 2);

    }

}