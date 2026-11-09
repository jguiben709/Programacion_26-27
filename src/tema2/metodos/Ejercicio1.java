package tema2.metodos;

public class Ejercicio1 {
    /**
     * Haz un ejercicio que muestre un menú con estas opciones:
     * 1. Es par
     * 2. Máximo de tres números
     * 3. Es primo
     * 4. Mostrar tabla multiplicar
     * 5. Salir
     */

    /**
     * Pinta las opciones del menú
     */
    static void pintarOpciones() {
        IO.println("1. Es par");
        IO.println("2. Máximo de tres números");
        IO.println("3. Es primo");
        IO.println("4. Tabla de multiplicar");
        IO.println("5. Salir");

    }

    static void main() {

        int opcion = Integer.MIN_VALUE;
        int numero;
        int n1, n2, n3;

        do {
            pintarOpciones();
            opcion = Integer.parseInt(IO.readln("Dime una opción: "));

            switch (opcion) {
                case 1 -> {
                    IO.println("--- ES PAR ---");
                    numero = Integer.parseInt(IO.readln("Dime un número"));
                }
                case 2 -> {
                    IO.println("--- MÁXIMO ---");
                }
                case 3 -> {
                    IO.println("--- PRIMO ---");
                }
                case 4 -> {
                    IO.println("--- TABLA ---");
                }
                case 5 -> {
                    IO.println("Hasta pronto");
                }
                default -> IO.println("Opción incorrecta");
            }

        } while (opcion != 5);



    }
}
