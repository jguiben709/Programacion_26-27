package tema2.bucles;

public class EjercicioDoWhileCadenas {
    public static void main(String[] args) {
        
        /*
            Tenemos un sistema de login, pide usuario y contraseña, suponemos que los valores válidos que debe introducir son:
            - usuario: javgui709
            - password: 69696969

            El sistema te da tres intentos para introducir la contraseña, sino, termina y no te deja seguir
        */

        String usuarioBD = "javgui709";
        String passwordBD = "69696969"; 

        String usuario, password;
        int numIntentos = 3;
        boolean accesoConcedido = false;

        //1. En un bucle hay que pedir por teclado usuario y password
        //2. Comprobar que coinciden con lo que hay en BD, boolean accesoConcedido
        //3. Si no coincide gastamos un intento
        //4. El programa termina si hemos gastado los intentos o si has acertado usuario y password

        do {
            usuario = IO.readln("Dime el usuario: ");
            password = IO.readln("Dime el password: ");

            if (usuario.equals(usuarioBD) && password.equals(passwordBD)) {
                accesoConcedido = true;
                IO.println("Bienvenido");
            } else {
                numIntentos = numIntentos - 1;
                IO.println("Error en las credenciales");                
            }

        } while (numIntentos > 0 && accesoConcedido == false);

        //A nivel informativo comprobar que se ha salido porque no tiene más intentos
        if (numIntentos == 0) {
            IO.println("No te quedan más intentos, hasta dentro de un rato");
        }





    }
}
