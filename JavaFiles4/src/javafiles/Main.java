/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiles;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        File[] listRoots = File.listRoots();

        System.out.println(Arrays.asList(listRoots));

        for (File root : listRoots) {
            System.out.println("Partition: " + root.getName());
            System.out.printf("Size:\t%dMB\nFree:\t%dMB\nUsable:\t%dMB\n", root.getTotalSpace() / 1024 / 1024,
                    root.getFreeSpace() / 1024 / 1024, root.getUsableSpace() / 1024 / 1024);
            System.out.printf("Size:\t%dGB\nFree:\t%dGB\nUsable:\t%dGB\n", root.getTotalSpace() / 1024 / 1024 / 1024,
                    root.getFreeSpace() / 1024 / 1024 / 1024, root.getUsableSpace() / 1024 / 1024 / 1024);
        }

    }

}
