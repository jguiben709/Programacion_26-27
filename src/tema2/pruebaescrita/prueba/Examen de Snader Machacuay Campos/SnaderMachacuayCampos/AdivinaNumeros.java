package tema2.pruebaescrita.prueba.Examen;

public class AdivinaNumeros {

    public static void main(String[] args) {
        
    
        int numIntentos = 0;
        int numAleatorio = (int) (Math.random() * (50 - 1 + 1)) + 1;

        for (int i=7; i>numIntentos; i--){

            
            int numUsuario = Integer.parseInt(IO.readln("Dime un número (1-50): "));

            if (numUsuario > numAleatorio) {
                IO.println("El número " + numUsuario + " escogido es mayor");
                
                if (numUsuario - numAleatorio > 10){
                    IO.println("Está frio");
                    IO.println("-------------------------------------------------------");

                }
                if (numUsuario - numAleatorio <= 10 && numUsuario - numAleatorio > 5){
                    IO.println("Está tibio");
                    IO.println("-------------------------------------------------------");

                }
                if (numUsuario - numAleatorio <= 5){
                    IO.println("Está caliente");
                    IO.println("-------------------------------------------------------");

                }


            } else if (numUsuario < numAleatorio){
                IO.println("El número " + numUsuario + " escogido es menor");
                
                if (numAleatorio - numUsuario > 10){
                    IO.println("Está frio");
                    IO.println("-------------------------------------------------------");

                }
                if (numAleatorio - numUsuario <= 10 && numAleatorio - numUsuario > 5){
                    IO.println("Está tibio");
                    IO.println("-------------------------------------------------------");

                }
                if (numAleatorio - numUsuario <= 5){
                    IO.println("Está caliente");
                    IO.println("-------------------------------------------------------");

                }

            } else if (numUsuario == numAleatorio){
                IO.println("Ganaste el juego");
                break;
            }

            
        }
        
    }
}
