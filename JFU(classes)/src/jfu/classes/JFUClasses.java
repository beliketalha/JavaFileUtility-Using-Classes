/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfu.classes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Spidey-Talha
 */
public class JFUClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       createFile crt = new createFile();
       editFile edt = new editFile();
       deleteFile dlt = new deleteFile();
       
     int choice;
        Scanner copy = new Scanner(System.in);
        while(true)
        {
            System.out.println("--------MENU-------");
            System.out.println("1. Create a new file");
            System.out.println("2. Edit a file");
            System.out.println("3. Delete a file");
            System.out.println("4. EXIT");
            System.out.println("Enter your choice: ");
            choice = copy.nextInt();
            
            switch(choice)
            {
                case 1:
            {
                try {
                    crt.crtfile();
                } catch (IOException ex) {
                    Logger.getLogger(JFUClasses.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case 2:
            {
                try {
                    edt.edtfile();
                } catch (IOException ex) {
                    Logger.getLogger(JFUClasses.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case 3:
            {
                try {
                    dlt.dltfile();
                } catch (IOException ex) {
                    Logger.getLogger(JFUClasses.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }  
}
