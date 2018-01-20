


package schoolprogramme;


public class Module 
{
    String moduleCode;
    
    String[] moduleName = {"1. Maths","2. english","3. science","4. welsh","5. p.e","6. computing","7. sex ed","8. hobo studies"}; 
    
   Module(){
       
   }
   
   public static void showOptions(){
       String[] moduleName = {"1. Maths","2. english","3. science","4. welsh","5. p.e","6. computing","7. sex ed","8. hobo studies"};
       
       for(int i = 0; i < 8; i++){
           System.out.println(moduleName[i]);
       }
   }
   public static String numToString(int i){
       String[] moduleName = {"1. Maths","2. english","3. science","4. welsh","5. p.e","6. computing","7. sex ed","8. hobo studies"};
       
       
       return moduleName[i];
   }
   
}
