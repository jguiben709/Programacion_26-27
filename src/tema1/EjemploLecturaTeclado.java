package tema1;

import java.util.Scanner;

public class EjemploLecturaTeclado {
    public static void main(String[] args) {
        
        String nombre, apellidos, direccion;
        String numTelefono, codigoPostal;
        int edad;

        Scanner sc = new Scanner(System.in);

        IO.println("Dime tu nombre: ");
        nombre = sc.nextLine();
        IO.println("Dime tus apellidos: ");
        apellidos = sc.nextLine();
        IO.println("Dime tu direccion: ");
        direccion = sc.nextLine();
        IO.println("Dime tu edad: ");
        edad = Integer.parseInt(sc.nextLine()); //Leemos un String, y lo convertimos a int
        
        //edad = sc.nextInt();
        //sc.nextLine(); //Arreglar que nextInt no coge el salto de línea

        IO.println("Dime tu número de teléfono: ");
        numTelefono = sc.nextLine();
        IO.println("Dime tu código postal: ");
        codigoPostal = sc.nextLine();

        //------------------------
        IO.println("-----------------------------");

        IO.println("Nombre: " + nombre);
        IO.println("Apellidos: " + apellidos);
        IO.println("Dirección: " + direccion);
        IO.println("Edad: " + edad);
        IO.println("Número de teléfono: " + numTelefono);
        IO.println("Código postal: " + codigoPostal);



    }
}
