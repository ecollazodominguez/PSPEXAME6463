/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1av;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam2
 */
public class Ej3 extends Thread{
    
        public Ej3(String str) {
            super(str);
        }
    
            Thread c;
            public static int cont=1;
        
        //Usamos un contador estático para crear los hilos
        public void run() {
            if (cont <=3) {
                c = new Ej3(String.valueOf(cont));
                c.start();
                cont++;
            
            for (int j = 0; j < 25; j++) {
                System.out.println("hilo: "+ getName()+ " iteraccion: "+j);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Ej3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //llamamos a yield para dejar pasar a otro hilo.
                 yield();
            }
            
        }
        System.out.println("Termina thread: "+ getName());
                
        }
}
