package tema1.ejercicioscasa;

import java.time.*;

public class EjercicioC6 {
    public static void main(String[] args) {
        
        //int n = (int) (Math.random() * (maximo - minimo + 1)) + minimo;

        //Un entero positivo aleatorio entre 1 y 49
        int numero = 0;

        numero = (int) (Math.random() * (49 - 1 + 1)) + 1;
        //IO.println(numero);

        double real = 0.0;
        real = (Math.random() * (9 - 0 + 1)) + 0;
        IO.println(real);

        numero = (int) (Math.random() * (-50 - (-150) + 1)) + (-150);
        IO.println(numero);

        numero = (int) (Math.random() * (100 - (-100) + 1)) + (-100);
        IO.println(numero);

        numero = (int) (Math.random() * (12 - (1) + 1)) + (1);
        IO.println(Month.of(numero));

        
        int letra = 'J';
        IO.println(letra);

        //a³b / (2ab²) − √(12d⁴)
        double a=2.0, b=3.0, d=2.0;
        double resultado = (Math.pow(a,3) * b) / (2 * a * Math.pow(b,2)) - 
                           Math.sqrt(12 * Math.pow(d,4));
        IO.println(resultado);
    }
}
