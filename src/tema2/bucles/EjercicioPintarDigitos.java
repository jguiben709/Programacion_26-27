package tema2.bucles;

public class EjercicioPintarDigitos {

    static void main() {

        /*
        Pide un número por teclado
        Pinta cada uno de sus dígitos por separado. Da igual el orden.
        P.ej: 8569
            8
            5
            6
            9
        Pista: Hay que ir dividiendo entre 10, y quedándose con el resto de la
        división entre 10.

            8569 / 10 = 856   8569 % 10 = 9
            856 / 10 = 85     856 % 10 = 6
            85 / 10 = 8       85 % 10 = 5
            8 / 10 = 0        8 % 10 = 8
         */

        int numero;
        int digito;

        numero = Integer.parseInt(IO.readln("Dime un número: "));

        while (numero != 0) {
            digito = numero % 10;
            IO.println(digito);
            numero = numero / 10;
        }


    }
}
