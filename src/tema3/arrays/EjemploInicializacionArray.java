package tema3.arrays;

public class EjemploInicializacionArray {
    static void main() {
        //Dime el total de lo que valen los productos

        double[] precios = { 10.25, 95.99, 35.90, 120.55 };
        String[] producto = { "Conector USBC" , "Teclado Logit", "Ratón Logit", "Nvidia 1080" };
        double acumulador = 0.0;

        for(int i=0; i < precios.length; i++) {
            //IO.println("Precio " + (i+1) + ":  " + precios[i]);
            IO.println(producto[i] + " - " + precios[i] + "€");
            acumulador += precios[i];
        }

        IO.println("El total de tu compra es: " + acumulador + "€");

    }
}
