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
        
        File dir1 = new File("subdir");
        File dir2 = new File("subdir/two/three");
        
        if (!dir1.exists()) {
            dir1.mkdir();
        }
        
        if (!dir2.exists()) {
            dir2.mkdirs();
        }
        
        File text1 = new File("file.txt");
        
        if (!text1.exists()) {
            text1.createNewFile();
        }
        
        
        File text2 = new File(dir1, "file.txt");
        
        if (!text2.exists()) {
            text2.createNewFile();
        }
        
        File text3 = new File(dir2, "file.txt");
        
        if (!text3.exists()) {
            text3.createNewFile();
        }
    }
    
}
