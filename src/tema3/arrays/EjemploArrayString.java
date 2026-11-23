package tema3.arrays;

public class EjemploArrayString {
    static void main() {

        String[] palabras = new String[5];

        for(int i=0; i < palabras.length; i++) {
            palabras[i] = IO.readln("Dime una palabra: ");
        }

        //Pintamos las palabras al revés que me le has dado
        for(int i= palabras.length-1; i>=0; i--) {
            IO.println(palabras[i]);
        }

    }
}
