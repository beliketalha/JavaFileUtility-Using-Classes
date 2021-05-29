/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfu.classes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Spidey-Talha
 */
public class createFile {
    
    public void crtfile() throws FileNotFoundException, IOException{ 
                    Scanner sc=new Scanner(System.in);         //object of Scanner class  
                    System.out.print("Enter the file name: ");  
                    String name=sc.nextLine();              //variable name to store the file name  
                    try (FileOutputStream fos = new FileOutputStream(name, true) // true for append mode
                    ) {         
                        System.out.print("Enter file content: ");
                        String str=sc.nextLine()+"\n";      //str stores the string which we have entered  
                        byte[] b= str.getBytes();       //converts string into bytes  
                        fos.write(b); //writes bytes into file
                        //close the file  
                    }
                        System.out.println("file saved.");    
    }
}
