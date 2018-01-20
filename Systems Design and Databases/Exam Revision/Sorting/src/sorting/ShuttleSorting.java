package sorting;

/**
 *
 * @author q5047119
 */
public class ShuttleSorting {

    public static void main(String[] args) 
    {
        {
            int shuttle[] = new int[]{3, 5, 4, 5, 1, 334, 5,6};
            shuttle(shuttle);       
        } 
    }

    private static void shuttle(int shuttle[]) 
    {
        boolean Test = true;
        int a;
        int length = shuttle.length;
        while(Test)
        {
            System.out.println("df");
            if(length != 1){
                for(int i = 0; i < shuttle.length; i++)
                {
                    if (shuttle[i] < shuttle[i + 1]) 
                        {
                            a = shuttle[i];                
                            shuttle[i] = shuttle[i + 1];
                            shuttle[i + 1] = a;

                        }
                    else
                        {
                            length = -1;
                        }
                    System.out.println("Sorted list: " + shuttle[i]);
                }
            }
            
        }
    }
}
