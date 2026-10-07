package tema1;

public class EjemploLecturaTecladoV2 {
    public static void main(String[] args) {
        
        String nombre, apellidos, direccion;
        String numTelefono, codigoPostal;
        int edad;

        nombre = IO.readln("Dime tu nombre: ");
        apellidos = IO.readln("Dime tus apellidos: ");
        direccion = IO.readln("Dime tu dirección: ");
        edad = Integer.parseInt( IO.readln("Dime tu edad: ") ); //readln lee un String        
        numTelefono = IO.readln("Dime tu número de teléfono: ");
        codigoPostal = IO.readln("Dime tu código postal: ");

        IO.println("------------------------------------------------");
        IO.println("Nombre: " + nombre);
        IO.println("Apellidos: " + apellidos);
        IO.println("Dirección: " + direccion);
        IO.println("Edad: " + edad);
        IO.println("Número de teléfono: " + numTelefono);
        IO.println("Código postal: " + codigoPostal);

    }
}
