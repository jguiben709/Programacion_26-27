package tema2.pruebaescrita.prueba.Examen;

public class OpcionA1 {
    static void main() {
        int tempInical = 0;
        int temperaturaNueva = 0;
        try {
            tempInical = Integer.parseInt(IO.readln("Dime una temperatura: "));
        } catch (NumberFormatException ex) {
            IO.println("Dime un número");
            return;
        }

        if (tempInical <= 10) {
            IO.println("La temperatura debe de estar por encima de 10");
        } else if (tempInical >= 35) {
            IO.println("La temperatura debe de estar por debajo de 35");
        }

        for (int hora = 1; hora <= 24; hora++) {
            if (tempInical >= 31){
                IO.println("Se activa la ventilacion");
            } else if (tempInical <= 14) {
                IO.println("Se activa la calefaccion");
            } else {
                IO.println("Temperatura normal");
            }
            IO.println("Temperatura: " + tempInical + " de la hora " + hora);
        IO.println("---------------------------");
        }
    }
}
