package tema3.arrays;

public class Ejercicio4 {
    static void main() {

        int[] numeros = { 1, 2, 2, 4, 5, 2, 7, 7, 9, 1 };

        //Cuántas veces sale el número 2
        int numero = 7; //El que busco
        int contador = 0;

        //Recorrer array
        for(int i=0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                contador++;
            }
        }

        IO.println("El número " + numero + " aparece " + contador + " veces");





    }
}
