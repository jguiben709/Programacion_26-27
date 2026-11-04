package tema2.bucles;

public class EjercicioNumeroArmstrong {
    static void main() {

        /*
        Se dice que un número es de Armstrong si es igual a la suma de sus dígitos
        elevados al número de dígitos.

        Ej: 153 = (1 elevado a 3) + (5 elevado a 3) + (3 elevado a 3)

            contador = número de dígitos
            acumulador += (1 elevado a contador) + (5 elevado a contador) + (3 elevado a contador)
            booleano -> (numero == acumulador)

        Contador: para sacar el número de dígitos
        Acumulador: Para sumar en una variable cada (dígito elevado a numero de dígitos)
        Booleano al final para saber si es o no número de armstrong
         */

        int numero, numeroTeclado;
        int contador = 0;
        int digito;
        int acumulador = 0;

        numeroTeclado = Integer.parseInt(IO.readln("Dime un número: "));

        numero = numeroTeclado;
        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }

        IO.println("El número de dígitos es: " + contador);

        numero = numeroTeclado;
        while (numero != 0) {
            digito = numero % 10;

            acumulador += Math.pow(digito, contador);

            IO.println(digito);
            numero = numero / 10;
        }

        IO.println("La suma es: " + acumulador);

        if (numeroTeclado == acumulador) {
            IO.println("Es un número de Armstrong");
        } else {
            IO.println("No es un número de Armstrong");
        }

    }
}
