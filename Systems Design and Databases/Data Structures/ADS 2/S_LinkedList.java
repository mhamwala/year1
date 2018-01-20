// LinkedList.java
// program demonstrating the implementation and use of a singly linked-list in java
// Adapted from Problem Solving with Java by Elliot Koffman and Ursula Woltz
// ADS class
// March 2017

public class S_LinkedList
{
	
	// DATA field (member variable)
	
	ListNode head;		// first list node
	
	// CONSTRUCTORS
	
	// default constructor, creates an empty linked-list
	public S_LinkedList()
	{
		head = null;
	}
	
	// Constructor - creates a list from an array. The array and its size are passed as parameters.
	public S_LinkedList(int[] a, int size)
	{
		ListNode newNode = null;
		ListNode nextNode = null;
		int n = size;
		for (int i = 0; i < n; i++)
		{
			newNode = new D_ListNode(a[n-1 - i], nextNode);
			nextNode = newNode;
		}
      head = newNode;
	}
	
    
	// METHODS	
	
/*	
	// postcondition: Returns int stored at head of this list.
	public int getFirst()
	{
		// Your code goes here
	}
	
	// postcondition: Returns int stored at end of this list.
	public int getLast()
	{
		// Your code goes here
	}
	
	// postcondition: Returns the length of this list.
	public int getSize()
	{
		// Your code goes here
	}
	
	// postcondition: Adds a node storing val at front of this list.
	public void addFirst(int val)
	{
		// Your code goes here
	}

	// postcondition: Adds a node storing val at end of this list.
	public void addLast(int val)
	{
		// Your code goes here
	}
	
	// postcondition: returns true if list is empty.
    public boolean isEmpty()
    {
        // your code goes here
    } 
	
	// postcondition: adds a node with value val after position index, if it exists
	void addAfterPos(int val, int index) 
	{
		// Your code goes here
	}
	
	// postcondition: retrieves data in node located at position index, if it exists
	int getAtPos(int index) 
	{
		// Your code goes here
	}
	
	// postcondition: deletes the nth node in the list, if it exists
	void delete(int n) 
	{
		// Your code goes here
	}
	
	// postcondition: returns a pointer to the node containing n, or null if not found
	ListNode searchPointer(int n) 
	{
		// Your code goes here
	}
	
	// postcondition: returns a one-based index to node containing n, or -1 if not found
	int searchIndex(int n) 
	{
		// Your code goes here
	}
*/	
	// HELPER METHODS
  
 	// precondition: The last link node has a null link.
    // postcondition: Returns a string formed by concatenating the 
    //	data fields of all list nodes.
    @Override
    public String toString()
    {
        String result = "";
        ListNode current = head;
        while (current != null)
        {
            result = result + current.data + "\n";
            current = current.link;
        }
        return result;
    }   
 
    public String ordinality(int n)
    {
        String pos;
          
        if ((n%10 == 1) && (n != 11))
            pos = "st";
        else if ((n%10 == 2) && (n != 12))
            pos = "nd";
        else if ((n%10 == 3) && (n != 13))
            pos = "rd";
        else
            pos = "th";
        
        return pos;
    }
	
} // end of class S_LinkedList

