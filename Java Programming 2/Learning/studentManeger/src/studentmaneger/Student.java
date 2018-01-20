package studentmaneger;

import java.util.*;

/**
 *
 * @author Musa Hamwala II
 */
public class Student {
    
    String Name;
    HashMap<String,Integer> marks = new HashMap<String,Integer>();
    
    Student(String name){
        Name = name;
    }
    
    public void putMark(String module,Integer mark){
        
      marks.put(module,mark);
    }
    
    public int getMark(String module){
        
        int mark = marks.get(module);
        return mark;
    }
    
    public String getName(){
        
        return "";
    }
    
    public double averageMark(){
        int total = 0;
        int modules = 0;
        
        for(String key : marks.keySet()){
            modules++;
            total = total + marks.get(key);
        }
        
        return total/modules;
    }
    
    public int numFails(){
        int totalFails = 0;
        for(String key : marks.keySet()){
            int passMark = marks.get(key);
            if(passMark < 40){
                totalFails++;
            }
        }
        return totalFails;
    }
    public int moduleGrade(String mod){
        
        boolean a = marks.containsKey(mod);
        if(a == true){
        int mark = marks.get(mod);
        
        return mark;
        }else{
            return 0;
        }
    }
    
    
}
