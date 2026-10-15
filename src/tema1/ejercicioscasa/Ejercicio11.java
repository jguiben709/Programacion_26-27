package tema1.ejercicioscasa;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        int numero = 91;
        int unidades = 0, decenas = 0;
        int resultado = 0;

        decenas = numero / 10; //redondea
        unidades = numero % 10; //el resto de la división son las unidades

        resultado = (unidades * 10) + decenas;

        IO.println("El número " + numero + " al revés es " + resultado);


    }
}
