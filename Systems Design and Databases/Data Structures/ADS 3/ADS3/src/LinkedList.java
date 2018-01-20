// D_LinkedList.java
// program to demonstrate the implementation and use of a doubly linked-list in java
// adapted from Problem Solving with Java by Elliot Koffman and Ursula Woltz
// ADS class
// March 2017

public class LinkedList
{
    // DATA fields (member variable)
    
    ListNode head;	// pointer to first node in list

    
    // CONSTRUCTORS
    
    // default constructor - creates an empty list
    public LinkedList()
    {
        head = null;
    }
  
    
    // Constructor - creates a list from an array. The array and its size are passed as parameters.
    public LinkedList(int[] a, int size)
    {
        ListNode newNode = null;
        ListNode prevNode = null;
        int n = size;
        for (int i = 0; i < n; i++)
        {
            newNode = new ListNode(a[n-1 - i], prevNode, null);
            if (prevNode != null)
                prevNode.prev = newNode;
            prevNode = newNode;
        }
        head = newNode;
    }

    // METHODS
    
 /*   
		// postcondition: Returns int stored at head of this list.
    public int getFirst()
    {
        // your code goes here
    }

    
    // postcondition: Returns int stored at end of this list.
    public int getLast()
    {
        // your code goes here
    }
    
    
    // postcondition: Returns the length of this list.
    public int getSize()
    {
        // your code goes here
    }
    
    
    // postcondition: Adds a node storing obj at front of this list.
    public void addFirst(int obj)
    {
        // your code goes here
    }

    
    // postcondition: Adds a node storing obj at end of this list.
    public void addLast(int obj)
    {
        // your code goes here
    }

    
    // postcondition: returns true if list is empty, not counting the dummy node.
    public boolean isEmpty()
    {
        // your code goes here
    } 
    
    
    // precondition: The last link node has a null link.
    // postcondition: Returns a string formed by concatenating the 
    //	data fields of all list nodes, starting from the last node.
    public String toString_in_reverse()
    {
        // your code goes here
    }
    
    
    // postcondition: Adds a node storing obj after position index in list.
    public boolean addAfterPos(int obj, int index)
    {
        // your code goes here
    }


    // postcondition: retrieves the data stored in node at position index of list.
    public int getAtPos(int index)
    {
        // your code goes here
    }
    
    
    // precondition: list is pointed to by head; last node, if any, points to null
    // postcondition: nth node is deleted if it exists. A 1-based index is used
    public boolean delete(int n)
    {
        // your code goes here
    }// end of delete() method
    
    
    // precondition: list is pointed to by head; last node, if any, points to null
    // postcondition: returns a pointer to node containing a desired value, or null if not found
    public D_ListNode searchPointer(int n)
    {
        // your code goes here
    }// end of method searchPointer()
    
    
    // precondition: list is pointed to by head; last node, if any, points to null
    // postcondition: returns a one-based index to node containing a desired value, or -1 if not found
    public int searchIndex(int n)
    {
        // your code goes here
    }// end of method searchIndex()
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
            current = current.next;
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
        
} // end of class D_LinkedList
