package tema1;

public class EjemploLecturaEscritura {
    public static void main(String[] args) {
        
        //IO.println();
        //IO.readln();

        //SALIDA estándar = System.out
        IO.println("Mensaje");

        System.out.print("Texto ");
        System.out.println("Mensaje");
        //System.err.println("Error");

        String nom1 = "Teclado Corsair", nom2 = "Monitor AoC 27'", nom3 = "Ratón Logitech";
        double precio1 = 19.9567, precio2 = 45.3456, precio3 = 12.66666;
        int cant1 = 3, cant2 = 2, cant3 = 5;
        double total;

        //Precio1 - Cantidad1 = (precio1 * cantidad1)
        //Precio2 - Cantidad2 = (precio2 * cantidad2)
        //Precio3 - Cantidad3 = (precio3 * cantidad3)

        total = (precio1 * cant1) + (precio2 * cant2) + (precio3 * cant3);
        System.out.printf("%s %.2f -> %d = %.2f%n",nom1, precio1, cant1, (precio1 * cant1));
        System.out.printf("%s %.2f -> %d = %.2f%n",nom2, precio2, cant2, (precio2 * cant2));
        System.out.printf("%s %.2f -> %d = %.2f%n",nom3, precio3, cant3, (precio3 * cant3));
        System.out.printf("Total = %.2f%n", total);
        

    }
}
