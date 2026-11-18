package tema2.pruebaescrita.opcion1;

public class ControlInvernadero {
    enum EstadoInvernadero { CALEFACCION, VENTILANDO, NORMAL }

    static int generarTemp(int min, int max) {
        return (int) (Math.random() * (max - (min) + 1)) + min;
    }

    /**
     * Genera una temperatura aleatoria entre 10 y 35
     * @return
     */
    static int generarTempInicial() {
        int tempInicial = Integer.MIN_VALUE;
        do {
            try {
                tempInicial = Integer.parseInt(IO.readln("Dime la temperatura inicial: "));
            } catch (Exception ex) {
                IO.println("No has dado un número válido");
            }
            if (tempInicial < 10 || tempInicial > 35) {
                IO.println("Número incorrecto, debe estar entre 10 y 35");
            }
        } while(tempInicial < 10 || tempInicial > 35);

        return tempInicial;
    }

    static void main() {
        int temperaturaInicial;
        int tempActual;
        int tempMinima = Integer.MAX_VALUE, tempMaxima = Integer.MIN_VALUE;
        int horaMinima = 0, horaMaxima = 0;
        int tempMedia = 0;
        EstadoInvernadero estado;
        int numHorasFueraRango = 0;

        //TEMPERATURA INICIAL ENTRE 10 Y 35
        temperaturaInicial = generarTempInicial();

        //SIMULACIÓN DE CADA HORA
        for (int i = 1; i <= 24; i++) {
            //TEMPERATURA ACTUAL Y MEDIA
            tempActual = generarTemp(temperaturaInicial - 5, temperaturaInicial + 5);
            tempMedia += tempActual;

            //TEMPERATURA MÁXIMA Y MÍNIMA Y HORA
            if (tempActual > tempMaxima) {
                tempMaxima = tempActual;
                horaMaxima = i;
            }
            if (tempActual < tempMinima) {
                tempMinima = tempActual;
                horaMinima = i;
            }


            //ESTADO DEL INVERNADERO
            if (tempActual > 30) {
                estado = EstadoInvernadero.VENTILANDO;
                numHorasFueraRango++;
            } else if (tempActual < 15) {
                estado = EstadoInvernadero.CALEFACCION;
                numHorasFueraRango++;
            } else {
                estado = EstadoInvernadero.NORMAL;
            }

            IO.println("HORA: " + i + " TEMP. ACTUAL: " + tempActual + " ESTADO: " + estado);
        }

        IO.println("TEMPERATURA MEDIA: " + (tempMedia / 24.0));
        IO.println("HORAS FUERA DE RANGO: " + numHorasFueraRango);
        IO.println("TEMPERATURA MÁXIMA: " + tempMaxima + " SE ALCANZÓ A LAS " + horaMaxima + " HORAS.");
        IO.println("TEMPERATURA MÌNIMA: " + tempMinima + " SE ALCANZÓ A LAS " + horaMinima + " HORAS.");

    }

}
