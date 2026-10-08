package tema1.ejerciciosclase;

public class Ejercicio2 {

    public static final double IVA = 0.21;
    
    public static void main(String[] args) {
        
        /*
            Hay que pedir por teclado el precio de un producto
            Debéis aplicarle el 21% de IVA y mostrar el nuevo precio
            Debéis aplicarle un descuento del 5% (sobre el precio con IVA) y mostrar el precio final
        
        */

        double descuento = 0.05; //5% equivale a multiplicar por 0.05
        double precio, precioFinal;

        precio = Double.parseDouble(IO.readln("Dime el precio del producto: "));   //String -> double
        IO.println("El precio sin IVA es: " + precio);

        precioFinal = precio * (IVA + 1); // (precio * IVA) + (precio * 1
        IO.println("El precio con IVA es: " + precioFinal);
        
        precioFinal = precioFinal - (precioFinal * descuento);
        System.out.printf("Precio final = %.2f %n",precioFinal);
        



    }
}
