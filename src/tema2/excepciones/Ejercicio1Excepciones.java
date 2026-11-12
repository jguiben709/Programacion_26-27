package tema2.excepciones;

public class Ejercicio1Excepciones {

    /**
     * Devuelve una cantidad aplicándole el IVA del 21%
     * Si el precio supera 100€, lanzamos excepción PrecioDemasiadoAltoException
     * @param numero
     * @return
     */
    static double getPrecioConIva(double numero) throws PrecioDemasiadoAltoException {
        double precioConIVA;

        precioConIVA = numero * 1.21;
        if (precioConIVA > 100) {
            throw new PrecioDemasiadoAltoException("Precio demasiado alto");
        }

        return precioConIVA;
    }

    static void main() {

        double cantidad;

        try {
            cantidad = Double.parseDouble(IO.readln("Dame un precio:"));    
            IO.println("Precio con IVA: " + getPrecioConIva(cantidad));
        } catch (PrecioDemasiadoAltoException e) {
            IO.print("ERROR: " + e.getMessage());
        } catch (Exception ex) {
            IO.println("Error general: " + ex.getMessage());
        }

    }



}
