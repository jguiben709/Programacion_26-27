package tema2;

public class EjercicioClase3 {
    public static void main(String[] args) {
        /*
        
            La clase de Programación se va el lunes de viaje a la Estación Experimental
            Queremos saber cuánto cuesta el viaje
            - Si van más de 30 alumnos el viaje cuesta 5€ por alumno
            - Si van entre 15 y 30 alumnos el viaje cuesta 8€ por alumno
            - Si van menos de 15 alumnos el viaje cuesta 1000€

            Pide por teclado cuántos alumnos van y calcula cuánto cuesta el bus
        
        */

        int numAlumnos=0;
        int costeViaje=0;

        numAlumnos = Integer.parseInt(IO.readln("Dime el número de alumnos: "));
        if (numAlumnos > 30) {
            costeViaje = numAlumnos * 5;
        } else if (numAlumnos >= 15 && numAlumnos <= 30) {
            costeViaje = numAlumnos * 8;
        } else if (numAlumnos < 15) {
            costeViaje = 1000;
        }

        IO.println("El coste del viaje es: " + costeViaje);



    }
}
