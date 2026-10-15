package tema2;

public class Ejemplo3 {
    public static void main(String[] args) {
        
        //Pide un número por teclado y dime si es positivo o negativo

        int numero=0;

        numero = Integer.parseInt(IO.readln("Dime un número "));
/*
        if (numero >= 0) {
            IO.println("Es positivo");
        } else {
            IO.println("Es negativo");
        }
*/
        if (numero >= 0) {
            IO.println("Es positivo");
        }
        if (numero < 0) {
            IO.println("Es negativo");
        }




    }
}
