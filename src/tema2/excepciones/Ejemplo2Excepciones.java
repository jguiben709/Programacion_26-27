package tema2.excepciones;

public class Ejemplo2Excepciones {

    static int division(int n1, int n2) throws DivisionPorZeroException{
        if (n2 == 0) {
            throw new DivisionPorZeroException("El segundo argumento no puede ser cero");
        } else {
            return n1 / n2;
        }
    }


    static void main() {

        int numero=0;
        String texto = "Buenas noches";

        try {
            numero = Integer.parseInt(IO.readln("Dime un número "));
            IO.println("La raíz cuadrada de " + numero + " es " + Math.sqrt(numero));
            IO.println("100 dividido " + numero + " es " + division(100,0));
            IO.println(texto.charAt(0));
            IO.println(texto.charAt(7));
            IO.println(texto.charAt(25));

        } catch (NumberFormatException ex) {
            IO.println("No has introducido un número válido");
        } catch (ArithmeticException ex) {
            IO.println("Error: " + ex.getMessage());
        } catch (Exception ex) { //El más general
            IO.println("Error general: " + ex.getMessage());
        }

        IO.println("El programa termina ok.");





    }
}
