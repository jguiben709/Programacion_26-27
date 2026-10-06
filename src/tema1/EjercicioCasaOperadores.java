package tema1;

public class EjercicioCasaOperadores {

    public static void main(String[] args) {
        
        int x = 5;
        int y = 10;

        boolean resultado = (++x > 5) && (y-- < 10);
        // x = x + 1
        // (6 > 5)   true
        // (10 < 10) false
        // resultado -> (true) && (false) = false
        // x = 6
        // y = 9
        IO.println(resultado);
        IO.println("x: " + x + " y: " + y);


        int m = 4;
        int n = 7;
        
        resultado = !(m * 2 > n++) || (m + ++n == 13);
        //n = n + 1 -> 8
        //( 8 > 8) false
        //!(false) -> true
        //(4 + 8 == 13) false
        //resultado = true || false -> true
        //n = n + 1 -> 9
        //m = 4
        //n = 9
        IO.println(resultado);
        IO.println("n: " + n + " m: " + m);


    }
}
