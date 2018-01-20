/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads1;

/**
 *
 * @author q5047119
 */
public class ADS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] a = {1,2,3,4,5};
        
        DLinkedList list = new DLinkedList(a);
        
        System.out.println(list.toString_in_reverse());
        
    }
    
}
