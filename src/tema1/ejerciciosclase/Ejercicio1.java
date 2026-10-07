package tema1.ejerciciosclase;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        /*
            La nota de programación de la primera evaluación se calcula:
            - 30% una prueba de clase a mitad de trimestre
            - 30% un exámen al final de la evaluación
            - 25% de prácticas de clase
            - 15% evaluación formativa: participación en clase, lo bien que le caes al profesor, etc.

            Pide cada nota por teclado y muestra la nota final del trimestre
            Nota:
            - Si lees con readln los double se pone con . (no coma)
        */

        double notaPruebaClase, notaExamen, notaPracticas, notaEvFormativa;
        double notaFinal;

        notaPruebaClase = Double.parseDouble( IO.readln("Dime nota prueba de clase: "));
        notaExamen = Double.parseDouble( IO.readln("Dime nota del examen: "));
        notaPracticas = Double.parseDouble( IO.readln("Dime nota de prácticas: "));
        notaEvFormativa = Double.parseDouble( IO.readln("Dime nota eva. formativa: "));

        notaFinal = (notaPruebaClase * 0.3) + (notaExamen * 0.3) + (notaPracticas * 0.25) + (notaEvFormativa * 0.15);

        IO.println("La nota final es: " + notaFinal);





        

    }
}
