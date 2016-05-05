/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiles;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        File projectDir = new File("./");

//        String[] list = projectDir.list();
//        
//        for (String name : list) {
//            System.out.println(name);
//        }
//        File[] listFiles = projectDir.listFiles();
//
//        for (File sub : listFiles) {
//            System.out.println(sub.getName());
//        }

        listing(projectDir, 1);
    }

    /**
     * Recursive listing files method.
     * @param base directory for scan.
     * @param level level from start.
     */
    public static void listing(File base, int level) {
        for (int i=0; i<level; i++) {
            System.out.print("  ");
        }
        
        if (base.isDirectory()) {
            System.out.println("+ " + base.getName());
            File[] listFiles = base.listFiles();
            // null if empty directory
            if (listFiles != null) {
                for (File sub : listFiles) {
                    listing(sub, level + 1);
                }
            }
        } else if (base.isFile()) {
            System.out.println("  " + base.getName());
        }
    }

}
