package tema2.bucles;

public class EjemploMenu {
    public static void main(String[] args) {
        
        //Vamos a crear un menú con 4 opciones
        //1. Consultar saldo
        //2. Depositar dinero
        //3. Saludar al director
        //4. Salir

        //Variables saldo y ingreso
        double saldo = 5500.0;
        double ingreso = 0.0;

        //Inicializo la opción a un valor que no entra en las opciones del menú
        int opcion=0;
        do {
            //Pintar las posibles opciones
            IO.println("1. Consultar saldo");
            IO.println("2. Depositar dinero");
            IO.println("3. Saludar al director");
            IO.println("4. Salir");

            //Pedir por teclado la opción
            opcion = Integer.parseInt( IO.readln("Elige una opción (1-4):") );

            //Dependiendo de la opción seleccionada hacemos una cosa u otra
            switch (opcion) {
                case 1 -> {
                    IO.println("Tu saldo es de " + saldo + " euros");
                }
                case 2 -> {
                    ingreso = Double.parseDouble(IO.readln("Cuánto quieres ingresar?"));
                    saldo = saldo + ingreso;
                }
                case 3 -> {
                    IO.println("Hola qué tal todo, ¿mi dinero está creciendo?");
                }
                case 4 -> {
                    IO.println("Hasta otro día, me voy que tengo la comida en el horno");
                }
                default -> {
                    IO.println("Opción incorrecta, elige entre 1, 2, 3, 4");
                }
            }
        } while (opcion != 4); //Se repita hasta que la opción es la de salida



    }
}
