package studentmaneger;

import java.util.*;

/**
 *
 * @author Musa Hamwala II
 */
public class StudentManeger {
    HashMap<String,Student> register = new HashMap<String,Student>();
    String[] modules = new String[10];
    Student student;
    int moduleCount = 0;
    StudentManeger(){
        
    }
    
    public void putMark(String name, String module, Integer mark){
        
        boolean newModule = true;
        
        for(int i = 0; i < 10;i++){
            if(module.equals(modules[i])){
                newModule = false;
                break;
            }
        }
        if(newModule == true){
            modules[moduleCount] = module;
            moduleCount++;
        }
        
        
        
        student = new Student(name);
        student.putMark(module, mark);
        
        register.put(name,student);
                
    }
    
    public int getMark(String name, String module){
        
        
        Student student = register.get(name);
        
        int mark = student.getMark(module);
        
        
        return mark;
    }
    
    public double getStuAverage(String name){
        
        Student student = register.get(name);
        double average = student.averageMark();
        
        return average;
    }
    
    public int[] numModuleFails(){
        
        int[]marks = new int[2];
        int TotalFails = 0;
        int fails = 0;
        int StudentFails= 0;
        for(String key : register.keySet()){
            Student student = register.get(key);
            
            fails = student.numFails();
            if(fails!= 0){
                StudentFails++;
            }
            TotalFails += fails;
        }
        marks[0] = TotalFails;
        marks[1] = StudentFails;
        return marks;
        
    }
    public void addCourse(String name, String module,int mark){
        
        Student student = register.get(name);
        
        boolean newModule = true;
        
        for(int i = 0; i < 10;i++){
            if(module.equals(modules[i])){
                newModule = false;
                break;
            }
        }
        if(newModule == true){
            modules[moduleCount] = module;
            moduleCount++;
        }
        
        student.putMark(module,mark);
        
    }
    public Double overallAverage(){
        
        double average= 0;
        int numOfStus = 0;
        for(String key : register.keySet()){
            
            numOfStus++;
            
            Student student = register.get(key);
            average += student.averageMark();
        }
        average = average / numOfStus;
        
        return average;
    }
    public void printModules(){
        
        for(int i = 0;i < 10; i++)
        System.out.println(modules[i]);
    }
    public double moduleAverage(String mod){
        double AverageMarks= 0;
        double totalStudies=0;
        for(String key : register.keySet()){
            
            Student student = register.get(key);
            
            AverageMarks += student.moduleGrade(mod);
            if(AverageMarks != 0){
                totalStudies++;
            }
        }
       if(totalStudies == 0 || totalStudies == 1){
           return AverageMarks;
       }else{
       return AverageMarks/totalStudies; 
       }
    }
}
