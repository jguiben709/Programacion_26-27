package tema3.matrices;

public class Ejercicio4 {
    static void main() {

        //Una matriz guarda las notas de varios alumnos en varias materias. Obtén cuántas
        //asignaturas ha aprobado cada alumno.

        //PROG - BBDD - SSII- ENDS - LM
        double[][] notas = {
                { 5.0, 6.5, 7.5, 9.0, 6.0 },
                { 4.0, 4.5, 2.5, 9.0, 4.0 },
                { 6.0, 6.5, 3.5, 9.0, 6.0 },
                { 7.5, 7.5, 7.5, 9.0, 3.0 },
                { 4.0, 8.5, 8.5, 9.0, 6.5 },
                { 3.0, 6.5, 7.0, 9.0, 5.0 },
        };

        String[] nombresAlumnos = {
                "Pepito", "Juanita", "María", "Manola", "Bartolomé", "Encarna"
        };

        //Fila 0 -> nombre 0, Fila 1 -> nombre 1, ...

        //Número de materias aprobadas
        int[] aprobadas = new int[notas.length];

        //Recorrer el array y contar las materias aprobadas
        for(int i=0; i < notas.length; i++) {
            for(int j=0; j < notas[0].length; j++) {
                if (notas[i][j] >= 5.0) {
                    aprobadas[i] = aprobadas[i] + 1;
                }
            }
        }

        //Pintar el número de aprobadas por alumno
        for(int i=0; i < aprobadas.length; i++) {
            IO.println(nombresAlumnos[i] + " ha aprobado " + aprobadas[i] + " materias");
        }

    }
}
