package studentmaneger;

import java.util.*;

/**
 *
 * @author Musa Hamwala II
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StudentManeger manager = new StudentManeger();
        Scanner in = new Scanner(System.in);
        int input;

       do
        {
            System.out.println("1. Students : \n2. Modules :\n0. Exit :\n");
            input = in.nextInt();
            System.out.println(" ");
            
            if(input == 1)
                
            {
                student(in,manager);
                System.out.println(" ");
            }
            else if(input == 2)
            {
                modules(in,manager);
                System.out.println(" ");
            }

        
        }while(input != 0);
    }
        public static void student(Scanner in,StudentManeger manager)
        { 
            System.out.println("1. Enrol Student : \n2. Student details : \n3. student averages\n0. Exit :\n");
            int input = in.nextInt();
            
            if(input == 1)
            {
                System.out.println("Student name?");
                String name = in.next();
                
                System.out.println("Module name?");
                String module = in.next();
                
                System.out.println("Module Mark?");
                int mark = in.nextInt();
                
                
                manager.putMark(name,module,mark);
                int yes = 1;
                while(yes == 1){
                    
                
                    System.out.println("next course is : ");
                    String newModule = in.next();
                    
                    System.out.println("what marks? ");
                    int newMarks = in.nextInt();
                
                    manager.addCourse(name,newModule,newMarks);
                
                    System.out.println("add more courses? 1 for yes, 0 for no");
                    yes = in.nextInt();
                    System.out.println(" ");
                }
                
            }
            else if(input == 2)
            {
                
                System.out.println("Student name?");
                String name = in.next();
                
                System.out.println("module?");
                String module = in.next();
                
                
                int marks = manager.getMark(name, module);
                
                System.out.println("marks for "+module+" : "+marks);
                System.out.println(" ");
                
            }else if(input == 3){
                
                 System.out.println("Student name?");
                 String name = in.next();
                 double average = manager.getStuAverage(name);
                 System.out.println(name+"s average marks are : "+average);
                 System.out.println(" ");
                 
            }
            
            
        }
        
        public static void modules(Scanner in,StudentManeger manager)
        { 
            System.out.println("1. Module Average : \n2. NumberStudentFails : \n3. School Average:\n0. Exit :\n");
           
            int input = in.nextInt();
            
            if(input == 1)
            {
                manager.printModules();
                System.out.println("What module would you like to see the average off? ");
                String mod = in.next();
                
                double average = manager.moduleAverage(mod);
                System.out.println("The average marks for : "+mod+" are : "+average);
            }
            else if(input == 2)
            {
                int marks[] = manager.numModuleFails();
                System.out.println("total modules failed : "+marks[0]+" total students who failed : "+marks[1]);
            }
            else if(input == 3)
            {
                Double averageGrade = manager.overallAverage();
                System.out.println("The Average grade here is : "+averageGrade);
            }
            else
            {
                manager.printModules();
            }
        }

        
    
}
