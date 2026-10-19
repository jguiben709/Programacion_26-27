package tema2;

public class Ejercicioclase2 {
    public static void main(String[] args) {
        
        /*
            Estamos en una partida de D&D
            El héroe se enfrenta a un orco y tira un dado de 20 caras. Según el dado:
                1 Pifia, tropieza y pierde el combate
                2 - 5  Huyes despavorido
                6 - 10 Te cubres con el escudo
                11 - 15 Ataque normal con la espada
                16 - 19 Ataque feroz
                20 Golpe critico, el orco es fulminado
            
            Simula la tirada del dado (ver ejercicios tema anterior)
            Y muestra un mensaje con la acción que se produce.    
            
            int n = (int) (Math.random() * (maximo - minimo + 1)) + minimo
        */

        int dado = (int) (Math.random() * (20 - 1 + 1)) + 1;
        
        if (dado == 1) {
            IO.println("Pifia, tropiezas y mueres");
        } else if (dado <= 5) {
            IO.println("Huyes despavorido");
        } else if (dado <= 10) {
            IO.println("Te cubres con el escudo");
        } else if (dado <= 15) {
            IO.println("Ataque normal con la espada");
        } else if (dado <= 19) {
            IO.println("Ataque feroz");
        } else if (dado == 20) {
            IO.println("CRÍTICO");
        } else {
            IO.println("Número de dado incorrecto");
        }







    }
}
