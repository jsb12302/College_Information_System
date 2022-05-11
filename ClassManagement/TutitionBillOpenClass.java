/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author 순범
 */
public class TutitionBillOpenClass {
    
     public ArrayList<String> lineArray = new ArrayList<String>();
     String []b=new String[10];
     
      public void Find() {
        try {
            File text = new File("C:\\OpenClass.txt");
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
      
    public String FindLine(String a) {
        for (int i = 0; i < lineArray.size(); i++) {
            if (lineArray.get(i).contains(a)) {
                return lineArray.get(i);
            }
        }
        return null;
    }  
    
      public void SplitLine(String a){
        
        for (int i = 0; i < lineArray.size(); i++) {
            if (lineArray.get(i).contains(a)) {  
                a=lineArray.get(i);
                b=a.split(" ");
            }
        }
        }
      
      public String SPline3(){
            return b[3];
        } 
}
