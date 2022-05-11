/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassManagement;

/**
 *
 * @author YOU
 *  수강정보관리시스템 
 */
abstract public class ClassManagementSys {
    
    private String ClassNum;
    private String ClassName;
    private String Charged_Major;
    private String Point;
    private String ClassInfo;
    private String min;
    private String max;
    
    public ClassManagementSys() {
        
        ClassNum = null;
        ClassName = null;
        Charged_Major = null;
        Point = null;
        ClassInfo = null;
        min = null;
        max = null;        
    }
    
    public ClassManagementSys(String ClassNum, String CalssName, String Charged_Major, String Point, String ClassInfo, String min, String max) {
        
        this.ClassNum = ClassNum;
        this.ClassName = CalssName;
        this.Charged_Major = Charged_Major;
        this.Point = Point;
        this.ClassInfo = ClassInfo;
        this.min = min;
        this.max = max;
    }

    public String getClassNum() {
        return ClassNum;
    }

    public String getCalssName() {
        return ClassName;
    }

    public String getCharged_Major() {
        return Charged_Major;
    }

    public String getPoint() {
        return Point;
    }

    public String getClassInfo() {
        return ClassInfo;
    }

    public String getMin() {
        return min;
    }

    public String getMax() {
        return max;
    }

    public void setClassNum(String ClassNum) {
        this.ClassNum = ClassNum;
    }

    public void setCalssName(String CalssName) {
        this.ClassName = CalssName;
    }

    public void setCharged_Major(String Charged_Major) {
        this.Charged_Major = Charged_Major;
    }

    public void setPoint(String Point) {
        this.Point = Point;
    }

    public void setClassInfo(String ClassInfo) {
        this.ClassInfo = ClassInfo;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public void setMax(String max) {
        this.max = max;
    }
       
}
