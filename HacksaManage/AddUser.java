/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HacksaManage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.*;

public class AddUser  {

    
    public void Add(String a) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\PersonInfo.txt",true));
        PrintWriter pw = new PrintWriter(bw,true);
        pw.write(a+"\n");
        pw.flush();
        pw.close();
        
    }
    public void go(){
        System.out.println("hi");
    }
    
}
