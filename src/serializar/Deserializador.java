/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

/**
 *
 * @author Ulises
 */
public class Deserializador {
    /**
     * metodo Deserializador
     * @throws IOException 
     */
     public Deserializador() throws IOException{
         Date fecha = null;
         
         /**
          * try-catch
          */
         try{
            FileInputStream fis = new FileInputStream("objetoDate.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            fecha = (Date) ois.readObject();
            ois.close();
         }catch(IOException e){}
         catch(ClassNotFoundException ie){}
         
         System.out.println("El objeto extraido es: ");
         System.out.println(fecha);
         }
}




