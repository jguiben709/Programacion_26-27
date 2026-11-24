package tema3.arrays;

import java.util.Arrays;

public class Ejercicio1 {
    static void main() {

        //Definir array
        int[] numeros = new int[10];
        int maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;
        double acumulador = 0.0;

        //Lo rellenamos con números pedidos por teclado
        for(int i=0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(IO.readln("Dime un número: "));
        }

        //Lo pintamos
        IO.println(Arrays.toString(numeros));

        for(int i=0; i < numeros.length; i++) {
            //Media
            acumulador += numeros[i];

            //Máximo
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }

            //Mínimo
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        
        IO.println("El máximo es: " + maximo);
        IO.println("El mínimo es: " + minimo);
        IO.println("La media es: " + (acumulador / numeros.length));
    }
}
