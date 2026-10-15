package tema2;

public class Ejemplo4 {
    public static void main(String[] args) {
        
        //Dime una nota del 1 al 10
        //Indica si es suspenso, aprobado, notable o sobresaliente

        int nota=0;

        nota = Integer.parseInt(IO.readln("Dime tu nota: "));

        //Comprobar que la nota es menor o igual que 11
        if (nota <= 10) {

            if (nota < 5) {
                IO.println("Suspenso");
            } else if (nota < 7) {
                IO.println("Aprobado");
            } else if (nota < 9) {
                IO.println("Notable");
            } else {
                IO.println("Sobresaliente");
            }

        } else {
            IO.println("Nota incorrecta");
        }





    }
}
