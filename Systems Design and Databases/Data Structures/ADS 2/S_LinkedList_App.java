// S_LinkedList_App.java
// program to test class S_LinkedList
// Adapted from Problem Solving with Java by Elliot Koffman and Ursula Woltz
// ADS class
// March 2017



public class S_LinkedList_App
{
	public static void main(String[] args)
	{
		S_LinkedList slL = new S_LinkedList();
		System.out.println("List has " + slL.getSize() + " elements");
        Scanner input = new Scanner(System.in);
	/*	
		slL.addFirst(1);
		System.out.println(slL.toString());
		System.out.println("List has " + slL.getSize() + " elements");
		System.out.println("First element is " + slL.getFirst() +
							", last element is " + slL.getLast());
		slL.addLast(2);
		System.out.println(slL.toString());
		System.out.println("List has " + slL.getSize() + " elements");
		System.out.println("First element is " + slL.getFirst() +
							", last element is " + slL.getLast());
		slL.addLast(3);
		System.out.println(slL.toString());
		System.out.println("List has " + slL.getSize() + " elements");
		System.out.println("First element is " + slL.getFirst() +
							", last element is " + slL.getLast());
		slL.addFirst(4);
		System.out.println(slL.toString());
		System.out.println("List has " + slL.getSize() + " elements");
		System.out.println("First element is " + slL.getFirst() +
							", last element is " + slL.getLast());
		slL.addFirst(5);
		System.out.println(slL.toString());
		System.out.println("List has " + slL.getSize() + " elements");
		System.out.println("First element is " + slL.getFirst() +
							", last element is " + slL.getLast());
							
		System.out.println("please enter the value to be searched");
        int n = input.nextInt();
        
        S_ListNode current = slL.searchPointer(n);
        if (current != null)
        {
            System.out.println("found value : " + current.data);
        }
        
        int p = slL.searchIndex(n);
        if (p != -1)
            System.out.println("found value at position: " + p);
        
        System.out.println("please enter the node to be deleted");
        n = input.nextInt();
        System.out.println("deleting " + n + slL.ordinality(n)  + " node...");
        if (slL.delete(n) == true)
            System.out.println("delete() returned true");
        
        System.out.println(slL.toString());
        System.out.println("List has " + slL.getSize() + " elements");
        System.out.println("First element is " + slL.getFirst() +
                                                ", last element is " + slL.getLast());
        
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        S_LinkedList slL1 = new S_LinkedList(a, 7);
       
        System.out.println("List has " + slL1.getSize() + " elements");
        System.out.println(slL1.toString());
        System.out.println("First element is " + slL1.getFirst() +
                                                ", last element is " + slL1.getLast());
   
        System.out.println("please enter the node index whose data need retrieving");
        int p = input.nextInt();
        System.out.println("node index " + p + " data value : " + slL.getAtPos(p));
        
        System.out.println("please enter the index after which to insert a new node");
        int p = input.nextInt();
        if (slL.addAfterPos(10, p) == true)
            System.out.println("node inserted");
        System.out.println(slL.toString());
        
        S_LinkedList slL1 = new S_LinkedList();
        if (slL1.addAfterPos(29, 1) == true)
            System.out.println("node inserted in empty list");
        
        slL1.addFirst(29);
        if (slL1.addAfterPos(29, 1) == true)
            System.out.println("node inserted in single-node list");
	*/	
		
	}	
} // end class S_LinkedList_App