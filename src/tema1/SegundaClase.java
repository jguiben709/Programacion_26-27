package tema1;

public class SegundaClase {

    public static void main(String[] args) {
        
        //DECLARACIÓN DE VARIABLES
        //SE PUEDEN INICIALIZAR A LA VEZ QUE SE DECLARAN

        double nota1EV = 6.4; //Le guardo sitio en la memoria y le doy un valor
        double nota2EV = 4.8;
        double nota3EV = 4.6;

        double notaMedia = 0.0;

        notaMedia = (nota1EV + nota2EV + nota3EV) / 3;

        IO.println("La nota media es " + notaMedia);



    }
}
