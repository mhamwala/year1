// D_LinkedList_App.java
// program to test class D_LinkedList
// adapted from Problem Solving with Java by Elliot Koffman and Ursula Woltz
// ADS class
// March 2017

import java.util.Scanner;

public class D_LinkedList_App
{
    public static void main(String[] args)
    {
        
        D_LinkedList dlL = new D_LinkedList();
        System.out.println("List has " + dlL.getSize() + " elements");
        Scanner input = new Scanner(System.in);
    /*    
        dlL.addFirst(1);
        System.out.println("List has " + dlL.getSize() + " elements");
        System.out.println("from left to right");
        System.out.println(dlL.toString());
        System.out.println("First element is " + dlL.getFirst() +
                                                ", last element is " + dlL.getLast());
        System.out.println("from right to left");
        System.out.println(dlL.toString_in_reverse());
        
        dlL.addLast(2);
        System.out.println("List has " + dlL.getSize() + " elements");
        System.out.println("from left to right");
        System.out.println(dlL.toString());
        System.out.println("First element is " + dlL.getFirst() +
                                                ", last element is " + dlL.getLast());
        System.out.println("from right to left");
        System.out.println(dlL.toString_in_reverse());
        
        dlL.addLast(3);
        System.out.println("List has " + dlL.getSize() + " elements");
        System.out.println("from left to right");
        System.out.println(dlL.toString());
        System.out.println("First element is " + dlL.getFirst() +
                                                ", last element is " + dlL.getLast());
        System.out.println("from right to left");
        System.out.println(dlL.toString_in_reverse());
        
        dlL.addFirst(4);
        System.out.println("List has " + dlL.getSize() + " elements");
        System.out.println("from left to right");
        System.out.println(dlL.toString());
        System.out.println("First element is " + dlL.getFirst() +
                                                ", last element is " + dlL.getLast());
        System.out.println("from right to left");
        System.out.println(dlL.toString_in_reverse());
        
        dlL.addFirst(5);
        System.out.println("List has " + dlL.getSize() + " elements");
        System.out.println("from left to right");
        System.out.println(dlL.toString());
        System.out.println("First element is " + dlL.getFirst() +
                                                ", last element is " + dlL.getLast());
        System.out.println("from right to left");
        System.out.println(dlL.toString_in_reverse());
        
        System.out.println("please enter the value to be searched");
        int n = input.nextInt();
        
        D_ListNode current = dlL.searchPointer(n);
        if (current != null)
        {
            System.out.println("found value : " + current.data);
        }
        
        int p = dlL.searchIndex(n);
        if (p != -1)
            System.out.println("found value at position: " + p);
        
        System.out.println("please enter the node to be deleted");
        n = input.nextInt();
        System.out.println("deleting " + n + dlL.ordinality(n)  + " node...");
        if (dlL.delete(n) == true)
            System.out.println("delete() returned true");
        
        System.out.println("from left to right");
        System.out.println(dlL.toString());
        System.out.println("List has " + dlL.getSize() + " elements");
        System.out.println("First element is " + dlL.getFirst() +
                                                ", last element is " + dlL.getLast());
        System.out.println("from right to left");
        System.out.println(dlL.toString_in_reverse());
        
        
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        D_LinkedList dlL1 = new D_LinkedList(a, 7);
       
        System.out.println("List has " + dlL1.getSize() + " elements");
        System.out.println("from left to right");
        System.out.println(dlL1.toString());
        System.out.println("First element is " + dlL1.getFirst() +
                                                ", last element is " + dlL1.getLast());
        System.out.println("from right to left");
        System.out.println(dlL1.toString_in_reverse());
   
        System.out.println("please enter the node index whose data need retrieving");
        int p = input.nextInt();
        System.out.println("node index " + p + " data value : " + dlL.getAtPos(p));
        
        System.out.println("please enter the index after which to insert a new node");
        int p = input.nextInt();
        if (dlL.addAfterPos(10, p) == true)
            System.out.println("node inserted");
        System.out.println("from left to right");
        System.out.println(dlL.toString());
        System.out.println("from right to left");
        System.out.println(dlL.toString_in_reverse());
        
        D_LinkedList dlL1 = new D_LinkedList();
        if (dlL1.addAfterPos(29, 1) == true)
            System.out.println("node inserted in empty list");
        
        dlL1.addFirst(29);
        if (dlL1.addAfterPos(29, 1) == true)
            System.out.println("node inserted in single-node list");
	*/
        
    }
	
} // end class D_LinkedList_App