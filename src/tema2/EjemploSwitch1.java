package tema2;

public class EjemploSwitch1 {
    
    public static void main(String[] args) {
        
        /*
        1 Pifia, tropieza y pierde el combate. Vida = 0
        2 - 5  Huyes despavorido. Vida -50
        6 - 10 Te cubres con el escudo. 
        11 - 15 Ataque normal con la espada                
        16 - 19 Ataque feroz
        20 Golpe critico, el orco es fulminado        
        */

        int dado = (int) (Math.random() * (20 - 1 + 1)) + 1;  
        IO.println("TIRADA = " + dado);

        //VAMOS A INTENTAR UTILIZAR ESTE TIPO DE SWITCH
        switch (dado) {
            case 1 -> IO.println("Pifia,");
            case 2,3,4,5 -> IO.println("Huyes");
            case 6,7,8,9,10 -> IO.println("Te cubres con escudo");
            case 11,12,13,14,15 -> IO.println("Ataque normal");
            case 16,17,18,19 -> IO.println("Ataque feroz");
            case 20 -> IO.println("Crítico");
            default -> IO.println("Tirada incorrecta");
        }

        switch (dado) {
            case 1:
                IO.println("Pifia,");
                break;
            case 2, 3, 4, 5: IO.println("Huyes"); break;
            case 6, 7, 8, 9, 10: IO.println("Te cubres con escudo"); break;
            case 11,12,13,14,15: IO.println("Ataque normal"); break;
            case 16,17,18,19: IO.println("Ataque feroz"); break;
            case 20: IO.println("Crítico"); break;
            default:
                IO.println("Tirada incorrecta");
                break;
        }

    }
}
