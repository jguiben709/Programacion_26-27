package tema2.pruebaescrita.prueba.ÁngelCanoPerez;

public class Ejercicio1 {

    public static int variacionTemperatura(int tIni) {

        return (int) (Math.random() * ((tIni + 3) - (tIni - 2) + 1)) + (tIni - 2);
    }
    public static int maximo(int n,int m) {
        if (n <= m) {
            return m;
        } else  {
            return n;
        }
    }
    public static int minimo(int n,int m) {
        if (n <= m) {
            return n;
        } else  {
            return m;
        }
    }
    public static int media(int tF){
        int tempMedia = tF/24;
        return tempMedia;
    }

    public static int horasFuera(int temp){
        int horaF=0;
        if (temp<15||temp>30){
            horaF+=1;
        }return horaF;

    }


    static void main(String[] args) {
        int tempInicial, tempFinal,tempTotal=0,tempMedia=0,tempMax=0,tempMin=0;
        int horas =25,horasFuera=0;
        boolean ventilacion =false, calefaccion=false, normal = true;
        try { tempInicial = Integer.parseInt(IO.readln("Dime la temperatura incial : "));

            if (tempInicial > 10 && tempInicial < 35) {
                for (int i=1;i<horas;i++){
                    tempFinal = variacionTemperatura(tempInicial);
                    tempMax= maximo(tempFinal,tempInicial);
                    tempMin=minimo(tempFinal,tempInicial);

                    if (tempFinal >30){
                        ventilacion = true;
                        normal = false;
                        calefaccion=false;
                    } else if (tempFinal<15) {
                        calefaccion = true;
                        normal=false;
                        ventilacion=false;

                    }
                    horasFuera= horasFuera(tempFinal);
                    IO.println("La hora " + i );
                    IO.println("La Temperatura es de: " + tempInicial + "ºC");
                    if (ventilacion){
                        IO.println("La ventilacion esta puesta ");
                    }
                    if (calefaccion){
                        IO.println("La calefaccion esta puesta ");
                    }
                    if (normal){
                        IO.println("Estado Normal");
                    }
                    tempTotal+=tempFinal;
                }

            }
            tempMedia= media(tempTotal);
            IO.println("La temperatura media es de = " + tempMedia +" ºC");
            IO.println("La temperatura ha estado fuera de rango " +horasFuera + " horas ");
            IO.println("La temperatura maxima fue de: " + tempMax + " y la minima de: " +tempMin);
        }catch (NumberFormatException ex){
            IO.println("ERROR : "+ ex.getMessage());

        }




    }
}



