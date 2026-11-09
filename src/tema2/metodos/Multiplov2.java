package tema2.metodos;

public class Multiplov2 {

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

        if (esMultiplo(Integer.parseInt(IO.readln("Dime un número:")),
                Integer.parseInt(IO.readln("Dime un número:")))) {
            IO.println("Son múltiplos");
        } else {
            IO.println("NO son múltiplos");
        }

    }
}
