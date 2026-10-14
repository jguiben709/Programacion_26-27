package tema1.ejercicioscasa;

public class EjercicioC4 {
    public static void main(String[] args) {
        
        //Me dicen que tengo 20000€ en un depósito bancario.
        //El interés que me dan es de un 2.75%
        //Me retiene Hacienda un 18% de los intereses
        //Pide por teclado los meses que tienes el dinero el banco y calcula lo que ganas

        double saldo = 20000.0;
        double intereses = 0.0, retenciones = 0.0;
        double interes = 0.0275, retencion = 0.18; //2.75% y 18%
        double ganancias = 0.0;
        int meses = 0;

        meses = Integer.parseInt(IO.readln("Dime los meses que tienes el dinero: "));
        
        
        intereses = saldo * interes * (meses / 12.0);
        retenciones = intereses * retencion;
        ganancias = intereses - retenciones;

        IO.println("Intereses: " + intereses + "€");
        IO.println("Retención hacienda: " + retenciones + "€");
        IO.println("En total he ganado: " + ganancias + "€ en " + meses + " meses.");




    }
}
