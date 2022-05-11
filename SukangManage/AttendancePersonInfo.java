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
public class AttendancePersonInfo {
    
    public ArrayList<String> Array = new ArrayList<String>();
     String []c=new String[10];
    public void FindNmae() {
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
         public String NFind(String a) {
        for (int i = 0; i < Array.size(); i++) {
            if (Array.get(i).contains(a)) {
                return Array.get(i);
            }
        }
        return null;
    }
            public void SplitLine(String d){
        
        for (int i = 0; i < Array.size(); i++) {
            if (Array.get(i).contains(d)) {  
                d=Array.get(i);
                c=d.split(" ");
            }
        }
        }
          public String NSPline2(){//이름
            return c[2];
        } 
}
