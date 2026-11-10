package tema2.metodos;

public class Ejercicio1 {
    /**
     * Haz un ejercicio que muestre un menú con estas opciones:
     * 1. Es par
     * 2. Máximo de tres números
     * 3. Es primo
     * 4. Mostrar tabla multiplicar
     * 5. Factorial de un número
     * 6. Mostrar números impares entre dos números
     * 7. Salir
     */

    /**
     * Comprueba que el número es par
     * @param numero
     * @return booleano, true par, false impar
     */
    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        }
        return false;
    }

    /**
     * Pinta la tabla de multiplicar del número dado
     * @param numero
     */
    static void tablaMultiplicar(int numero) {
        for (int i=1; i <= 10; i++) {
            IO.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    /**
     * Dice si el número introducido es un número primo o no.
     * Busca un divisor distinto de 1 o de sí mismo, si lo
     * encuentra devuelve false, si no ha encontrado ninguno
     * devuelve true
     * @param numero
     * @return
     */
    public static boolean esPrimo(int numero) {
        //Si encontramos un divisor distinto de 1 y de sí mismo, devuelve false
        for(int i=2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Mayor de tres números
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    static int maximoTresNumeros(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    /**
     * Máximo de dos números
     * @param n1
     * @param n2
     * @return
     */
    static int maximoDosNumeros(int n1, int n2) {
        if (n1 >= n2)
            return n1;
        else
            return n2;
    }

    /**
     * Devuelve el factorial de un número
     * 7! -> 7*6*5*4*3*2*1
     * @param numero
     * @return
     */
    static double factorial(int numero) {
        double acumulador = 1.0;
        for(int i = numero; i > 0; i--) {
            acumulador = acumulador * i;
        }
        return acumulador;
    }

    static void numerosImpares(int n1, int n2) {
        int temp;
        if (n1 > n2) {
            //Intercambiar variable
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        for (int i = n1; i <= n2; i++) {
            if (i % 2 != 0) {
                IO.print(i + ", ");
            }
        }

        IO.println();
    }


    /**
     * Pinta las opciones del menú
     */
    static void pintarOpciones() {
        IO.println("1. Es par");
        IO.println("2. Máximo de tres números");
        IO.println("3. Es primo");
        IO.println("4. Tabla de multiplicar");
        IO.println("5. Factorial");
        IO.println("6. Impares en intervalo");
        IO.println("7. Salir");
    }

    static void main() {

        int opcion = Integer.MIN_VALUE;
        int numero;
        int n1, n2, n3;

        do {
            pintarOpciones();
            try {
                opcion = Integer.parseInt(IO.readln("Dime una opción: "));
            } catch (NumberFormatException ex) {
                IO.println("Dime un número del 1 al 7 como opción válida");
                continue;
            }

            try {

                switch (opcion) {
                    case 1 -> {
                        IO.println("--- ES PAR ---");
                        numero = Integer.parseInt(IO.readln("Dime un número: "));
                        if (esPar(numero)) {
                            IO.println("El número es par");
                        } else {
                            IO.println("El número es impar");
                        }
                    }
                    case 2 -> {
                        IO.println("--- MÁXIMO ---");
                        n1 = Integer.parseInt(IO.readln("Dime un número: "));
                        n2 = Integer.parseInt(IO.readln("Dime un número: "));
                        n3 = Integer.parseInt(IO.readln("Dime un número: "));
                        //IO.println("El mayor de los tres es " + maximoTresNumeros(n1, n2, n3));
                        IO.println("El mayor de los tres es " + maximoDosNumeros(maximoDosNumeros(n1, n2), n3));
                    }
                    case 3 -> {
                        IO.println("--- PRIMO ---");
                        numero = Integer.parseInt(IO.readln("Dime un número: "));
                        if (esPrimo(numero)) {
                            IO.println(numero + " es primo");
                        } else {
                            IO.println(numero + " no es primo");
                        }
                    }
                    case 4 -> {
                        IO.println("--- TABLA ---");
                        numero = Integer.parseInt(IO.readln("Dime un número: "));
                        tablaMultiplicar(numero);
                    }
                    case 5 -> {
                        //5! -> 5*4*3*2*1
                        IO.println("--- FACTORIAL ---");
                        numero = Integer.parseInt(IO.readln("Dime un número: "));
                        IO.println("Factorial de " + numero + " es " + factorial(numero));
                    }
                    case 6 -> {
                        IO.println("--- IMPARES EN UN INTERVALO ---");
                        n1 = Integer.parseInt(IO.readln("Dime un número: "));
                        n2 = Integer.parseInt(IO.readln("Dime un número: "));
                        numerosImpares(n1,n2);
                    }
                    case 7 -> {
                        IO.println("Hasta pronto");
                    }
                    default -> IO.println("Opción incorrecta");
                }

            } catch (Exception ex) {
                IO.println("Error " + ex.getMessage());
            }

        } while (opcion != 7);



    }
}
