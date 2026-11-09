package tema2.metodos;

public class Multiplo {

    /**
     * Devuelve si un número es múltiplo del otro
     * @param numA
     * @param numB
     * @return
     */
    static boolean esMultiplo(int numA, int numB) {
        //Ver si el resto de la división es cero
        if (numA % numB == 0) {
            return true; //Acaba el metodo
        } else if (numB % numA == 0) {
            return true;
        } else {
            return false;
        }
    }



    // ------------------------------------------------
    static void main() {
        int n1, n2;
        boolean resultado;

        n1 = Integer.parseInt(IO.readln("Dime un número:"));
        n2 = Integer.parseInt(IO.readln("Dime un número:"));

        resultado = esMultiplo(n1, n2);

        if (resultado) {
            IO.println("Son múltiplos: " + n1 + ", " + n2);
        } else {
            IO.println("NO son múltiplos: " + n1 + ", " + n2);
        }

    }
}
