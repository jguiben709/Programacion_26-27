package tema2;

public class EjercicioSwitch1 {
    public static void main(String[] args) {
        
        /*
            Crea un enum con los días de la semana llamado DiasSemana
            Pide por teclado un día de la semana escrito "Lunes, ...."
            Conviertélo al enum y muestra el mensaje:
            - LUNES, MARTES, MIERCOLES, JUEVES: hoy tengo Programación con Javi
            - VIERNES: hoy no tengo Programación con Javi, vaya!!!
            - SABADO, DOMINGO: biennn, no hay clase!!!
        
        */

        enum DiasSemana {
            LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
        }

        DiasSemana diaSemana;

        String diaSemanaStr = IO.readln("Dime día de la semana: ").toUpperCase(); //Leer String (lunes, martes, ..) y convertirlo a mayúsculas
        diaSemana = DiasSemana.valueOf( diaSemanaStr ); //Convertir el String a uno de los DiasSemana

        switch (diaSemana) {
            case LUNES, MARTES, MIERCOLES, JUEVES -> IO.println("Hoy tengo Programación con Javi");
            case VIERNES -> IO.println("Hoy no tengo clase con Javi, vaya!!!");
            case SABADO, DOMINGO -> IO.println("Qué bien, no hay clase!!!");
        }



    }
}
