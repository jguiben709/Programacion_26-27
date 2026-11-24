package tema3.arrays;

public class Ejercicio2 {
    static void main() {

        //Definir array
        int[] numeros = new int[10];

        //Lo rellenamos con números pedidos por teclado
        for(int i=0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(IO.readln("Dime un número: "));
        }

        //Recorrer en orden inverso
        for(int i=numeros.length-1; i>=0; i--) {
            IO.print(numeros[i] + ", ");
        }



    }
}
