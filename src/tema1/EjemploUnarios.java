package tema1;

public class EjemploUnarios {

    public static void main(String[] args) {
        
        int a = 5, b = 3;
        int c;

        c = a++ - b;
        IO.println(c); //2

        //c = a - b
        //a = a + 1

        c = ++a - b;
        IO.println(c); //4
        //a = a + 1
        //c = a - b



    }
}
