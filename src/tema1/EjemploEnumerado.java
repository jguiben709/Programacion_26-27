package tema1;

public class EjemploEnumerado {

    
    public static void main(String[] args) {
        
        /*
            UN TIPO ENUMERADO ES UN CONJUNTO DE CONSTANTES FIJO
        */
        enum Asignaturas {
            PROGRAMACION, SISTEMASINFORMATICOS, BASESDEDATOS, LENGUAJESDEMARCAS, ENTORNOSDEDESARROLLO, IPE
        }

        // tipo      nombre variable    =   valor
        Asignaturas miPreferida = Asignaturas.BASESDEDATOS;
        Asignaturas miOdiada = Asignaturas.PROGRAMACION;

        IO.println(Asignaturas.PROGRAMACION);
        IO.println("Mi asignatura preferida es " + miPreferida);

        




    }
    
}
