package Juego;

import java.util.Random;
import java.util.Scanner;

public class piedrapapelotijera implements juego {

    private String nombre;
    private int eleccion, puño;

    Scanner leer = new Scanner(System.in);

    public void iniciar() {
      System.out.println("ingrese el nombre del jugador");
      nombre=leer.next();

    }

    
    public void jugar() {
       System.out.println(nombre+" realice su eleccion \n 1. si elije piedra \n 2. si elije papel \n 3. si elije tijera");
       eleccion=leer.nextInt();
       Random aleatorio= new Random();
       puño=aleatorio.nextInt(3)+1;
       System.out.println("piedra, pepel o tijera");
    }

    
    public void finalizar() {
    if(puño==1&&eleccion==1){
        System.out.println("fue empate");
    }
    else if (puño==1 && eleccion==3){
        System.out.println("yo gano");
    }
    else if (puño==1 && eleccion==2){
        System.out.println("yo pierdo");
    }
   else if(puño==2&&eleccion==2){
        System.out.println("fue empate");
    }
    else if (puño==2 && eleccion==1){
        System.out.println("yo gano");
    }
    else if (puño==2 && eleccion==3){
        System.out.println("yo pierdo");
    }
    else if(puño==3&&eleccion==3){
        System.out.println("fue empate");
    }
    else if (puño==3 && eleccion==1){
        System.out.println("yo pierdo");
    }
    else if (puño==3 && eleccion==2){
        System.out.println("yo gano");
    }



    }
    
}
