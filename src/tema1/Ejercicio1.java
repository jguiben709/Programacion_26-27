package tema1;

public class Ejercicio1 {
    
    public static final double IVA = 0.21;

    public static void main(String[] args) {
        
        /*
            Nos dan el precio sin IVA de un coche -> 40000€
            Tenemos primero que mostrar el precio con IVA
            Nos dicen que hay un descuento sobre el precio con IVA de 3500€ del Plan Auto
            Nos dicen que hay un descuento extra del concesionario sobre el precio con IVA de 1500€

            ¿Cuánto le tengo que pagar al concesionario para llevarme el coche?
        */

        double precioSinIva = 40000.0;
        double precioConIva = 0.0;
        double descuentoAuto = 3500.0;
        double descuentoExtra = 1500.0;
        double resultado = 0.0;

        precioConIva = precioSinIva + (precioSinIva * IVA);
        IO.println("Precio con IVA " + precioConIva); 

        resultado = precioConIva - descuentoAuto - descuentoExtra;
        IO.println("Precio final " + resultado);









    }
}
