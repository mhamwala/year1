


package schoolprogramme;


public class SchoolProgramme {

    
    public static void main(String[] args) {
        char choice;
      
        SchoolRecords Records = new SchoolRecords();
        
        do
        {
            System.out.println();
            System.out.println("1, Add Student");
            System.out.println("2, Remove Student from course");
            System.out.println("3, Remove student from all");
            System.out.println("4, View All");
            System.out.println("5, Course Attendence");
            System.out.println("6, Quit");
            System.out.println();
            System.out.print("Enter choice [1-6]: ");

            // get choice
            choice = EasyScanner.nextChar();
            System.out.println();

            // process menu options
            switch (choice)
            {
                case '1': addStudent(Records);
                          break;
                case '2': removeStudentCourse();
                          break;
                case '3': removeStudent();
                          break;
                case '4': viewStudent(Records);
                          break;
                case '5': courseAttendence();
                          break;
                case '6': System.out.println("Goodbye");
                          break;
                default : System.out.println("Invalid entry");
            }
        }while (choice != '6');
    }
    
    public static void addStudent(SchoolRecords Records){
        System.out.println("Student Name is : \n");
        String name = EasyScanner.nextWord();
        
        System.out.println("Student Number is : \n");
        int num = EasyScanner.nextInt();
        
        Student student = new Student(num,name);
        
        for(int i = 0; i < 3; i++){
            
        System.out.println("pls pick 3 options to study (one at a time) : \n");
        Module.showOptions();
        int option = EasyScanner.nextInt();
        option = option - 1;
        
        String a = Module.numToString(option);
            
        student.addCourse(a);
        
        Records.add(student);
        
        
        }
        
    }
    public static void removeStudentCourse(){
        
    }
    public static void removeStudent(){
        
    }
    public static void viewStudent(SchoolRecords Records){
        
        System.out.println("What is your Student Number : \n");
        int num = EasyScanner.nextInt();
        
        Student student = Records.student(num);
        
        student.viewDetails();
        
        
        
        
    }
    public static void courseAttendence(){
        
    }
    
}
