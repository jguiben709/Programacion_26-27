package tema1.ejerciciosclase;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
            La ficha de un producto tiene la siguiente información:
            - Nombre
            - Descripción
            - Precio
            - IVA (0.21, 0.10, ...)
            - Categoría
            - Stock en almacén

            Pide los valores por teclado y pinta la información lo mejor posible
        */

        String nombre, descripcion, categoria;
        int stock;
        double iva, precio;

        IO.println("--- INFORMACIÓN DE UN PRODUCTO ---");
        nombre = IO.readln("Dime el nombre: ");
        descripcion = IO.readln("Dime la descripción: ");
        precio = Double.parseDouble(IO.readln("Dime el precio: "));
        iva = Double.parseDouble(IO.readln("Dime el IVA: "));
        categoria = IO.readln("Dime la categoría: ");
        stock = Integer.parseInt(IO.readln("Dime el stock que hay: "));

        IO.println("--- PRODUCTO ---");
        IO.println("Nombre: " + nombre);
        IO.println("Descripción: " + descripcion);
        IO.println("Precio: " + precio);
        IO.println("IVA: " + iva);
        IO.println("Categoría: " + categoria);
        IO.println("Stock: " + stock);

    }
}
