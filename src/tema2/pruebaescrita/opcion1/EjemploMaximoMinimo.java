package tema2.pruebaescrita.opcion1;

public class EjemploMaximoMinimo {
    static int generarNumero(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    static void main() {
        int numero=0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for(int i=1; i <= 100; i++) {
            numero = generarNumero(-500, 500);
            //IO.println(numero);

            if (numero > maximo) {
                maximo = numero;
                //IO.println("Max " + maximo);
            }

            if (numero < minimo) {
                minimo = numero;
                //IO.println("Min " + minimo);
            }
        }

        IO.println("El máximo es: " + maximo);
        IO.println("El minimo es: " + minimo);


    }
}
