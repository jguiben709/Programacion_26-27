package tema1;

import java.util.Scanner;

public class EjemploScanner {

    public static void main(String[] args) {
        
        //Leer de teclado (System.in)
        Scanner sc = new Scanner(System.in);

        String linea;
        int numero;
        int altura;
        double peso;

        //IO.println("Introduce algo por teclado: ");
        //linea = sc.nextLine(); //Lee por teclado hasta que le das a Enter
        //IO.println("Lo que has escrito por teclado es: " + linea);

        //IO.println("Dime tu altura: ");
        //numero = sc.nextInt();
        //IO.println("Tu altura es: " + numero);

        //IO.println("Dime tu peso: ");
        //peso = sc.nextDouble();
        //IO.println("Tu peso es: " + peso);

        IO.println("Dime tu altura");
        String alturaCadena = sc.nextLine();
        altura = Integer.parseInt(alturaCadena);
        //altura = Integer.parseInt(sc.nextLine());
        IO.println("La altura es: " + altura);
        altura++;
        IO.println("Has crecido, la altura es: " + altura);

        sc.close();
    }
    
}
