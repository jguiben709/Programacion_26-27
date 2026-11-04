package tema2.bucles;

public class EjercicioContarNumDigitos {
    static void main() {

        /*
        Pide un número por teclado y dime el número de dígitos que tiene
        P.ej: 8569  -> tiene 4 dígitos
              125   -> tiene 3 dígitos
              59869 -> tiene 5 dígitos

        Pista: dividir entre 10
            8569 / 10 = 856
            856 / 10 = 85
            85 / 10 = 8
            8 / 10 -> no cabe
         */

        int numero;
        int contador = 0;

        numero = Integer.parseInt(IO.readln("Dime un número: "));

        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }

        IO.println("El número de dígitos es: " + contador);





    }
}
