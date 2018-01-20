


package schoolprogramme;


public class SchoolRecords {
    
    private Student[] records;
    int count = 0;
    
    SchoolRecords(){
        records = new Student[20];
    }
    
    public void add(Student student){
        
        records[count] = student;
        count++;
    }
    public Student student(int a){
        
        for(int i = 0; i < 20; i++){
            Student student = records[i];
            if (student.studentNum == a){
                return student;
            }
        }
        
        return records[0];
    }
}
