/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastream;

import java.io.ByteArrayInputStream;
import java.util.Random;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// InputStream
// OutputStream

        byte []buff  = new byte[1024];
        
        Random random = new Random();
        random.nextBytes(buff);

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(buff);
        
        while (arrayInputStream.available() > 0) {
            int nextByte = arrayInputStream.read();
            System.out.print((char)nextByte);
        }
    }

}
