package tema2.pruebaescrita.prueba.Examen;

public class BatallaMagos {
    
    static int DadoCaras8(){

        int dado;
        return dado = (int) (Math.random() * (8 - 1 + 1)) + 1;
    }

    static int DadoCaras12(){

        int dado;
        return dado = (int) (Math.random() * (12 - 1 + 1)) + 1;
    }



    public static void main(String[] args) {
        
        int numRondas = Integer.parseInt(IO.readln("Dime el número de rondas: "));
        int dado1M, dado2M, dado3M;
        int sumaM = 0;
        int dado1G, dado2G;
        int sumaG = 0;

        for (int i = 0; i < numRondas; i++) {
            //Tirada de Merlinus
           
            dado1M = DadoCaras8();
            dado2M = DadoCaras8();
            dado3M = DadoCaras8();

            IO.println("");
            IO.println("A Merlinus le sale dados de: " + dado1M + "-" + dado2M + "-" + dado3M);

            if (dado1M > 4){
                sumaM += dado1M;
            }
            if (dado2M > 4) {
                sumaM += dado2M;
            }
            if (dado3M > 4) {
                sumaM += dado3M;
            }
            IO.println("Merlinus tiene " + sumaM + " puntos");


            //Tirada de Gandolfus
           

            dado1G = DadoCaras12();
            dado2G = DadoCaras12();

            IO.println("");
            IO.println("A Gangolfus le sale dados de: " + dado1G + "-" + dado2G);

            if (dado1G <= 6){
                sumaG += dado1G;
            }
            if (dado2G <= 6) {
                sumaG += dado2G;
            }
            IO.println("Gandolfus tiene " + sumaG + " puntos");

            
            //Ganador
            if (sumaG > sumaM) {
                IO.println("--------------------------------------");
                IO.println("El ganador es Gandolfus");
                IO.println("--------------------------------------");
            } else if (sumaG < sumaM){
                IO.println("--------------------------------------");
                IO.println("El ganador es Merlinus");
                IO.println("--------------------------------------");
            }

        }
    }
}
