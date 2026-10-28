package tema2.bucles;

public class EjemploWhile6 {
    public static void main(String[] args) {
        //Ojo donde ponemos el decremento, delante o detrás

        int conta = 100;
        do {
            IO.print(conta-- + "\t");
        } while (conta >= 1);

        conta = 101;
        do {
            IO.print(--conta + "\t");
        } while (conta > 1);


    }
}
