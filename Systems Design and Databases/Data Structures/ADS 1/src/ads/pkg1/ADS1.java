/* ArrayADT_App.java
 * program to exercise the class ArrayADT
 * ADS class
 * January 2016
 */
package ads.pkg1;


public class ADS1 {

    
    public static void main(String[] args) {
        
        
        ArrayADT array1 = new ArrayADT(5);
        
        System.out.println(array1.toString());
        
        array1.insert(3, 3);
        System.out.println(array1.toString());
        
        array1.insert(5, 3);
        System.out.println(array1.toString());
        
        array1.insert(2, 4);
        System.out.println(array1.toString());
        
        array1.insert(7, 1);
        System.out.println(array1.toString());

        int[] b = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        ArrayADT array2 = new ArrayADT(b);
        
        System.out.println(array2.toString());
        
        array2.remove(4);
        System.out.println(array2.toString());

        array2.increaseArraySize(15);
        System.out.println(array2.toString());
        
        array2.insert(11, 11);
        System.out.println(array2.toString());
        
        System.out.println("array :  "+array2.retrieve(14));
      
        int[] c = array2.copyArray();
    
        System.out.println(c.length);
        
        System.out.println(array2.getNoOfItemsInArray());
        
        array2.destroy();
	
        System.out.println(array2.toString());
        
        ArrayADT empty = new ArrayADT(5);
        
        int[] full = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        ArrayADT Full = new ArrayADT(full);
        System.out.println("Empty" + empty.toString());
        
        empty.isEmpty();
        
        empty.insert(3, 1);
        System.out.println(empty.toString());
        
        empty.isEmpty();
        
     
        
        
        
    }//End of main 
    
}//end of ADS 1
