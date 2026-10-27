package tema2.bucles;

public class EjemploDoWhile {
    public static void main(String[] args) {
        
        //Números del 1 al 10
        int numero = 0;
        do {
            numero = numero + 1;            
            IO.println(numero);            
        } while (numero < 10);

        numero = 1;
        do {
            IO.println(numero);            
            numero = numero + 1;
        } while (numero <= 10);

    }
}
