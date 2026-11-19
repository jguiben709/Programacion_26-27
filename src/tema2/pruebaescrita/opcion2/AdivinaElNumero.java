package tema2.pruebaescrita.opcion2;

public class AdivinaElNumero {

    static int generarNumero(int min, int max) {
        return (int) (Math.random() * (max - (min) + 1)) + min;
    }

    static void main() {
        int numAAdivinar;
        int intentos=7;
        int numeroJugador=0;
        boolean gana=false;

        numAAdivinar = generarNumero(1, 50);
        //IO.println("Hay que adivinar el número: " + numAAdivinar);

        while (intentos > 0) {
            //PEDIMOS AL USUARIO QUE NOS DIGA UN NÚMERO PARA VER SI ACIERTA
            try {
                numeroJugador = Integer.parseInt(IO.readln("Dime un número a ver si es: "));
            } catch (NumberFormatException ex) {
                IO.println("No me has dicho un número, lo siento");
            }

            //COMPROBAMOS SI ACIERTA, EN CUYO CASO NOS SALIMOS
            if (numeroJugador == numAAdivinar) {
                IO.println("GANASTE");
                gana = true;
                break; //Termina
            }

            //VEMOS SI EL NÚMERO ESTÁ EN EL RANGO
            if (numeroJugador < 1 || numeroJugador > 50) {
                IO.println("No has dicho un número entre 1 y 50");
            } else {
                    //INDICAMOS SI ES MAYOR O MENOR
                    if (numeroJugador > numAAdivinar) {
                        IO.println("El número a adivinar es menor");
                    } else {
                        IO.println("El número a adivinar es mayor");
                    }

                    //INDICAMOS SI ESTAMOS CERCA O LEJOS
                    if (Math.abs(numAAdivinar - numeroJugador) > 10) {
                        IO.println("Frío frío");
                    } else if ( (Math.abs(numAAdivinar - numeroJugador) >= 5) &&
                            (Math.abs(numAAdivinar - numeroJugador) <= 10) ) {
                        IO.println("Calentito");
                    } else if (Math.abs(numAAdivinar - numeroJugador) < 5) {
                        IO.println("Te estás quemando");
                    }
            }

            intentos--;
            IO.println("Te quedan " + intentos + " intentos");
        }

        //SI TERMINA EL BUCLE CON LOS INTENTOS Y NO HA GANADO ES QUE HA PERDIDO
        if (!gana) {
            IO.println("Lo siento, perdiste, usaste todos tus intentos, el número era el: " + numAAdivinar);
        }

    }

}
