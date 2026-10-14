package tema1.ejercicioscasa;

public class EjercicioC5 {

    public static void main(String[] args) {
        /*
        Calcula el área de la base y el volumen de un cilindro de 15,5 cm de diámetro y 42,4 cm de altura. Declara el diámetro y la altura como variables, y usa una constante para Pi ( final double PI = Math.PI; )

        Area de la base = pi * radio * radio
        */

        double diametro = 15.5, altura = 42.4;
        double radio = diametro / 2;
        final double PI = Math.PI;

        double areaBase = 0.0, volumen = 0.0;

        areaBase = PI * Math.pow( radio, 2);
        volumen = areaBase * altura;

        IO.println("El área de la base es: " + areaBase);
        IO.println("El volumen del cilindro es: " + volumen);



    }
}
