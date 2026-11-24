package tema3.arrays;

public class Ejercicio5 {
    static void main() {

        //Capicúa: que se lee igual de derecha izquierda que de izquierda a derecha
        int[] numeros = { 1, 2, 2, 4, 5, 5, 3, 2, 2, 1 };
        boolean esCapicua=true;

        for(int i=0; i < numeros.length / 2; i++) {
            IO.println(numeros[i]);
            if (numeros[i] != numeros[numeros.length - 1 - i]) {
                esCapicua = false;
                break;
            }
        }

        IO.println("Es capicúa? " + esCapicua);


    }
}
