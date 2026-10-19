package tema2;

public class Ejercicioclase1 {
    public static void main(String[] args) {
        
        /*
            Tenemos un personaje de videojuego con dos propiedades
            - armadura -> int
            - vida -> int

            Si el personaje tiene armadura mayor que cero aunque no tenga vida, sobrevive
            Si el personaje no tiene armadura pero la vida es igual o menor a cero muere

            Pide por teclado la vida del personaje y si tiene armadura o no
            Y escribe si un programa que diga si está vivo o Game Over
        */

        //Paso 1. declarar variables. Entrada (pedir datos), Salida (resultado)
        //Paso 2. pensar los casos posibles y programarlo
        //Paso 3. pintar el resultado

        int armadura=0, vida=0;
        boolean resultado = false;

        armadura = Integer.parseInt(IO.readln("Dime el nivel de armadura: "));
        vida = Integer.parseInt(IO.readln("Dime la vida del personaje: "));
/*
        if (armadura > 0) {
            resultado = true;
        } else if (vida > 0) {
            resultado = true;
        } else {
            resultado = false;
        }
*/
        if (armadura > 0 || vida > 0) {
            resultado = true;
        } else {
            resultado = false;
        }


        if (resultado) {    
            IO.println("Está vivo");
        } else {
            IO.println("Está muerto");
        }

        






    }
}
