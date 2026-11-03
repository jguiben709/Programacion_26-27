package tema2.bucles;

public class EjercicioSumaMedia {
    static void main() {

        int numero=0;
        double suma=0;
        int contador=0;
        double media=0.0;

        do {
            numero = Integer.parseInt(IO.readln("Dime un núnmero:"));
            suma += numero;
            contador++;
        } while(numero != 0);

        IO.println("La suma es: " + suma);
        IO.println("El contador es: " + (contador-1));

        media = suma / (contador - 1); // 15 / 2 = 7
        IO.println("La media es: " + media);



    }
}
