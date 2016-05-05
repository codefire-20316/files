/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file.txt");
            
            System.out.println("Available: " + fis.available());
            
            while (fis.available() > 0) {
                System.out.print((char)fis.read());
            }
            
            fis.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        System.out.println();
        
        try {
            FileInputStream fis = new FileInputStream("file.txt");
            
            System.out.println("Available: " + fis.available());
            
            byte[] buff = new byte[1024];
            
            int read = fis.read(buff);
            
            fis.close();
            
            String fileContent = new String(buff, 0, read);
            
            System.out.println(fileContent);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        System.out.println();
    }

}
