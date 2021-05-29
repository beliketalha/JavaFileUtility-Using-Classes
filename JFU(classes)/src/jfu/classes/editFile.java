/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfu.classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Spidey-Talha
 */
public class editFile {
    String finame,str;
    Scanner scan = new Scanner(System.in);                
    public void edtfile() throws IOException{
        // enter file name with extension to edit
                    System.out.print("Enter File Name to Edit : ");
                    finame = scan.nextLine();
                    
                        String verify, putData;
                        File file = new File(finame);
        boolean createNewFile = file.createNewFile();
                        FileWriter fw = new FileWriter(file);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("Some text here for a reason");
                        bw.flush();
                        bw.close();
                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);

                        while( (verify=br.readLine()) != null ){ //***editted
                                   //**deleted**verify = br.readLine();**
                            if(verify != null){ //***edited
                                putData = verify.replaceAll("here", "there");
                                bw.write(putData);
                            }
                        }
                        br.close();


                    }
    }

