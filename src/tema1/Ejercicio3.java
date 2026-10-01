package tema1;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        /*
            Tengo dos balones en casa uno de fútbol y otro de baloncesto
            El balón de fútbol tiene radio 11 cm
            El balón de baloncesto tiene radio de 12 cm
            Calcula el volumen de cada uno y dime cuál tiene mayor volumen.
            Pista: para sacar el máximo: Math.max
            Cuatro tercios * PI * radio al cubo
        */

        int radioFutbol = 11;
        int radioBasket = 12;
        double volumenFutbol = 0.0;
        double volumenBasket = 0.0;
        double volumenMaximo = 0.0;

        volumenFutbol = (4.0 * Math.PI * Math.pow(radioFutbol,3)) / 3;
        volumenBasket =  (4.0 / 3.0) * Math.PI * Math.pow(radioBasket,3);

        IO.println("El volumen del balón de fútbol es: " + volumenFutbol);
        IO.println("El volumen del balón de basket es: " + volumenBasket);

        //Math.max devuelve el máximo de dos números (int, double, ...)
        volumenMaximo = Math.max(volumenFutbol, volumenBasket);
        IO.println("El volumen mayor de los dos es: " + volumenMaximo);

        

            



    }
    
}
