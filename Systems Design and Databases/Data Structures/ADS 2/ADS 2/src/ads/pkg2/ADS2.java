// S_LinkedList_App.java
// program to test class S_LinkedList
// Adapted from Problem Solving with Java by Elliot Koffman and Ursula Woltz
// ADS class
// March 2017
package ads.pkg2;

import java.util.Scanner;


public class ADS2 {

    
    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
            
		LinkedList list = new LinkedList();
                
		
        System.out.println("list contains : "+list.toString());
		System.out.println("List has " + list.getSize() + " elements");
        System.out.println(" ");
		
                
        list.addFirst(2);
        list.addFirst(6);
        list.addFirst(3);
        System.out.println("list contains : "+list.toString());
        System.out.println("List has " + list.getSize() + " elements");
        System.out.println("First element is " + list.getFirst() + ", last element is " + list.getLast());                 
        System.out.println(" ");
                
		list.addLast(2);
        list.addLast(4);
		System.out.println("list contains : "+list.toString());
		System.out.println("List has " + list.getSize() + " elements");
		System.out.println("First element is " + list.getFirst() + ", last element is " + list.getLast());
        System.out.println(" ");
                
		list.addLast(3);
		System.out.println("list contains : "+list.toString());
		System.out.println("List has " + list.getSize() + " elements");
		System.out.println("First element is " + list.getFirst() + ", last element is " + list.getLast());
                
		list.addFirst(4);
		System.out.println("list contains : "+list.toString());
		System.out.println("List has " + list.getSize() + " elements");
		System.out.println("First element is " + list.getFirst() + ", last element is " + list.getLast());
                
		list.addFirst(5);
		System.out.println("list contains : "+list.toString());
		System.out.println("List has " + list.getSize() + " elements");
		System.out.println("First element is " + list.getFirst() + ", last element is " + list.getLast());
        System.out.println(" ");
		
		System.out.println("please enter the value to be searched:");
        
        int n = input.nextInt();

        ListNode current = list.searchPointer(n);
        if (current != null)
        {
            System.out.println("found value : " + current.data);
             int p = list.searchIndex(n);
             System.out.println("found value at position: " + p);
        }
        else
        {
            System.out.println("Value not found");
        }

                
        

        System.out.println(" ");
        System.out.println("please enter the node to be deleted");
        n = input.nextInt();
        System.out.println("deleting " + n + list.ordinality(n)  + " node...");
        list.delete(n);
        
        System.out.println(" ");
        System.out.println(list.toString());
        System.out.println("List has " + list.getSize() + " elements");
        System.out.println("First element is " + list.getFirst() +", last element is " + list.getLast()+"\n");

        int[] a = {1, 2, 3, 4, 5, 6, 7};
        LinkedList list2 = new LinkedList(a, 7);
        
        System.out.println(list2.toString());
        System.out.println("List has " + list2.getSize() + " elements");
        System.out.println("First element is " + list2.getFirst() + ", last element is " + list2.getLast());


        System.out.println("please enter the node index whose data need retrieving : ");
        int c = input.nextInt();
        System.out.println("node index " + c + " data value : " + list2.getAtPos(c)+"\n");

        System.out.println(list2.toString()+"\n");
        System.out.println("please enter the index after which to insert a new node");
        int i = input.nextInt();
        
        System.out.println("please enter the value you want to insert at the "+i+list2.ordinality(i)+" node");
        int v = input.nextInt();

        list2.addAfterPos(v, i);

        System.out.println(list2.toString());

        
        

		
	}// End of main 
    
}//end of ADS 2 class
