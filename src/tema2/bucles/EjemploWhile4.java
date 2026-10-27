package tema2.bucles;

public class EjemploWhile4 {
    public static void main(String[] args) {
        
        //Simula tirar una dado de 10 caras, 20 veces.

        int dado=0;
        int numTiradas=20;

        while(numTiradas > 0) {  //Ojo si ponemos >= 0 se ejecutaría 21 veces
            dado = (int) (Math.random() * (10 - 1 + 1)) + 1;
            IO.println("Tirada número: " + numTiradas + " es: " + dado);

            numTiradas -= 1;
        }


        


    }
}
