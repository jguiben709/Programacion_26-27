package tema2.pruebaescrita.prueba.Adrian;


//Opcion 2: Adivina el numero con pistas

public class ExOP2 {
    public static void main(String[] args) {

        int numAl;
        int numUsuario;
        int contador = 1;
        
    
       IO.println("He generado un numero aleatorio del 1 al 50, debes de adivinarlo, suerte crack");
      
        numAl = (int) (Math.random() * (50 - (1) + 1)) + (1);
        IO.println(numAl);
        
        IO.println("Tienes 7 intentos para adivinarlo que lo sepas");

         numUsuario = Integer.parseInt(IO.readln("Dime un número del 1 al 50: "));


         if (numUsuario == numAl) {
                  
             IO.println("Ganaste");
             IO.println("Intentos realizados:" + contador);
             return;
            
         } else {
               
            IO.println("Fallaste, te quedan 6 intentos");
            contador++;
            
         }

            if(numUsuario < numAl){

                IO.println("Es mayor");
             }else {
                IO.println("Es menor");
                
             }
                  

         numUsuario = Integer.parseInt(IO.readln("Dime un número del 1 al 50: "));

         if (numUsuario == numAl) {
                  
             IO.println("Ganaste");
             IO.println("Intentos realizados:" + contador);
             return;
           
            
         } else {
               
            IO.println("Fallaste, te quedan 5 intentos");
             contador++;
         }
          if(numUsuario < numAl){

                IO.println("Es mayor");
             }else {
                IO.println("Es menor");
             }

         numUsuario = Integer.parseInt(IO.readln("Dime un número del 1 al 50: "));

         if (numUsuario == numAl) {
                  
             IO.println("Ganaste");
             IO.println("Intentos realizados:" + contador);
             return;
           
            
         } else {
               
            IO.println("Fallaste, te quedan 4 intentos");
             contador++;
         }
          if(numUsuario < numAl){

                IO.println("Es mayor");
             }else {
                IO.println("Es menor");
             }

         numUsuario = Integer.parseInt(IO.readln("Dime un número del 1 al 50: "));

         if (numUsuario == numAl) {
                  
             IO.println("Ganaste");
             IO.println("Intentos realizados:" + contador);
             return;
              
            
         } else {
               
            IO.println("Fallaste, te quedan 3 intentos");
             contador++;
         }
          if(numUsuario < numAl){

                IO.println("Es mayor");
             }else {
                IO.println("Es menor");
             }

         numUsuario = Integer.parseInt(IO.readln("Dime un número del 1 al 50: "));

         if (numUsuario == numAl) {
                  
             IO.println("Ganaste");
             IO.println("Intentos realizados:" + contador);
             return;
              
            
         } else {
               
            IO.println("Fallaste, te quedan 2 intentos");
             contador++;
         }
          if(numUsuario < numAl){

                IO.println("Es mayor");
             }else {
                IO.println("Es menor");
             }

         numUsuario = Integer.parseInt(IO.readln("Dime un número del 1 al 50: "));

         if (numUsuario == numAl) {
                  
             IO.println("Ganaste");
             IO.println("Intentos realizados:" + contador);
             return;
           
            
         } else {
               
            IO.println("Fallaste, te quedan 1 intentos");
             contador++;
         }
          if(numUsuario < numAl){

                IO.println("Es mayor");
             }else {
                IO.println("Es menor");
             }

         numUsuario = Integer.parseInt(IO.readln("Dime un número del 1 al 50: "));

         if (numUsuario == numAl) {
                  
             IO.println("Ganaste");
             IO.println("Intentos realizados:" + contador);
             return;
              
            
         } else {
               
            IO.println("Fallaste, perdiste, el numero era:" + numAl);
             contador++;
         }
        
       
    }

    
}