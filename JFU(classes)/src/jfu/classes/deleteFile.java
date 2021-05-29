/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfu.classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Spidey-Talha
 */
public class deleteFile {
    String fname;
                    
    public void dltfile() throws IOException{
    Scanner scan = new Scanner(System.in);
    // enter file name with extension to delete
                    System.out.print("Enter File Name to Delete : ");
                    fname = scan.nextLine();

                    
        try (BufferedWriter out = new BufferedWriter(new FileWriter(fname))) {
            out.write("aString1\n");
        }
                       boolean success = (new File(fname)).delete();
                       if(success)
                       {
                          System.out.println("The File '" + fname + "' has been Deleted Successfully..!!"); 

                       }
        String e = null;
                    
                    
                          System.out.println("Exception Occurred : " + e);
                          System.out.println("File does not exist or deleted..!!");
                       
    }
}
