package tema2.pruebaescrita.prueba.Examen;

public class opcion1aJuanAntonioPererin {
    static int maximoDosNumeros(int n1, int n2) {
        if (n1 >= n2)
            return n1;
        else
            return n2;
    }

    static int minimoDosNumeros(int n1, int n2) {
        if (n1 <= n2)
            return n1;
        else
            return n2;
    }
    static void main() {
        int horasOutR = 0;
        int horaMax = 0;
        int horaMin = 0;

        int tempMax = 0;
        int tempMin = 0;

        int tempMaxDef = 0;
        int tempMinDef =40;

        int gradosTeclado = 0;
        int gradosCambio = 0 ;
        int gradosTotal = 0;

        boolean ventilacion = false ;
        boolean calefaccion = false ;
        boolean normal = false;

        try {
            gradosTeclado = Integer.parseInt(IO.readln("dime los grados que hace estre 30 y 15 "));
        } catch (NumberFormatException ex) {
            IO.println("Dime un número");
            return;
        }
        if (gradosTeclado<15 || gradosTeclado > 30){
            IO.println(" la proxima me das un numero entre 30 y 15");
            return;
        }

        gradosTotal = gradosTeclado;
        tempMax = gradosTeclado;
        tempMin = gradosTeclado;

        for (int i = 1 ; i < 25; i++){
            IO.println("la hora es " + i);

            gradosCambio = (int) (Math.random() * (3 - (-2) + 1)) + (-2);
            IO.println("la variacion es " + gradosCambio);

            gradosTeclado = gradosTeclado + (gradosCambio);
            IO.println("los grados esta hora son  " + gradosTeclado);

            gradosTotal = gradosTotal + gradosTeclado;
            IO.println("estado es ");
            if (gradosTeclado > 30){
                ventilacion = true ;
                IO.println("---VENTILANDO---");
                horasOutR = horasOutR + 1;
            } else if (gradosTeclado < 15) {
                calefaccion = true ;
                IO.println("---CALEFACTANDO---");
                horasOutR = horasOutR + 1;
            }else {
                normal = true ;
                IO.println("---NORMAL---");
            }

            tempMin = minimoDosNumeros(tempMin, gradosTeclado);
            if (tempMinDef > minimoDosNumeros(tempMin, gradosTeclado)){
                horaMin = i;
                tempMinDef = minimoDosNumeros(tempMin, gradosTeclado);
            }

            tempMax = maximoDosNumeros(tempMax, gradosTeclado);
            if (tempMaxDef < maximoDosNumeros(tempMax, gradosTeclado)){
                horaMax = i;
                tempMaxDef = maximoDosNumeros(tempMax, gradosTeclado);
            }
        }
        IO.println("esta es la media de grados de hoy " + (gradosTotal / 24.0) );
        IO.println("ha esta hora fue la temperatura maxima " + horaMax + " y esta fue la temperatura " + tempMaxDef);
        IO.println("ha esta hora fue la temperatura minima " + horaMin + " y esta fue la temperatura " + tempMinDef);
        IO.println("todas esta horas ha estado fuera de rango " + horasOutR);
    }
}
