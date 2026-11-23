package tema3.arrays;

public class CopiaArrays {
    static void main() {

        int[] numeros = { 5, 6, 1, 3, 9 };
        int[] otros = new int[5];

        //Qué pasa aquí? --> Que comparten posición de memoria, si cambio uno
        //se cambia el otro. SON EL MISMO ARRAY CON DOS NOMBRES DIFERENTES
        otros = numeros;

        numeros[2] = 69;

        for(int i=0; i < otros.length; i++) {
            IO.println(otros[i]);
        }

        for(int i=0; i < numeros.length; i++) {
            IO.println(numeros[i]);
        }







    }
}
