package tema3.arrays;

public class EjemploArray {
    static void main() {

        //Nos creamos una variable "notas" con 10 enteros
        int[] notas = new int[20];

        notas[0] = 7;
        notas[1] = 6;
        notas[2] = 9;
        notas[3] = 9;
        notas[4] = 1;
        notas[5] = 2;
        notas[6] = 5;
        notas[7] = 10;
        notas[8] = 4;
        notas[9] = 6;

        //IO.println("Nota " + notas[0]);

        //Recorrer el array - de 0 a 9 el índice del array
        for(int i=0; i < notas.length; i++) {
            IO.println(notas[i]);
        }

        IO.println("--------------");

        //Recorrer array del fin al principio - de 9 a 0 el índice del array
        for(int i=notas.length-1; i>=0; i--) {
            IO.println(notas[i]);
        }




    }
}
