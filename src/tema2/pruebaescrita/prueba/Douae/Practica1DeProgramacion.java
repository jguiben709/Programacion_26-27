package tema2.pruebaescrita.prueba.Douae;


public class Practica1DeProgramacion {
    

/* El programa genera un número aleatorio entre 1 y 50. El usuario tiene un máximo de 7
intentos para adivinarlo. Después de cada intento, el programa indicará:
–
–
Si el número es mayor o menor
Si está "frío" (diferencia > 10), "tibio" (dif. entre 5 y 10) o "caliente" (dif. < 5)
Al finalizar, mostrará si ganó o perdió y el número de intentos utilizados.*/


public static void main(String[] args) {
      int numero;
       do {
           numero = Integer.parseInt(IO.readln("Dime un numero:"));
           if (numero > 10) {
               IO.println(" Esta frío :");
           }else if (numero >= 5 && numero <=10) {
            IO.println("Esta Tibio:");
           }else if(numero < 5){
            IO.println("Esta caliente:");
           } else {
               for (int i = 1; i <= 50; i++) {
                   IO.println(numero + " * " + i + " = " + (numero * i));
               }
           }
       } while (numero < 0);
       
       
       
   



    
               
            }



}



}