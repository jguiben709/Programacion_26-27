package tema1;

public class EjemploOperadoresRelacionales {

    public static void main(String[] args) {
        
        int precio = 125;
        String password = "12345678";
        boolean res = false;

        //Dime si el precio es > que 100
        //Dime si el precio es >= que 130
        //Dime si el precio es < 100
        //Dime si el precio es <= que 125

        res = (precio > 100);
        IO.println(res); //true
        res = (precio >= 130);
        IO.println(res); //false
        res = (precio < 100);
        IO.println(res); //false
        res = (precio <= 125);
        IO.println(res); //true


        //Dime si la contraseña es igual a 12345678 o no
        boolean igual = (password == "12345678");
        IO.println(igual); //true
        igual = (password.equals("12345678"));
        IO.println(igual); //true




    }
    
}
