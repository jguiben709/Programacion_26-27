package tema2.bucles;

public class EjercicioTablaMultiplicar {
    static void main() {

        /*
        Pedir un número por teclado y mostrar su tabla de multiplicar
        3 x 1 = 3
        3 x 2 = 6
        ...
        3 x 10 = 30
        */

        int numero=0;

        numero = Integer.parseInt(IO.readln("Dime un número: "));
        for(int i=1; i <= 10; i++) {
            IO.println(numero + " x " + i + " = " + (numero * i));
        }



    }

}
