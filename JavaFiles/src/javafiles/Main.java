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
        
        File dir = new File("./");
        
        System.out.println("Exists dir? " + dir.exists());
        
        File txt = new File("file.txt");
        
        System.out.println("Exists txt? " + txt.exists());
        
        System.out.println("Absolute path:");
        System.out.println(dir.getAbsolutePath());
        System.out.println(txt.getAbsolutePath());
        
        System.out.println("Canonical path:");
        System.out.println(new File("../JavaFiles/bin/../").getAbsolutePath());
        System.out.println(new File("../JavaFiles/bin/../").getCanonicalPath());
        
        System.out.println("Name:");
        System.out.println(dir.getName());
        System.out.println(dir.getAbsoluteFile().getName());
        System.out.println(dir.getCanonicalFile().getName());
        System.out.println(txt.getName());
    }
    
}
