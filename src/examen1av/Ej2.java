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
public class Ej2 extends Thread{
    
        public Ej2(String str) {
            super(str);
        }
    
        //bucle de 25 interacciones donde en cada interaccion manda un mensaje, despues espera y repite hasta terminarlas.
        public void run() {
            for (int i = 0; i < 25; i++) {
                System.out.println("hilo: "+ getName()+ " iteraccion: "+i);
                try {
                    Thread.sleep((long)Math.random()*(300-500)+500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ej2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        System.out.println("Termina thread: "+ getName());
                
        }
}
