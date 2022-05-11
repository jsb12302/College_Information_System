/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SukangManage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author 순범
 */
public class SetGrade {
    
     public ArrayList<String> lineArray = new ArrayList<String>();
        
    public void Delete() throws IOException{
        
        try {
            File text = new File("C:\\Sukang.txt");
            FileReader textRead = new FileReader(text);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                lineArray.add(line);
            }   
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public void FindLine(String a) throws IOException {
        for (int i = 0; i < lineArray.size(); i++) {
            if (lineArray.get(i).contains(a)) {
                lineArray.remove(lineArray.indexOf(lineArray.get(i)));
            }
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Sukang.txt",false));
      PrintWriter pw = new PrintWriter(bw,true);
      for(int i = 0; i < lineArray.size(); i++){
         pw.write(lineArray.get(i)+"\n");
      }
       pw.flush();
      pw.close();
      
}
    public void Add(String a) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Sukang.txt",true));
        PrintWriter pw = new PrintWriter(bw,true);
        pw.write(a+"\n");
        pw.flush();
        pw.close();
        
    }
    
    
}
