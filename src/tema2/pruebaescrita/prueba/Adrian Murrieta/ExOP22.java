package tema2.pruebaescrita.prueba.Adrian;

//Carrera de tractores

public class ExOP22 {
        public static void main(String[] args) {

            int user = 0;
            int ordenador = 0;
            int avanceSeguro = 2;
            int avanceArriesgado;
            int dado;
            int tirada = 1;
            int acumulador = 0;
           
            
            
           user = Integer.parseInt(IO.readln("Elige una opcion: "));
           
             //usuario
             if (user <= 1){

                IO.println("Avanzas dos casillas");
               acumulador += Math.pow(avanceSeguro , user);
               IO.println("Estas en la casilla numero :" + acumulador);
               


             } else {
                dado = (int) (Math.random() * (6 - 1 + 1)) + 1;
                
                IO.println("la tiirada número: " + tirada + " es avanzar : " + dado + "casillas");
                acumulador += Math.pow(dado , user);
                IO.println(acumulador);


                

             }



    
    }
}
