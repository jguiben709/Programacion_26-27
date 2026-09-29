package tema1;

public class FallosTipicos {

    public static void main(String[] args) {
        
        double resultado1 = 7 / 2;
        double resultado2 = 7.0 / 2.0;
        int resultado3 = (int) (7.0 / 2.0); //3.5 -> convertir a int -> 3
        int resultado4 = 7 / 2;

        IO.println(resultado1);
        IO.println(resultado2);
        IO.println(resultado3);
        IO.println(resultado4);

        double resultado5 = 0.1 + 0.2;
        double resultado6 = resultado5 + 0.40000000000000001;
        IO.println(resultado5);
        IO.println(resultado6);
    }
    
}
