package tema2.bucles;

public class EjemploWhile5 {
    public static void main(String[] args) {
        //Pide una palabra por teclado hasta que digas "peligro"

        String palabra="";

        while (!palabra.equals("peligro")) {
            palabra = IO.readln("Dime una palabra:").toLowerCase();
        }




    }
}
