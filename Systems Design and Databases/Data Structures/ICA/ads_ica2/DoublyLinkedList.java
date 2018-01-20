package ads_ica2;

/* THIS IS ONE OF THE FILES YOU NEED TO FILL IN. */

/**
 * Represents a doubly linked list.
 * 
 * @author Saul Johnson (saul.johnson@tees.ac.uk)
 * @author Eudes Diemoz (e.diemoz@tees.ac.uk)
 * @since 23/04/2017
 */
public class DoublyLinkedList
{
    /**
     * Stores the first node in the list.
     */
    DoublyLinkedListNode head;

    /**
     * Creates a new doubly linked list.
     */
    public DoublyLinkedList()
    {
        /* We want to create an empty list. An empty list has a null `head` (that is, 0 elements). This method is given 
           to you. Do not modify it. */
           
        head = null;
    }
      
    /**
     * Creates a new doubly linked list from an existing array.
     *
     * @param array the array to create the new linked list from
     */
    public DoublyLinkedList(int[] array)
    {
        /* We need to loop over the array of integers given to us in `array` and add them as list nodes, one at a time. 
           This method is given to you. Do not modify it. */
           
        for (int i = array.length - 1; i >= 0; i--)
        {
            DoublyLinkedListNode newNode = new DoublyLinkedListNode(array[i], head, null);
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        }
    }

    /**
     * Adds a node containing the given data at the end of this list.
     *
     * @param data  the data to add
     */
    public void addLast(int data)
    {
        // Add a node at the end of the list.
        // FILL THIS IN.
		DoublyLinkedListNode current = head;
        while(current.next != null)
        {
            current = current.next;
        }
			DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
			current.next = newNode;
			newNode.prev = current;
	}

    /**
     * Returns the last value in this list.
     *
     * @return  the last value in this list
     */
    public int getLast()
    {
        // Retrieve the data stored in the last node of the list, if it exists. Otherwise return 999.
        DoublyLinkedListNode current = head;
            int last = 0;
            while(current.next != null)
			{
                current = current.next;
            }
			if (current.next == null)
			{
            last = current.data;
            return last;
			}
			return 999;
    }

    /**
     * Adds a containing the given data after the given position index in the list.
     *
     * @param data  the data to add
     * @param index the index to add the new node after
     * @return      true on successful insert, otherwise false
     */
    public boolean addAfterPos(int data, int index)
    {
        // Adds a node after position `index`, if it exists, and returns true. Returns false on failure.
        int counter = 1;
        DoublyLinkedListNode current = head;
            while(current != null)
			{
                    if(counter == index)
                    {
                        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
						DoublyLinkedListNode nextNode = current.next;
						newNode.next = nextNode;
						newNode.prev = current;
                        current.next = newNode;
						nextNode.prev = newNode;
                        return true;
                    }
                        current = current.next;
                        counter++;
			}
		return false;
    }
    
    /**
     * Returns a string with the data of all nodes starting from the last node.
     *
     * @return  the list reversed, represented as a comma-separated string
     */
    public String toString_in_reverse()
    {
        // Returns a string with the data of all nodes starting from the last node. 
        String list = "";
        DoublyLinkedListNode current = head;
        while(current.next != null)
		{
            current = current.next;    
        }
        while(current != null)
		{
            if(current.prev!=null)
			{ 
            list = list + current.data +", ";
            }
            else
            {
                list = list + current.data;
            }
            current = current.prev;
        }
		return list;
    }
} 
