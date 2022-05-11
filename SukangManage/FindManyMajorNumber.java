/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SukangManage;

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
public class FindManyMajorNumber {
    int c;
     String []b=new String[10];
     public ArrayList<String> lineArray = new ArrayList<String>();
    
     public void Find() {
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
     
     public int FindNumOfMajor(String a){ //강의번호 갯수 새기
         for (int i = 0; i < lineArray.size(); i++) {
            if (lineArray.get(i).contains(a)) {
               c++;
            }
        }
         //System.out.println(c);
        return c;
     }
     
     public void Find(String a){ //강의 최대수강인원 수
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
     public int Max(String a){
         for (int i = 0; i < lineArray.size(); i++) {
            if (lineArray.get(i).contains(a)) {  
                a=lineArray.get(i);
                b=a.split(" ");
            }
        }
         int tmp=Integer.parseInt(b[6]);
         System.out.println(tmp);
         return tmp;
     }
}
    

