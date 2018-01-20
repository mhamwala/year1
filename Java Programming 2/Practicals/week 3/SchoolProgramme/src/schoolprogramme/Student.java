


package schoolprogramme;


public class Student {
    int studentNum;
    String name;
    
    int count = 0;
    String[] courses = new String[3];
    
    Student(int num, String Name){
        studentNum = num;
        name = Name;
    }
    
    public void addCourse(String a){
        courses[count] = a;
        count++;
    }
    public void viewDetails(){
        System.out.println(studentNum+"\n");
        System.out.println(name+"\n");
        
        for(int i = 0; i <3;i++){
        System.out.println(courses[i]+"\n");
        }
    }
}
