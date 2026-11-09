package tema2.metodos;

public class MenuHMS {

    /**
     * Pinta las opciones del menú
     */
    static void pintarOpciones() {
        IO.println("1. Convertir H,M,S a segundos");
        IO.println("2. Convertir segundos a H,M,S");
        IO.println("3. Salir");
    }

    /**
     * Convierte un tiempo dado en horas, minutos y segundos a segundos totales
     * @param h
     * @param m
     * @param s
     * @return
     */
    static int convertirHMSSegundos(int h, int m, int s) {
        int segundosTotales;

        segundosTotales = (h * 60 * 60) + ( m * 60) + s;
        return segundosTotales ;
    }

    /**
     * Convierte segundos en un array con tres valores, el primero las horas
     * el segundos los minutos, el tercero los segundos
     * @param segundos
     * @return
     */
    static int[] convertirSegundosHMS(int segundos) {
        int[] resultado = new int[3];
        resultado[0] = segundos / 3600; //horas
        resultado[1] = (segundos % 3600) / 60;  //minutos
        resultado[2] = (segundos % 3600) % 60;  //segundos
        return resultado;
    }

    static void main() {

        int opcion = Integer.MIN_VALUE;
        int horas, minutos, segundos;
        int secs;

        do {
            pintarOpciones();
            opcion = Integer.parseInt(IO.readln("Dime una opción: "));

            switch (opcion) {
                case 1 -> {
                    horas = Integer.parseInt(IO.readln("Dime el número de horas: "));
                    minutos = Integer.parseInt(IO.readln("Dime el número de minutos: "));
                    segundos = Integer.parseInt(IO.readln("Dime el número de segundos: "));
                    IO.println(convertirHMSSegundos(horas, minutos, segundos));
                }
                case 2 -> {
                    secs = Integer.parseInt(IO.readln("Dime un número de segundos: "));
                    int[] res = convertirSegundosHMS(secs);
                    IO.println("Horas: " + res[0] + " Minutos: " + res[1] +
                            " Segundos: " + res[2]);
                }
                case 3 -> IO.println("Hasta pronto.");
                default -> IO.println("Opción incorrecta");
            }
        } while (opcion != 3);


    }
}
