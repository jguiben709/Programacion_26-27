package tema1.ejercicioscasa;

public class EjercicioA3 {
    public static void main(String[] args) {
        
        //Caracteres se representan en código ASCII
        System.out.println('A' + 1);

        char letra = ('A' + 1); //Suma 65 + 1
        IO.println(letra);

        //+ en cadenas lo que hace es concatenar cadenas
        System.out.println("" + 'A' + 1); // "" + "A" + "1"

        char letrita = 68;
        IO.println(letrita);
        letrita = 'X';
        IO.println(letrita);

        int letraInt = 'Z';
        IO.println(letraInt);

        //Curiosidad - pintar todos los códigos ascii
        char i = 1;
        while(true) {
            IO.print(i++);
        }

    }
}
