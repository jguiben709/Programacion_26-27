package tema1.ejerciciosclase;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        /*
            Los cohetes Starship de SpaceX queman combustible según la fórmula de Tsiolkovsky (ecuación de un cohete):
            Av = ve * ln (m0 / mf), donde ln es el logaritmo

            Av, es el cambio de velocidad alcanzado en m/s
            ve, es la velocidad de escape de los gases en m/s
            m0, es la masa inicial del cohete con combustible en kg
            mf, es la masa final sin combustible en kg
            
            Escribe un programa que:
            - Declare e inicialice las variables: ve = 3300.0 m/s, m0 = 5000000.0 kg, y mf = 1500000.0 kg
            - Calcule el Av alcanzado y lo muestre por pantalla
            - Determine con un operador lógico si el cohete puede llegar a la órbita baja. Para que eso se cumpla Av debe ser mayor o igual que 9000 m/s, y la masa final no debe superar el 40% de la masa inicial. Muestra true o false según resultados.

            Notas:
            - Usa Math.log para el logaritmo (ln)
            - Usa operadores lógicos, no uses "if"
            - Si quieres probarte muestra los resultados con dos decimales únicamente

            Variables:
            - double av, ve, mo, mf
            - boolean llegaOrbita
        
        */


        double cambioVelocidad, velocidadEscape;
        double masaInicial, masaFinal;
        boolean llegaOrbita;
        double velocidadEscapeKMH;

        velocidadEscape = 11000.0;
        masaInicial = 5000000.0;
        masaFinal = 1500000.0;

        cambioVelocidad = velocidadEscape * Math.log( masaInicial / masaFinal);
        IO.println("El cambio de velocidad es de: " + cambioVelocidad);

        llegaOrbita = (cambioVelocidad >= 9000.0) && (masaFinal <= masaInicial * 0.4);
        IO.println("Llega a la órbita: " + llegaOrbita);

        //La velocidad de escape real es de unos xxxxx m/s, cambia el dato y dime si ahora escapa a la órbita o se estrella
        //Dime la velocidad en km/h
        velocidadEscapeKMH = velocidadEscape * 3600 / 1000;
        IO.println("El cohete sale a: " + velocidadEscapeKMH + " km/h");




    }
}
