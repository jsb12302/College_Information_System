/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassManagement;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author YOU
 */
public class AddNotOpenClassEdited {
    
    public void Add(String a) throws IOException{
    
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter("C:\\Class.txt",true));
             
            try (PrintWriter pw = new PrintWriter(bw,true)) {
                
                 pw.write(a+"\n");
                 pw.flush(); 
            } // try 구문 끝
            
     } //Add 메소드 끝 
     
}// 클래스 끝 

