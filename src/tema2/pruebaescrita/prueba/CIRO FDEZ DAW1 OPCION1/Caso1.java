package tema2.pruebaescrita.prueba.CIRO

public class Caso1 {
    static int temperaturaInicial() {
        int temperatura = 0;

        do {
            try {
                temperatura = Integer.parseInt(IO.readln("Introduce una temperatura entre 10ºC y 35ºC: "));
            } catch (NumberFormatException e) {
                IO.println("Eso no es un número.");
            }
            if (temperatura < 10 || temperatura > 35) {
                IO.println("Temperatura introducida incorrecta, elige entre 10ºC y 35ºC");
            }
        } while (temperatura < 10 || temperatura > 35);

        return temperatura;
    }

    static int maxTemp(int temperatura) {
        int max = temperatura + 3;
        return max;
    }

    static int minTemp(int temperatura) {
        int min = temperatura - 2;
        return min;
    }

    static boolean ventilacion(int tempEstado) {

        if (tempEstado > 30) {
            return true;
        }
        return false;

    }

    static boolean calefaccion(int tempEstado) {

        if (tempEstado < 15) {
            return true;
        }
        return false;

    }

    static int maximo(int num1, int num2) {
        int numMax = Math.max(num1, num2);
        return numMax;
    }

    public static void main(String[] args) {
        int interacciones = 24;
        int temperaturaUsuario;
        int horas = 0;
        double media = 0.0;
        int contador = 0;
        double acumulador = 0.0;
        int horasFuera = 0;

        temperaturaUsuario = temperaturaInicial();

        for (int i = interacciones; i > 0; i--) {
            IO.println("La temperatura es de: " + temperaturaUsuario + " ºC");

            if (ventilacion(temperaturaUsuario)) {
                IO.println("ESTADO: ventilacion.");
            }
            if (calefaccion(temperaturaUsuario)) {
                IO.println("ESTADO: calefaccion.");
            } else {
                IO.println("ESTADO: normal.");
            }

            acumulador = acumulador + temperaturaUsuario;
            contador++;

            if (temperaturaUsuario < 15 || temperaturaUsuario > 30) {
                horasFuera++;
            }

            temperaturaUsuario = (int) (Math.random()
                    * (maxTemp(temperaturaUsuario) - (minTemp(temperaturaUsuario)) + 1)) + minTemp(temperaturaUsuario);

            horas += 1;
            IO.println("Son las: " + horas + ":00");

        }

        media = acumulador / (contador);
        IO.println("La temperatura media es de: " + media);
        IO.println("Las horas fuera de 15ºC y 30ºC: " + horasFuera);

    }
}
