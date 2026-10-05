package tema1;

public class EjercicioOperadoresLogicos {

    public static void main(String[] args) {
        
        /*
            En un parque de atracciones para subir a la montaña rusa "El Dragón" hace falta cumplir  estas reglas:
            - tener 12 años o más
            - medir 140 cm o más

            Pero para la montaña rusa "Mini mini" solo hace falta cumplir UNA de estas:
            - tener menos de 12 años
            - O medir menos de 140 cm

            Declara estas variables:
            int edad = 18;
            double altura = 145;

            Debes decirme:
            1. Si puede subir al dragón
            2. Si puede subir al mini mini
            3. Piensa antes de programar el resultado
            4. Cambia  edad y altura para que entre a mini mini
        
        */

        //DEFINIR LAS VARIABLES
        int edad = 18;
        int altura = 135;

        boolean dragon = false;
        boolean mini = false;
        boolean subir = false;

        dragon = (edad >= 12) && (altura >= 140); // && Y, se cumplen las dos condiciones
        IO.println("Puede montar en dragon: " + dragon);

        // | - AltGr + 1
        mini = (edad < 12) || (altura < 140); // || O, se cumple una de las condiciones
        IO.println("Puede montar en mini mini: " + mini);

        subir = dragon && mini; //Que puede subir a las dos
        IO.println("Puede subir a las dos " + subir);







    }
}
