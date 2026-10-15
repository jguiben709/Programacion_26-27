package tema1.ejercicioscasa;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        /*
        Pide al usuario dos números y muestra la “distancia” entre ellos (el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).
        */

        int numA = 0, numB = 0;
        int distancia = 0;

        numA = Integer.parseInt(IO.readln("Dime el primer número: "));
        numB = Integer.parseInt(IO.readln("Dime el segundo número: "));

        distancia = Math.abs(numA - numB);
        IO.println("La distancia entre " + numA + " y " + numB + " es " + distancia);

    }
}
