package tema2.excepciones;

public class DivisionPorZeroException extends Exception {
        public DivisionPorZeroException(String mensaje) {
            super("ERROR: - división por cero: " + mensaje);
        }
}
