package tema1.ejercicioscasa;

public class EjercicioB3 {

    public static void main(String[] args) {
        
        int totalSegundos = 3725;
        int horas = 0, minutos = 0, segundos;

        horas = totalSegundos / 60 / 60;
        minutos = totalSegundos / 60 % 60;
        segundos = totalSegundos % 60 % 60;

        IO.println("Ese tiempo son: " + horas + " horas " + minutos + " minutos " + segundos + " segundos");        


    }
    
}
