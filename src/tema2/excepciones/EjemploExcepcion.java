package tema2.excepciones;

public class EjemploExcepcion {
    static void main() {

        try {
            int edad = Integer.parseInt(IO.readln("Introduce tu edad: "));
            IO.println("Naciste sobre " + (2026 - edad));
        } catch (NumberFormatException e) {
            IO.println("Eso no es un número entero");
        }



    }
}
