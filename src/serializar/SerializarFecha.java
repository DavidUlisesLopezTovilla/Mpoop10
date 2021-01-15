/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ulises
 */
public class SerializarFecha {
    /**
     * clase main
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
        /**
         * try-catch
         */
        try {
            Serializar serializador = new Serializar();
            
            /**
             * funcion sleep
             */
            Thread.sleep(5*1000);
            
            Deserializador des = new Deserializador();
            
            
            System.out.println("Fecha actual" +new Date());
        } catch (InterruptedException ex) {
        }
    }
    
}
