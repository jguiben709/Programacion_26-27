package tema1;

//Importar otras clases
public class PrimeraClase {

    /* 
        Aquí podemos poner funciones que llamaremos después
        Variables de la clase
    */


    //Lo que se va a ejecutar
    public static void main(String[] args) {
    
        //TODAS LAS VARIABLES ME LAS DEFINO ARRIBA
        int edad; //Crear una variable llamada edad, de tipo entero
        double precioConIVA; //Crea una variable llamada precio, de tipo decimal
        double precioSinIVA;
        boolean gratis; //true o false, no puede tener otro valor

        //int int; No se les puede poner como nombre una palabra reservada de Java

        edad = 25; //Guardamos el valor 25 en la variable edad
        edad = 33;

        gratis = true;

        precioSinIVA = 99.99;
        precioConIVA = precioSinIVA * 1.21; //Le aplicamos el IVA del 21% al precio

        IO.println("La edad es " + edad);
        IO.println("El precio sin IVA es " + precioSinIVA);
        IO.println("El precio con IVA es " + precioConIVA);

        //Cliente especial, descuento del 2% al precio con IVA
        precioConIVA = precioConIVA * 0.98;
        IO.println("El precio con IVA y un 2% de descuento es " + precioConIVA);

        gratis = false; 
        IO.println("¿Es gratis? " + gratis);
        

        
    

    }
    

}

//Nada de nada
