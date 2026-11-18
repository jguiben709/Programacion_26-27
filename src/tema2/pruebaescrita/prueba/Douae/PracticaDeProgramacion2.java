package tema2.pruebaescrita.prueba.Douae;

public class PracticaDeProgramacion2 {
    /* El usuario y el ordenador juegan una carrera de tractores por un camino de 30 casillas.
Los dos empiezan en la casilla 0 y juegan por turnos. En cada turno, el jugador elige
una de estas dos opciones:
Avance seguro: el tractor avanza 2 casillas.
Arriesgar: se lanza un dado de 6 caras y el tractor avanza lo que salga. Si sale un
1, el tractor se atasca en el barro y retrocede 3 casillas (nunca puede bajar de la
casilla 0).
Escribe un programa que:
Permita al usuario elegir la opción en su turno, validando que sea 1 o 2.
Haga que el ordenador elija al azar entre las dos opciones.
Muestre después de cada turno la opción elegida, el resultado del dado si se ha
lanzado y la casilla en la que está cada tractor.
Indique quién ha ganado. Gana el primero que llega a la casilla 30 o la supera.*/



static  int lanzaDados(int numCaras){
    return (int)(Math.random()*(6)-(1)+1)+1;
    
}
    static int turno1Jugador(){
        int total = 0, dado;
        IO.println("tu:");
        for (int i = 0; i<=2 ; i++){
            dado = lanzaDados(6);
            if (dado % 2==0){
                total=dado;
            }
         
        } return total;  

    }
    static int turno2Jugador(){
        int total =0,dado;
        for (int i=0; i<=2 ; i++){
        dado= lanzaDados(6);
        if (dado% 2!=0){
            total=dado;
        }

    }IO.println();
    return total;

        
    }

    












}
