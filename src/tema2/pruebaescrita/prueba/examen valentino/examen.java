package tema2.pruebaescrita.prueba.examen;

public class examen {


    public static void main(String[] args) {

            int contador = 0;
            int hora;
            int temperatura;
            int VariacionTemperatura = 0;



        do{

            temperatura = (int) Integer.parseInt(IO.readln("Dime la temperatura del dia -> "));
            contador++;

            VariacionTemperatura = (int) ( Math.random() * ((3 - (-2)) + 1)) + 3;

            if(temperatura >= 10 && temperatura <=35){

                temperatura = (temperatura + VariacionTemperatura);
                IO.println("la temperatura es -> " + temperatura);

            } else {

                IO.println("Temperatura tiene que estar entre 10 y 35");

            }

            if(temperatura > 30){

                IO.println("SE ACTIVA LA VENTILACION");

            }

            if(temperatura < 15){

                    IO.println("SE ACTIVA LA CALEFACCION");

            }

        }
        while(contador <= 24);



        }

    }


