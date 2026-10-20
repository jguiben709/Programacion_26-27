package tema2;

public class Ejercicioclase2 {
    public static void main(String[] args) {
        
        /*
            Estamos en una partida de D&D

            Añadir una variable 'vida' de tipo entero que empiece con valor 100
            Añadir una variable 'escudo' de tipo booleano, si llevas escudo o no. True.

            El héroe se enfrenta a un orco y tira un dado de 20 caras. Según el dado:
                1 Pifia, tropieza y pierde el combate. Vida = 0
                2 - 5  Huyes despavorido. Vida -50
                6 - 10 Te cubres con el escudo. 
                    Si llevas escudo no te quita vida y mensaje "Paras golpe con escudo"
                    Si no llevas escudo. Via -70
                11 - 15 Ataque normal con la espada                
                16 - 19 Ataque feroz
                    Si llevas escudo mensaje "Golpe brutal con el escudo"
                    Si no llevas escudo mensaje "Golpe feroz con la espada"
                20 Golpe critico, el orco es fulminado
            
            Simula la tirada del dado (ver ejercicios tema anterior)
            Y muestra un mensaje con la acción que se produce.    
            Que muestre también un mensaje con la vida del jugador.

            

            
            int n = (int) (Math.random() * (maximo - (minimo) + 1)) + minimo
        */

        int vida = 100;
        boolean escudo = true;

        int dado = (int) (Math.random() * (20 - 1 + 1)) + 1;  
        IO.println("TU TIRADA ES: " + dado);

        int tieneEscudo = (int) (Math.random() * (2 - 1 + 1)) + 1;  
        if (tieneEscudo == 1) {
            escudo = true;
            IO.println("Estás equipado con escudo");
        } else {
            escudo = false;
            IO.println("No llevas escudo, mala suerte");
        }
        
        
        if (dado == 1) {
            vida = 0;
            IO.println("Pifia, tropiezas y mueres");
        } else if (dado <= 5) {
            vida -= 50;
            IO.println("Huyes despavorido");
        } else if (dado <= 10) {
            if (escudo) {
                IO.println("Paras el golpe con el escudo");
            } else {
                vida -= 70;
                IO.println("Recibes golpe por no llevar escudo");
            }
        } else if (dado <= 15) {
            IO.println("Ataque normal con la espada");
        } else if (dado <= 19) {
            if (escudo) {
                IO.println("Golpe brutal con escudo");
            } else {
                IO.println("Golpe feroz con la espada");
            }
        } else if (dado == 20) {
            IO.println("CRÍTICO y vences al enemigo");
        } else {
            IO.println("Número de dado incorrecto");
        }

        IO.println("La vida restante del jugador es: " + vida);







    }
}
