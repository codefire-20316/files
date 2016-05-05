/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();

            if ("e".equalsIgnoreCase(nextLine)) {
                break;
            }

            lines.add(nextLine);
        }

        try {
            FileOutputStream fos = new FileOutputStream("file.txt", true);
            
            for (String line : lines) {
                byte[] bytes = line.getBytes();
                fos.write(bytes);
//                fos.flush();
            }
            
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
