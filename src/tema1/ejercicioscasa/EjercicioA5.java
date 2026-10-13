package tema1.ejercicioscasa;

public class EjercicioA5 {


    public static void main(String[] args) {
        
        int i = 5;
        i++; //i = 5
        IO.println(i); //i = 6?

        int x = i + 1;
        IO.println(x);

        //b es menor o igual que 25 pero mayor que 5
        //(b <= 25) && (b > 5)

        //c es mayor que 6 o igual a d
        //(c > 6) || (c == d)

        //e es par y menor que 50
        //(e % 2 == 0) && (e < 50)

        //f es mayor que a , que b y que c  
        //(f > a) && (f > b) && (f > c)

        String s1 = "Hola", s2 = "Hola", s3 = "Hola ";
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s4 = new String("Hola");
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4)); //Para comparar cadenas mejor usar equals


        double z;
        z = 100 / 0.0 + 1.0;
        IO.println(z);

        //Dividir enteros entre 0 -> ERROR
        //Dividir double entre 0.0 -> Infinity

        float pi = 3.1416F; // double -> float, no puedo convertir
        System.out.println(pi);

        short j = 1;
        char c = (char) ('A' + j);
        System.out.println(c);

    }
}
