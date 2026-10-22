package tema2;

public class EjercicioClase1 {
    public static void main(String[] args) {
        
        /*
            Nos piden comprobar un usuario y una contraseña.
            El usuario es fijo "usuario"
            Guardamos la contraseña en una variable como "12345678"
            Pedimos el usuario por teclado
            Pedimos la contraseña por teclado
            Si coinciden el usuario y la contraseña con los que tenemos guardado:
            - "Credenciales correctas, bienvenido"
            Si no
            - "Credenciales incorrectas"
    
        */

        String user = "usuario";
        String password = "12345678";
        String userNew;
        String passwordNew;

        userNew = IO.readln("Dime tu usuario: ");
        passwordNew = IO.readln("Dime tu contraseña: ");

        if (user.equals(userNew) && password.equals(passwordNew)) {
            IO.println("Credenciales correctas");
        } else {
            IO.println("Credenciales incorrectas");
        }
        

    }
}
