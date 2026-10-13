package tema1.ejercicioscasa;

public class EjercicioA1 {

    public static void main(String[] args) {
        int A = 6, B = 2, C = 3;
        IO.println(A % (A * B * C / (B + C)));

        System.out.println(5.0 / 0);
        System.out.println(0.1 + 0.2);

        IO.println(Math.ceil(3.99)); //Ceil redondea hacia arriba
        IO.println(Math.floor(3.99)); //Floor redondea hacia abajo

        IO.println((int) 3.99);
        System.out.println(Math.round(-3.5)); //Math.round rendondea al más cercano
        System.out.println(Math.round(  3.5)); //Math.round rendondea al más cercano

        
    }
    
    
}
