package tema2.bucles;

public class EjemploFor1 {
    public static void main(String[] args) {
        
        //Números del 1 al 10
        for(int numero = 1; numero <= 10; numero++) {
            IO.println(numero);            
        }

        //Números del 10 al 1
        for(int numero = 10; numero >= 1; numero--) {
            IO.println(numero);
        }

        //Números impares del 1 al 10
        for(int numero=1; numero <= 10; numero += 2) {
            IO.println(numero);
        }
        for(int numero=1; numero <= 10; numero++) {
            if (numero % 2 != 0) {
                IO.println(numero);
            }
        }

        //Números múltiplos de 5 del 1000 al 500
        for(int numero=1000; numero >= 500; numero -= 5) {
            IO.println(numero);
        }
        for(int numero=1000; numero >= 500; numero -= 1) {
            if (numero % 5 == 0) {
                IO.println(numero);
            }
        }
        

    }
}
