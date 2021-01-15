/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Ulises
 */
public class BufferLector {
    public static void main(String[] args) {
        System.out.println("4****************");
        System.out.println("FileWrite");
        /**
         * ejecicio 4
         */
        String texto = "";
        BufferedReader br;
        try{
            
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe el texto a guardar");
            texto = br.readLine();
            System.out.println(texto);
            
            FileWriter fw = new FileWriter("ticket.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            
            salida.println(texto);
            salida.println("Texto estático");
            System.out.println("Linea 3");
            salida.close();
            
        }catch(IOException e){}
        
        System.out.println("5******************");
        System.out.println("FileReader");
        
        /**
         * ejecicio 5
         */
        FileReader fr;
        try{
            fr = new FileReader("ticket.txt");
            br = new BufferedReader(fr);
            System.out.println("El contenido del archivo es: ");
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        }catch(IOException ioe){}
        
    }
}
