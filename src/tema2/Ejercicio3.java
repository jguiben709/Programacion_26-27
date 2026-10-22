package tema2;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        /*
            Tenemos tres variables:
            - Humedad del suelo: entre 0 y 100, generada de forma aleatoria
            - Temperatura: entre -50 y 50, generada de forma aleatoria
            - EstaLloviendo: booleano, generado de forma aleatoria

            El programa mostrará la acción de si se riega o no según:
            1. Si está lloviendo no regar
            2. Si la humedad es menor que 30:
                - Si la temperatura es mayor que 30: riego intensivo
                - En otro caso: riego normal
            3. Si la humedad está entre 30 y 59:
                - Si la temperatura es mayor que 35: riego normal
                - En otro caso: riego ligero
            4. Si la humedad es mayor que 60: no regar

            Muestra mensaje de regar (intensivo, normal o ligero) o de no regar según los datos.
            
        */

        int humedad = 0, temperatura = 0, llueve = 0;
        boolean estaLloviendo = true;

        humedad = (int) (Math.random() * (100 - 1));
        temperatura = (int) (Math.random() * (50 - (-50) + 1)) - 50;
        llueve = (int) (Math.random() * (2)); // 1 o 0

        if (llueve == 1) {
            estaLloviendo = true;
            IO.println("Está lloviendo");
        } else {
            estaLloviendo = false;
            IO.println("No está lloviendo");
        }

        IO.println("La humedad es: " + humedad);
        IO.println("La temperatura es: " + temperatura);


        if (estaLloviendo) {
            IO.println("NO REGAMOS");
        } else {
            if (humedad < 30) {
                if (temperatura > 30) {
                    IO.println("RIEGO INTENSIVO");
                } else {
                    IO.println("RIEGO NORMAL");
                }
            } else if (humedad >= 30 && humedad <= 59) { //Podéis quitar "humedad >= 30 &&"
                if (temperatura >= 35) {
                    IO.println("RIEGO NORMAL");
                } else {
                    IO.println("RIEGO LIGERO");
                }
            } else { // > 60
                IO.println("NO REGAR");
            }          
        }

    }
}
