/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();

            if ("e".equalsIgnoreCase(nextLine)) {
                break;
            }

            byte[] bytes = nextLine.getBytes();
            
            try {
                baos.write(bytes);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        byte[] buffer = baos.toByteArray();
        
        System.out.println(Arrays.toString(buffer));
    }

}
