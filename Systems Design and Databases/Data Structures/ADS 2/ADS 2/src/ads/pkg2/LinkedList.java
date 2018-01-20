package ads.pkg2;

// LinkedList.java
// program demonstrating the implementation and use of a singly linked-list in java
// Adapted from Problem Solving with Java by Elliot Koffman and Ursula Woltz
// ADS class
// March 2017

public class LinkedList
{
	
	// DATA field (member variable)
	
	ListNode head;		// first list node
	int size = 0;
	// CONSTRUCTORS
	
	// default constructor, creates an empty linked-list
	public LinkedList()
	{
		head = null;
	}
	
	// Constructor - creates a list from an array. The array and its size are passed as parameters.
	public LinkedList(int[] a, int size)
	{
		ListNode newNode = null;
		ListNode nextNode = null;
		int n = size;
                this.size = size;
		for (int i = 0; i < n; i++)
		{
			newNode = new ListNode(a[n-1 - i], nextNode);
			nextNode = newNode;
		}
                head = newNode;
	}
	
    
	
	
	
	// postcondition: Returns int stored at head of this list.
	public int getFirst()
	{
        return head.data;
                    
	}
	
	// postcondition: Returns int stored at end of this list.
	public int getLast()
	{
            ListNode current = head;
            int last = 0;
            
            while(current.link != null){
                
                current = current.link;
                last = current.data;
            }
            return last;
	}
	
	//postcondition: Returns the length of this list.
	public int getSize()
	{
            int count = 1;
            ListNode current = head;
            
            if(current == null)
            {
                return 0;
            }
            
            while(current.link != null)
            {
                count++;
                current = current.link;
            }
            
            return count;
	}
	
	// postcondition: Adds a node storing val at front of this list.
	public void addFirst(int val)
	{
            
            if(head == null)
            {
                head = new ListNode(val);
            }

            else
            {
                ListNode current = head;
                head= new ListNode(val,current);

            }
            
	}

	// postcondition: Adds a node storing val at end of this list.
	public void addLast(int val)
	{
            ListNode current = head;
            int index = 1;
            
            while(current.link != null)
            {
                current = current.link;
                index++;
            }
            ListNode lastNode = new ListNode(val);
            
            if(index == 1)
            {
                head = lastNode;
            }else
            {
                current.link = lastNode;     
            }
            
            
	}
	
	// postcondition: returns true if list is empty.
        public boolean isEmpty()
        {
            if(head == null)
            {
                return true;
            }
            else
            {
                return false;
            }
        
            
        } 
	
	// postcondition: adds a node with value val after position index, if it exists
	void addAfterPos(int val, int index) 
	{
        int count = 1;
        
            ListNode current = head;
            while(current != null){
                if(count == index-1){
                    
                    ListNode newNode = new ListNode(val);
                    newNode.link = current.link;
                    current.link = newNode;
                    
                }
                current = current.link;
                count++;
            }
        
        
        
	}
	
	// postcondition: retrieves data in node located at position index, if it exists
	int getAtPos(int index) 
	{
            int count = 1;
            ListNode current = head;
            while(current != null){
                if(count == index){
                    return current.data;
                }
                
                
                current = current.link;
                count++;
            }
	return 1;	
	}
	
	// postcondition: deletes the nth node in the list, if it exists
	void delete(int n) 
	{
           int count = 1;
           ListNode current = head;
           if(n == 1){
           ListNode newHead = head.link;
           head= newHead;
           
           }
           else
           {
               while(current != null)
               {
                   if(count == n-1){
                       
                       ListNode toDelete = current.link;
                       current.link = toDelete.link;
                       toDelete = null;
    
                   }
                   current = current.link;
                   count++;
               }
           }
	}
	
	// postcondition: returns a pointer to the node containing n, or null if not found
	ListNode searchPointer(int n) 
	{
            ListNode current = head;
            	while(current!= null){
                    if(current.data == n){
                        return current;
                    }
                    current = current.link;
                }
                return null;
	}
	
	// postcondition: returns a one-based index to node containing n, or -1 if not found
	int searchIndex(int n) 
	{
            int count = 0;
            ListNode current = head;
            while(current != null){
                count++;
                if(current.data == n){
                    return count;
                }
                current = current.link;
            }
		return count;
	}

	// HELPER METHODS
  
 	// precondition: The last link node has a null link.
        // postcondition: Returns a string formed by concatenating the 
        //	data fields of all list nodes.
        
    
    public String toString()
    {
        String result = "";
        ListNode current = head;
        
        while (current != null)
        {
            result = result + current.data + " ";
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
	
} // end of class LinkedList

