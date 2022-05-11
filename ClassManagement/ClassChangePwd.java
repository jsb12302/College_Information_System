/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassManagement;

import HacksaManage.*;
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
public class ClassChangePwd {
     public ArrayList<String> ClassArray = new ArrayList<String>();
     String []c=new String[10];
     
     public void CompareClassPWD() {
         
        try {
            File text = new File("C:\\ClassAdmin.txt");
            FileReader textRead = new FileReader(text);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                ClassArray.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
     public void SplitLine(String a){
        
        for (int i = 0; i < ClassArray.size(); i++) {
            if (ClassArray.get(i).contains(a)) {  
                a=ClassArray.get(i);
                c=a.split(" ");
            }
        }
        }
      public String CSPline0(){
            return c[0];
        }   
        
        public String CSPline1(){
            return c[1];
        }   
          public void ChangePWD(String a) throws IOException{
          BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\ClassAdmin.txt",false));
      PrintWriter pw = new PrintWriter(bw,true);
      pw.write(a+"\n");
       pw.flush();
      pw.close();
    }
    
}
