package tema1;

public class EjercicioOperadores {

    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;

        int resultado = ++a * --b - a;
        //Dime antes de ejecutar que vale resultado, a y b

        // a = a + 1  6
        // a * b      60
        // - a        60 - 6 = 54

        IO.println(resultado);
        IO.println(a);
        IO.println(b);



    }
}
