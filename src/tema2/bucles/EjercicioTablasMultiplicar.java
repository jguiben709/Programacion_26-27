package tema2.bucles;

public class EjercicioTablasMultiplicar {
    static void main() {

        /*
        Muestra todas las tablas de multiplicar del 1 al 10
         */
        int numero=0;

        for(numero=1; numero<=10; numero++) {
            for (int i = 1; i <= 10; i++) {
                IO.println(numero + " x " + i + " = " + (numero * i));
            }
        }


    }
}
