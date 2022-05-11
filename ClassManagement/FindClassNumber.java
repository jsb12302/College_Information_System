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

public class FindClassNumber {
    public ArrayList<String> lineArray = new ArrayList<String>();
    private String result;
    
    public void Find() {
        try {
            File text = new File("C:\\Class.txt");
            FileReader textRead = new FileReader(text);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                lineArray.add(line);
                //System.out.println(lineArray);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//find메소드 끝 
    
    public boolean FindLine(String a) {
        
        for (int i = 0; i < lineArray.size(); i++) {
            if (lineArray.get(i).contains(a)) {
                System.out.println(lineArray.get(i));
                
                //System.out.println(result);
                return true;
            }
        }
        return false;
    } // FindLine 메소드 끝 

    public String getResult() {
        return result;
    }
    
    /**
     *
     * @param a
     * @return
     */
    public String GetLine(String a){ // 문제점 : if문에 맞는 Arraylist의 내용을 특정한 스트링에 대입을 하지 못한다.  
        
        for (int i = 0; i < lineArray.size(); i++) {
            
            if (lineArray.get(i).contains(a)) {
                  
                result =  lineArray.get(i);
                 System.out.println(lineArray);
              } // if문 끝
                      
        } // for문 끝
        
        return result;
    } // GetLine 메소드 끝
    
}//클래스 끝
