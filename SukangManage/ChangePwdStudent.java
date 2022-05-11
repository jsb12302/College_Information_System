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
public class ChangePwdStudent {
    
     public ArrayList<String> Array = new ArrayList<String>();
      public ArrayList<String> lineArray = new ArrayList<String>();
     String []b=new String[10];
     
      public void Find() {
        try {
            File text = new File("C:\\PersonInfo.txt");
            FileReader textRead = new FileReader(text);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                Array.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
      
   public void SplitLine(String a){
        
        for (int i = 0; i < Array.size(); i++) {
            if (Array.get(i).contains(a)) {  
                a=Array.get(i);
                b=a.split(" ");
            }
        }
        }
     public String SPline0(){//ID
            return b[0];
        }   
        
        public String SPline1(){//비밀번호
            return b[1];
        }   
         public String SPline2(){//이름
            return b[2];
        }
          public String SPline3(){//주민번호
            return b[3];
        }
           public String SPline4(){//학과
            return b[4];
        }
           
           public void Delete() throws IOException{
        
        try {
            File text = new File("C:\\PersonInfo.txt");
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
           
            public void FindLine(String a) throws IOException {//한줄 지우고 다 다시씀
        for (int i = 0; i < lineArray.size(); i++) {
            if (lineArray.get(i).contains(a)) {
                lineArray.remove(lineArray.indexOf(lineArray.get(i)));
            }
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\PersonInfo.txt",false));
      PrintWriter pw = new PrintWriter(bw,true);
      for(int i = 0; i < lineArray.size(); i++){
         pw.write(lineArray.get(i)+"\n");
      }
       pw.flush();
      pw.close();
}
            
             public void Add(String a) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\PersonInfo.txt",true));
        PrintWriter pw = new PrintWriter(bw,true);
        pw.write(a+"\n");
        pw.flush();
        pw.close();
        
    }
    
}
