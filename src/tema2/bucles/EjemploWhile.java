package tema2.bucles;

public class EjemploWhile {
    public static void main(String[] args) {
        

        int numero = 10;
        while( numero >= 1) {
            IO.println(numero);
            numero = numero - 1; //numero -= 1    numero--
        }

        numero = 1;
        while( numero <= 10) {
            IO.println(numero);
            numero = numero + 1; //numero += 1    numero++
        }



    }
}
