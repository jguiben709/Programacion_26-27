package tema2.bucles;

public class Ejerciciodowhile {
    public static void main(String[] args) {
        
        //Usando do-while, pinta los números impares del 1 al 50

        //Iniciamos en el 1, y vamos sumando de dos en dos, para sacar los impares
        int numero = 1;
        do {
            IO.println(numero);
            numero += 2;
        } while (numero <= 50);


        //Sumando de uno en uno, y comprobando que el número es impar
        numero = 1;
        do {
            if (numero % 2 != 0) {
                IO.println(numero);
            }
            numero += 1;
        } while (numero <= 50);

    }
}