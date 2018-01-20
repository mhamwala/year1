package sorting;

/**
 *
 * @author q5047119
 */
public class Sorting {

    public static void main(String[] args) {
        {
            int i= 0;
            int bubble[] = new int[]{5, 4, 3, 2, 1};
            boolean Test = true;
            int a;

            while (Test) {
                Test = false;
                for (i = 0; i < bubble.length - 1; i++) {
                    
                    if (bubble[i] < bubble[i + 1]) 
                    {
                        a = bubble[i];                
                        bubble[i] = bubble[i + 1];
                        bubble[i + 1] = a;
                        
                        Test = true;
                    }   
                    System.out.println("Sorted list: " + bubble[i]);                 
                }                 
            }
        } 
    }
}
