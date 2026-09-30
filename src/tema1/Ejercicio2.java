package tema1;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        /*
            Un programa me da el cateto1 y el cateto2 de un triángulo
            Tienes que devolver la hipotenusa
            Truco -> Math.sqtr para calcular la raíz cuadrada

            (c1*c1) + (c2*c2) = (hip*hip)
        */

        //Variables de entrada
        double cateto1 = 3.5;
        double cateto2 = 2.3;

        //Variable de salida, el resultado
        double hipotenusa = 0.0;

        //hipotenusa = Math.sqrt( (cateto1*cateto1) + (cateto2*cateto2) );
        hipotenusa = Math.sqrt( Math.pow(cateto1, 2) + Math.pow(cateto2, 2) );
        IO.println("El resultado es: " + hipotenusa);


    }
    
}
