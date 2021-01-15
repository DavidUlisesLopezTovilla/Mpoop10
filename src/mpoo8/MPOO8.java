/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoo8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class MPOO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("1***************");
        System.out.println("File");
        
        /**
         * ejecicio 1
         */
        File archivo = new File("miArchivo");
        System.out.println(archivo.exists());
        try{
            boolean seCreo = archivo.createNewFile();
            System.out.println(seCreo);
        }catch(IOException e){}
        
        System.out.println(archivo.exists());
        
        System.out.println("2*****************");
        System.out.println("FileOutStream");
        
        /**
         *  ejecicio 2
         */
        FileOutputStream fos = null;
        byte[] buffer = new byte[81];
        int nBytes;
        
        try{
            System.out.println("Escribe el texto a guardar en el archivo: ");
            nBytes = System.in.read(buffer);
            fos = new FileOutputStream("fos.txt");
            fos.write(buffer,0,nBytes);
        }catch(IOException e){
        }
        finally{
            try{
            if (fos != null){
                fos.close();
            }
           }catch(IOException e){}
        }   
        
        System.out.println("3******************");
        System.out.println("FileInputStream");
        
        /**
         * ejecicio 3
         */
        FileInputStream fis = null;
        
        fis = new FileInputStream("fos.txt");
        nBytes = fis.read(buffer,0,81);
        String textoLeido = new String(buffer,0,nBytes);
        System.out.println(textoLeido);
        
        if (fis != null)
            fis.close();
    }
}
