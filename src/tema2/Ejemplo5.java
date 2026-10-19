package tema2;

public class Ejemplo5 {
    public static void main(String[] args) {
        double programacion = 4.5, bbdd = 6.2;

        //Dime si has suspendido las dos, si has aprobado alguna dime cuál o si has aprobado las dos

        if (programacion >= 5.0) {
            if (bbdd >= 5.0) {
                IO.println("Has aprobado programación y bbdd");
            } else {
                IO.println("Has aprobado programación pero no bbdd");
            }
        } else {
            if (bbdd >= 5.0) {
                IO.println("Has aprobado bbdd pero no programacion");
            } else {
                IO.println("Has cateado todo chaval");
            }
        }

        IO.println("----------------------------------------------------");

        if (programacion >= 5.0 && bbdd >= 5.0) {
            IO.println("Has aprobado las dos");
        } else if (programacion >= 5 && bbdd < 5) {
            IO.println("Has aprobado programación pero no bbdd");
        } else if (bbdd >= 5 && programacion < 5) {
            IO.println("Has aprobado bbdd pero no programación");
        } else {
            IO.println("Has cateado todo");
        }

        IO.println("----------------------------------------------------");


        //Dime si has aprobado una de las dos, las dos o ninguna
        if (programacion >= 5 && bbdd >= 5) {
            IO.println("Has aprobado las dos");
        } else if (programacion >= 5 || bbdd >= 5) {
            IO.println("Has aprobado una de las dos");
        } else {
            IO.println("Has cateado las dos");
        }








    }
}
