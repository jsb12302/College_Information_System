/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassManagement;

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
 * @author YOU
 */
public class OpenedClassEdit {
     
    public ArrayList<String> lineArray = new ArrayList<String>();
    String []b=new String[10];
    String [][]ClassArray = new String [lineArray.size()][6]; //테이블에 추가할 스트링배열. 
    
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
    
     public void FindLine(String a) throws IOException {
           
         for (int i = 0; i < lineArray.size(); i++) {
            if (lineArray.get(i).contains(a)) {
                lineArray.remove(lineArray.indexOf(lineArray.get(i)));
            }
        }
                               
      BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\OpenClass.txt",false));
      PrintWriter pw = new PrintWriter(bw,true);
      
      for(int i = 0; i < lineArray.size(); i++){
         pw.write(lineArray.get(i)+"\n");
      }
      
      pw.flush();
      pw.close();
//         String FindStr = new String();
//         
//        for (int i = 0; i < lineArray.size(); i++) {
//            
//            if (lineArray.get(i).contains(a)) {
//            
//                FindStr = lineArray.get(i);
//                //return lineArray.get(i);
//            }
//            
//        }
        
        
    }
     
        public void SplitLine(String a){
        
            for (int i = 0; i < lineArray.size(); i++) {
                
                if (lineArray.get(i).contains(a)) {  
                
                    a=lineArray.get(i);
                    b=a.split(" ");
                }//if문 끝
                
            }//for문 끝
        
        }// SplitLine 메소드 끝
        
        public void intoStringArray(){
            
            for(int i = 0; i < lineArray.size(); i++){
                
                for(int y = 0; i < 7; i++){
                    
                    ClassArray[i][y] = b[i];
                }
            }
            
        }
        
        public String SPline0(){
            return b[0];
        }   
        
        public String SPline1(){
            return b[1];
        }   
        
        public String SPline2(){
            return b[2];
        }   
        
        public String SPline3(){
            return b[3];
        }   
        
        public String SPline4(){
            return b[4];
        }   
        
        public String SPline5(){
            return b[5];
        }   
        
        public String SPline6(){
            return b[6];
        }   
}
