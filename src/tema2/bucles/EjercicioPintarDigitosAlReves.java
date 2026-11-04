package tema2.bucles;

public class EjercicioPintarDigitosAlReves {

    static void main() {

        /*
        Pide un número por teclado
        Pinta cada uno de sus dígitos por separado. NO DA IGUAL EL ORDEN
        P.ej: 8569
            8
            5
            6
            9

        Para sacar por qué tengo que empezar a dividir:
        10 * (numDigitos-1)

            8569 / 1000 = 8   8569 % 1000 = 569
            569 / 100 = 5     569 % 100 = 69
            69 / 10 = 6       69 % 10 = 9 * (el último dígito es este resto)

         */

        int numeroTeclado, numero;
        int contador = 0;
        int divisor, digito;

        numeroTeclado = Integer.parseInt(IO.readln("Dime un número: "));

        numero = numeroTeclado;
        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }

        divisor = (int) Math.pow(10, (contador-1));

        IO.println("Tengo que empezar a dividir entre: " + divisor);

        numero = numeroTeclado;
        while (numero > 10) {
            digito = numero / divisor;
            IO.println("Dígito: " + digito);
            numero = numero % divisor;
            divisor = divisor / 10;
        }

        IO.println("Dígito: " + numero);
        
    }
}
