//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double radio;
        double superficie;
        double perimetro;

        radio = 13; //Ejemplo
        IO.println("El radio es:  " + radio);

        superficie = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;

        IO.println("La superficie es: " + superficie);
        IO.println("El perimetro es: " + perimetro);


    }
}