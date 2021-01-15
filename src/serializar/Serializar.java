/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.io.FileOutputStream;

/**
 *
 * @author Ulises
 */
public class Serializar {
    
    /**
     * metodo Serializar
     */
    public Serializar(){
        Date fecha = new Date();
        System.out.println(fecha);
        
        /**
         * try-catch
         */
        try{
        FileOutputStream fos = new FileOutputStream("objetoDate.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(fecha);
        oos.close();
        }catch(IOException ioe){}
    }
}
