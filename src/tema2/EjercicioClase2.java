package tema2;

public class EjercicioClase2 {
    public static void main(String[] args) {
        
        /*
            Pide por teclado un día del mes (1-31) y un número de mes (1-12)
            y dime si la fecha es correcta        
        */

        int diaMes;
        int mes;

        diaMes = Integer.parseInt(IO.readln("Dime el día del mes: "));
        mes = Integer.parseInt(IO.readln("Dime el mes: "));

        switch(mes) {
            case 1,3,5,7,8,10,12 -> {
                //Compruebo que el día está entre 1 y 31
                if (diaMes >= 1 && diaMes <= 31) {
                    IO.println("Fecha correcta");
                } else {
                    IO.println("Fecha incorrecta");
                }
            }
            case 4,6,9,11 -> {
                //Compruebo que el día está entre 1 y 30
                if (diaMes >= 1 && diaMes <= 30) {
                    IO.println("Fecha correcta");
                } else {
                    IO.println("Fecha incorrecta");
                }
            }
            case 2 -> {
                //Compruebo que el día está entre 1 y 28
                if (diaMes >= 1 && diaMes <= 28) {
                    IO.println("Fecha correcta");
                } else {
                    IO.println("Fecha incorrecta");
                }
            }
            default -> {
                IO.println("Mes incorrecto");
            }

        }


    }
}
